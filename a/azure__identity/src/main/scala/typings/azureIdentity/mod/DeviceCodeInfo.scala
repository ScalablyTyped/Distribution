package typings.azureIdentity.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceCodeInfo extends StObject {
  
  /**
    * A message that may be shown to the user to instruct them on how to enter
    * the device code in the page specified by the verification URI.
    */
  var message: String
  
  /**
    * The device code that the user must enter into the verification page.
    */
  var userCode: String
  
  /**
    * The verification URI to which the user must navigate to enter the device
    * code.
    */
  var verificationUri: String
}
object DeviceCodeInfo {
  
  inline def apply(message: String, userCode: String, verificationUri: String): DeviceCodeInfo = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], userCode = userCode.asInstanceOf[js.Any], verificationUri = verificationUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceCodeInfo]
  }
  
  extension [Self <: DeviceCodeInfo](x: Self) {
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setUserCode(value: String): Self = StObject.set(x, "userCode", value.asInstanceOf[js.Any])
    
    inline def setVerificationUri(value: String): Self = StObject.set(x, "verificationUri", value.asInstanceOf[js.Any])
  }
}
