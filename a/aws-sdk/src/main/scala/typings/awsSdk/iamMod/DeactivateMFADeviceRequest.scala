package typings.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeactivateMFADeviceRequest extends StObject {
  
  /**
    * The serial number that uniquely identifies the MFA device. For virtual MFA devices, the serial number is the device ARN. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: =,.@:/-
    */
  var SerialNumber: serialNumberType
  
  /**
    * The name of the user whose MFA device you want to deactivate. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var UserName: existingUserNameType
}
object DeactivateMFADeviceRequest {
  
  @scala.inline
  def apply(SerialNumber: serialNumberType, UserName: existingUserNameType): DeactivateMFADeviceRequest = {
    val __obj = js.Dynamic.literal(SerialNumber = SerialNumber.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeactivateMFADeviceRequest]
  }
  
  @scala.inline
  implicit class DeactivateMFADeviceRequestMutableBuilder[Self <: DeactivateMFADeviceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSerialNumber(value: serialNumberType): Self = StObject.set(x, "SerialNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserName(value: existingUserNameType): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
  }
}
