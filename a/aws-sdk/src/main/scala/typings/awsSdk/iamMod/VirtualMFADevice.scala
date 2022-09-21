package typings.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualMFADevice extends StObject {
  
  /**
    *  The base32 seed defined as specified in RFC3548. The Base32StringSeed is base64-encoded. 
    */
  var Base32StringSeed: js.UndefOr[BootstrapDatum] = js.undefined
  
  /**
    * The date and time on which the virtual MFA device was enabled.
    */
  var EnableDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  A QR code PNG image that encodes otpauth://totp/$virtualMFADeviceName@$AccountName?secret=$Base32String where $virtualMFADeviceName is one of the create call arguments. AccountName is the user name if set (otherwise, the account ID otherwise), and Base32String is the seed in base32 format. The Base32String value is base64-encoded. 
    */
  var QRCodePNG: js.UndefOr[BootstrapDatum] = js.undefined
  
  /**
    * The serial number associated with VirtualMFADevice.
    */
  var SerialNumber: serialNumberType
  
  /**
    * A list of tags that are attached to the virtual MFA device. For more information about tagging, see Tagging IAM resources in the IAM User Guide.
    */
  var Tags: js.UndefOr[tagListType] = js.undefined
  
  /**
    * The IAM user associated with this virtual MFA device.
    */
  var User: js.UndefOr[typings.awsSdk.iamMod.User] = js.undefined
}
object VirtualMFADevice {
  
  inline def apply(SerialNumber: serialNumberType): VirtualMFADevice = {
    val __obj = js.Dynamic.literal(SerialNumber = SerialNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualMFADevice]
  }
  
  extension [Self <: VirtualMFADevice](x: Self) {
    
    inline def setBase32StringSeed(value: BootstrapDatum): Self = StObject.set(x, "Base32StringSeed", value.asInstanceOf[js.Any])
    
    inline def setBase32StringSeedUndefined: Self = StObject.set(x, "Base32StringSeed", js.undefined)
    
    inline def setEnableDate(value: js.Date): Self = StObject.set(x, "EnableDate", value.asInstanceOf[js.Any])
    
    inline def setEnableDateUndefined: Self = StObject.set(x, "EnableDate", js.undefined)
    
    inline def setQRCodePNG(value: BootstrapDatum): Self = StObject.set(x, "QRCodePNG", value.asInstanceOf[js.Any])
    
    inline def setQRCodePNGUndefined: Self = StObject.set(x, "QRCodePNG", js.undefined)
    
    inline def setSerialNumber(value: serialNumberType): Self = StObject.set(x, "SerialNumber", value.asInstanceOf[js.Any])
    
    inline def setTags(value: tagListType): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setUser(value: User): Self = StObject.set(x, "User", value.asInstanceOf[js.Any])
    
    inline def setUserUndefined: Self = StObject.set(x, "User", js.undefined)
  }
}
