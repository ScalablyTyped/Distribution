package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteSecurityProfileRequest extends StObject {
  
  /**
    * The expected version of the security profile. A new version is generated whenever the security profile is updated. If you specify a value that is different from the actual version, a VersionConflictException is thrown.
    */
  var expectedVersion: js.UndefOr[OptionalVersion] = js.undefined
  
  /**
    * The name of the security profile to be deleted.
    */
  var securityProfileName: SecurityProfileName
}
object DeleteSecurityProfileRequest {
  
  @scala.inline
  def apply(securityProfileName: SecurityProfileName): DeleteSecurityProfileRequest = {
    val __obj = js.Dynamic.literal(securityProfileName = securityProfileName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSecurityProfileRequest]
  }
  
  @scala.inline
  implicit class DeleteSecurityProfileRequestMutableBuilder[Self <: DeleteSecurityProfileRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpectedVersion(value: OptionalVersion): Self = StObject.set(x, "expectedVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpectedVersionUndefined: Self = StObject.set(x, "expectedVersion", js.undefined)
    
    @scala.inline
    def setSecurityProfileName(value: SecurityProfileName): Self = StObject.set(x, "securityProfileName", value.asInstanceOf[js.Any])
  }
}
