package typings.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResyncMFADeviceRequest extends StObject {
  
  /**
    * An authentication code emitted by the device. The format for this parameter is a sequence of six digits.
    */
  var AuthenticationCode1: authenticationCodeType
  
  /**
    * A subsequent authentication code emitted by the device. The format for this parameter is a sequence of six digits.
    */
  var AuthenticationCode2: authenticationCodeType
  
  /**
    * Serial number that uniquely identifies the MFA device. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var SerialNumber: serialNumberType
  
  /**
    * The name of the user whose MFA device you want to resynchronize. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var UserName: existingUserNameType
}
object ResyncMFADeviceRequest {
  
  @scala.inline
  def apply(
    AuthenticationCode1: authenticationCodeType,
    AuthenticationCode2: authenticationCodeType,
    SerialNumber: serialNumberType,
    UserName: existingUserNameType
  ): ResyncMFADeviceRequest = {
    val __obj = js.Dynamic.literal(AuthenticationCode1 = AuthenticationCode1.asInstanceOf[js.Any], AuthenticationCode2 = AuthenticationCode2.asInstanceOf[js.Any], SerialNumber = SerialNumber.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResyncMFADeviceRequest]
  }
  
  @scala.inline
  implicit class ResyncMFADeviceRequestMutableBuilder[Self <: ResyncMFADeviceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthenticationCode1(value: authenticationCodeType): Self = StObject.set(x, "AuthenticationCode1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthenticationCode2(value: authenticationCodeType): Self = StObject.set(x, "AuthenticationCode2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSerialNumber(value: serialNumberType): Self = StObject.set(x, "SerialNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserName(value: existingUserNameType): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
  }
}
