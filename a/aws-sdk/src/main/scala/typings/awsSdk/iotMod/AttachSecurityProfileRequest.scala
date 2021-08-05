package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttachSecurityProfileRequest extends StObject {
  
  /**
    * The security profile that is attached.
    */
  var securityProfileName: SecurityProfileName
  
  /**
    * The ARN of the target (thing group) to which the security profile is attached.
    */
  var securityProfileTargetArn: SecurityProfileTargetArn
}
object AttachSecurityProfileRequest {
  
  inline def apply(securityProfileName: SecurityProfileName, securityProfileTargetArn: SecurityProfileTargetArn): AttachSecurityProfileRequest = {
    val __obj = js.Dynamic.literal(securityProfileName = securityProfileName.asInstanceOf[js.Any], securityProfileTargetArn = securityProfileTargetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachSecurityProfileRequest]
  }
  
  extension [Self <: AttachSecurityProfileRequest](x: Self) {
    
    inline def setSecurityProfileName(value: SecurityProfileName): Self = StObject.set(x, "securityProfileName", value.asInstanceOf[js.Any])
    
    inline def setSecurityProfileTargetArn(value: SecurityProfileTargetArn): Self = StObject.set(x, "securityProfileTargetArn", value.asInstanceOf[js.Any])
  }
}
