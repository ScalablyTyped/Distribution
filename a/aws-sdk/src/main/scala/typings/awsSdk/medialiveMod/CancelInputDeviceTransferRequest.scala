package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CancelInputDeviceTransferRequest extends js.Object {
  
  /**
    * The unique ID of the input device to cancel. For example, hd-123456789abcdef.
    */
  var InputDeviceId: string = js.native
}
object CancelInputDeviceTransferRequest {
  
  @scala.inline
  def apply(InputDeviceId: string): CancelInputDeviceTransferRequest = {
    val __obj = js.Dynamic.literal(InputDeviceId = InputDeviceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelInputDeviceTransferRequest]
  }
  
  @scala.inline
  implicit class CancelInputDeviceTransferRequestOps[Self <: CancelInputDeviceTransferRequest] (val x: Self) extends AnyVal {
    
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
  }
}
