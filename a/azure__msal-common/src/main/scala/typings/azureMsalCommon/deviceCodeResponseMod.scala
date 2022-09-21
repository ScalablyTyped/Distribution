package typings.azureMsalCommon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deviceCodeResponseMod {
  
  trait DeviceCodeResponse extends StObject {
    
    var deviceCode: String
    
    var expiresIn: Double
    
    var interval: Double
    
    var message: String
    
    var userCode: String
    
    var verificationUri: String
  }
  object DeviceCodeResponse {
    
    inline def apply(
      deviceCode: String,
      expiresIn: Double,
      interval: Double,
      message: String,
      userCode: String,
      verificationUri: String
    ): DeviceCodeResponse = {
      val __obj = js.Dynamic.literal(deviceCode = deviceCode.asInstanceOf[js.Any], expiresIn = expiresIn.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], userCode = userCode.asInstanceOf[js.Any], verificationUri = verificationUri.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeviceCodeResponse]
    }
    
    extension [Self <: DeviceCodeResponse](x: Self) {
      
      inline def setDeviceCode(value: String): Self = StObject.set(x, "deviceCode", value.asInstanceOf[js.Any])
      
      inline def setExpiresIn(value: Double): Self = StObject.set(x, "expiresIn", value.asInstanceOf[js.Any])
      
      inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setUserCode(value: String): Self = StObject.set(x, "userCode", value.asInstanceOf[js.Any])
      
      inline def setVerificationUri(value: String): Self = StObject.set(x, "verificationUri", value.asInstanceOf[js.Any])
    }
  }
  
  trait ServerDeviceCodeResponse extends StObject {
    
    var device_code: String
    
    var expires_in: Double
    
    var interval: Double
    
    var message: String
    
    var user_code: String
    
    var verification_uri: String
  }
  object ServerDeviceCodeResponse {
    
    inline def apply(
      device_code: String,
      expires_in: Double,
      interval: Double,
      message: String,
      user_code: String,
      verification_uri: String
    ): ServerDeviceCodeResponse = {
      val __obj = js.Dynamic.literal(device_code = device_code.asInstanceOf[js.Any], expires_in = expires_in.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], user_code = user_code.asInstanceOf[js.Any], verification_uri = verification_uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServerDeviceCodeResponse]
    }
    
    extension [Self <: ServerDeviceCodeResponse](x: Self) {
      
      inline def setDevice_code(value: String): Self = StObject.set(x, "device_code", value.asInstanceOf[js.Any])
      
      inline def setExpires_in(value: Double): Self = StObject.set(x, "expires_in", value.asInstanceOf[js.Any])
      
      inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setUser_code(value: String): Self = StObject.set(x, "user_code", value.asInstanceOf[js.Any])
      
      inline def setVerification_uri(value: String): Self = StObject.set(x, "verification_uri", value.asInstanceOf[js.Any])
    }
  }
}
