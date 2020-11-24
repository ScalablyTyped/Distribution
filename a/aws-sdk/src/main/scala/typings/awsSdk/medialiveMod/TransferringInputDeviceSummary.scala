package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransferringInputDeviceSummary extends js.Object {
  
  /**
    * The unique ID of the input device.
    */
  var Id: js.UndefOr[string] = js.native
  
  /**
    * The optional message that the sender has attached to the transfer.
    */
  var Message: js.UndefOr[string] = js.native
  
  /**
    * The AWS account ID for the recipient of the input device transfer.
    */
  var TargetCustomerId: js.UndefOr[string] = js.native
  
  /**
    * The type (direction) of the input device transfer.
    */
  var TransferType: js.UndefOr[InputDeviceTransferType] = js.native
}
object TransferringInputDeviceSummary {
  
  @scala.inline
  def apply(): TransferringInputDeviceSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransferringInputDeviceSummary]
  }
  
  @scala.inline
  implicit class TransferringInputDeviceSummaryOps[Self <: TransferringInputDeviceSummary] (val x: Self) extends AnyVal {
    
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
    def setId(value: string): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    
    @scala.inline
    def setMessage(value: string): Self = this.set("Message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("Message", js.undefined)
    
    @scala.inline
    def setTargetCustomerId(value: string): Self = this.set("TargetCustomerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetCustomerId: Self = this.set("TargetCustomerId", js.undefined)
    
    @scala.inline
    def setTransferType(value: InputDeviceTransferType): Self = this.set("TransferType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransferType: Self = this.set("TransferType", js.undefined)
  }
}
