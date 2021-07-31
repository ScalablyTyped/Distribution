package typings.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MFADevice extends StObject {
  
  /**
    * The date when the MFA device was enabled for the user.
    */
  var EnableDate: dateType
  
  /**
    * The serial number that uniquely identifies the MFA device. For virtual MFA devices, the serial number is the device ARN.
    */
  var SerialNumber: serialNumberType
  
  /**
    * The user with whom the MFA device is associated.
    */
  var UserName: userNameType
}
object MFADevice {
  
  @scala.inline
  def apply(EnableDate: dateType, SerialNumber: serialNumberType, UserName: userNameType): MFADevice = {
    val __obj = js.Dynamic.literal(EnableDate = EnableDate.asInstanceOf[js.Any], SerialNumber = SerialNumber.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[MFADevice]
  }
  
  @scala.inline
  implicit class MFADeviceMutableBuilder[Self <: MFADevice] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnableDate(value: dateType): Self = StObject.set(x, "EnableDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSerialNumber(value: serialNumberType): Self = StObject.set(x, "SerialNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserName(value: userNameType): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
  }
}
