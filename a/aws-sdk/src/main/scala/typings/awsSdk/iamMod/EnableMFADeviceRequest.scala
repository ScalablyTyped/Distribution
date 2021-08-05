package typings.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnableMFADeviceRequest extends StObject {
  
  /**
    * An authentication code emitted by the device.  The format for this parameter is a string of six digits.  Submit your request immediately after generating the authentication codes. If you generate the codes and then wait too long to submit the request, the MFA device successfully associates with the user but the MFA device becomes out of sync. This happens because time-based one-time passwords (TOTP) expire after a short period of time. If this happens, you can resync the device. 
    */
  var AuthenticationCode1: authenticationCodeType
  
  /**
    * A subsequent authentication code emitted by the device. The format for this parameter is a string of six digits.  Submit your request immediately after generating the authentication codes. If you generate the codes and then wait too long to submit the request, the MFA device successfully associates with the user but the MFA device becomes out of sync. This happens because time-based one-time passwords (TOTP) expire after a short period of time. If this happens, you can resync the device. 
    */
  var AuthenticationCode2: authenticationCodeType
  
  /**
    * The serial number that uniquely identifies the MFA device. For virtual MFA devices, the serial number is the device ARN. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: =,.@:/-
    */
  var SerialNumber: serialNumberType
  
  /**
    * The name of the IAM user for whom you want to enable the MFA device. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var UserName: existingUserNameType
}
object EnableMFADeviceRequest {
  
  inline def apply(
    AuthenticationCode1: authenticationCodeType,
    AuthenticationCode2: authenticationCodeType,
    SerialNumber: serialNumberType,
    UserName: existingUserNameType
  ): EnableMFADeviceRequest = {
    val __obj = js.Dynamic.literal(AuthenticationCode1 = AuthenticationCode1.asInstanceOf[js.Any], AuthenticationCode2 = AuthenticationCode2.asInstanceOf[js.Any], SerialNumber = SerialNumber.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnableMFADeviceRequest]
  }
  
  extension [Self <: EnableMFADeviceRequest](x: Self) {
    
    inline def setAuthenticationCode1(value: authenticationCodeType): Self = StObject.set(x, "AuthenticationCode1", value.asInstanceOf[js.Any])
    
    inline def setAuthenticationCode2(value: authenticationCodeType): Self = StObject.set(x, "AuthenticationCode2", value.asInstanceOf[js.Any])
    
    inline def setSerialNumber(value: serialNumberType): Self = StObject.set(x, "SerialNumber", value.asInstanceOf[js.Any])
    
    inline def setUserName(value: existingUserNameType): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
  }
}
