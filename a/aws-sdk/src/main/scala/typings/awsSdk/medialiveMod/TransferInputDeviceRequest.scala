package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransferInputDeviceRequest extends js.Object {
  
  /**
    * The unique ID of this input device. For example, hd-123456789abcdef.
    */
  var InputDeviceId: string = js.native
  
  /**
    * The AWS account ID (12 digits) for the recipient of the device transfer.
    */
  var TargetCustomerId: js.UndefOr[string] = js.native
  
  /**
    * An optional message for the recipient. Maximum 280 characters.
    */
  var TransferMessage: js.UndefOr[string] = js.native
}
object TransferInputDeviceRequest {
  
  @scala.inline
  def apply(InputDeviceId: string): TransferInputDeviceRequest = {
    val __obj = js.Dynamic.literal(InputDeviceId = InputDeviceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransferInputDeviceRequest]
  }
  
  @scala.inline
  implicit class TransferInputDeviceRequestOps[Self <: TransferInputDeviceRequest] (val x: Self) extends AnyVal {
    
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
    def setInputDeviceId(value: string): Self = this.set("InputDeviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetCustomerId(value: string): Self = this.set("TargetCustomerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetCustomerId: Self = this.set("TargetCustomerId", js.undefined)
    
    @scala.inline
    def setTransferMessage(value: string): Self = this.set("TransferMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransferMessage: Self = this.set("TransferMessage", js.undefined)
  }
}
