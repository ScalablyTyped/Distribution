package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateVirtualMFADeviceRequest extends js.Object {
  
  /**
    *  The path for the virtual MFA device. For more information about paths, see IAM Identifiers in the IAM User Guide. This parameter is optional. If it is not included, it defaults to a slash (/). This parameter allows (through its regex pattern) a string of characters consisting of either a forward slash (/) by itself or a string that must begin and end with forward slashes. In addition, it can contain any ASCII character from the ! (\\u0021) through the DEL character (\\u007F), including most punctuation characters, digits, and upper and lowercased letters.
    */
  var Path: js.UndefOr[pathType] = js.native
  
  /**
    * The name of the virtual MFA device. Use with path to uniquely identify a virtual MFA device. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var VirtualMFADeviceName: virtualMFADeviceName = js.native
}
object CreateVirtualMFADeviceRequest {
  
  @scala.inline
  def apply(VirtualMFADeviceName: virtualMFADeviceName): CreateVirtualMFADeviceRequest = {
    val __obj = js.Dynamic.literal(VirtualMFADeviceName = VirtualMFADeviceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateVirtualMFADeviceRequest]
  }
  
  @scala.inline
  implicit class CreateVirtualMFADeviceRequestOps[Self <: CreateVirtualMFADeviceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setVirtualMFADeviceName(value: virtualMFADeviceName): Self = this.set("VirtualMFADeviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: pathType): Self = this.set("Path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("Path", js.undefined)
  }
}
