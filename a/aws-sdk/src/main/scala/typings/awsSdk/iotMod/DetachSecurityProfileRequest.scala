package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DetachSecurityProfileRequest extends StObject {
  
  /**
    * The security profile that is detached.
    */
  var securityProfileName: SecurityProfileName = js.native
  
  /**
    * The ARN of the thing group from which the security profile is detached.
    */
  var securityProfileTargetArn: SecurityProfileTargetArn = js.native
}
object DetachSecurityProfileRequest {
  
  @scala.inline
  def apply(securityProfileName: SecurityProfileName, securityProfileTargetArn: SecurityProfileTargetArn): DetachSecurityProfileRequest = {
    val __obj = js.Dynamic.literal(securityProfileName = securityProfileName.asInstanceOf[js.Any], securityProfileTargetArn = securityProfileTargetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetachSecurityProfileRequest]
  }
  
  @scala.inline
  implicit class DetachSecurityProfileRequestMutableBuilder[Self <: DetachSecurityProfileRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSecurityProfileName(value: SecurityProfileName): Self = StObject.set(x, "securityProfileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityProfileTargetArn(value: SecurityProfileTargetArn): Self = StObject.set(x, "securityProfileTargetArn", value.asInstanceOf[js.Any])
  }
}
