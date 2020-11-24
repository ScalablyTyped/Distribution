package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RejectInputDeviceTransferRequest extends js.Object {
  
  /**
    * The unique ID of the input device to reject. For example, hd-123456789abcdef.
    */
  var InputDeviceId: string = js.native
}
object RejectInputDeviceTransferRequest {
  
  @scala.inline
  def apply(InputDeviceId: string): RejectInputDeviceTransferRequest = {
    val __obj = js.Dynamic.literal(InputDeviceId = InputDeviceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RejectInputDeviceTransferRequest]
  }
  
  @scala.inline
  implicit class RejectInputDeviceTransferRequestOps[Self <: RejectInputDeviceTransferRequest] (val x: Self) extends AnyVal {
    
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
