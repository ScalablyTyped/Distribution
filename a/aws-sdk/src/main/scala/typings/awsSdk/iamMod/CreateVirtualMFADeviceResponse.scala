package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateVirtualMFADeviceResponse extends js.Object {
  
  /**
    * A structure containing details about the new virtual MFA device.
    */
  var VirtualMFADevice: typings.awsSdk.iamMod.VirtualMFADevice = js.native
}
object CreateVirtualMFADeviceResponse {
  
  @scala.inline
  def apply(VirtualMFADevice: VirtualMFADevice): CreateVirtualMFADeviceResponse = {
    val __obj = js.Dynamic.literal(VirtualMFADevice = VirtualMFADevice.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateVirtualMFADeviceResponse]
  }
  
  @scala.inline
  implicit class CreateVirtualMFADeviceResponseOps[Self <: CreateVirtualMFADeviceResponse] (val x: Self) extends AnyVal {
    
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
    def setVirtualMFADevice(value: VirtualMFADevice): Self = this.set("VirtualMFADevice", value.asInstanceOf[js.Any])
  }
}
