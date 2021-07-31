package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityProfileTargetMapping extends StObject {
  
  /**
    * Information that identifies the security profile.
    */
  var securityProfileIdentifier: js.UndefOr[SecurityProfileIdentifier] = js.undefined
  
  /**
    * Information about the target (thing group) associated with the security profile.
    */
  var target: js.UndefOr[SecurityProfileTarget] = js.undefined
}
object SecurityProfileTargetMapping {
  
  @scala.inline
  def apply(): SecurityProfileTargetMapping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityProfileTargetMapping]
  }
  
  @scala.inline
  implicit class SecurityProfileTargetMappingMutableBuilder[Self <: SecurityProfileTargetMapping] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSecurityProfileIdentifier(value: SecurityProfileIdentifier): Self = StObject.set(x, "securityProfileIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityProfileIdentifierUndefined: Self = StObject.set(x, "securityProfileIdentifier", js.undefined)
    
    @scala.inline
    def setTarget(value: SecurityProfileTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
