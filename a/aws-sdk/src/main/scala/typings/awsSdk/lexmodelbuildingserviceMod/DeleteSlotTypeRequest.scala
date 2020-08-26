package typings.awsSdk.lexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteSlotTypeRequest extends js.Object {
  /**
    * The name of the slot type. The name is case sensitive. 
    */
  var name: SlotTypeName = js.native
}

object DeleteSlotTypeRequest {
  @scala.inline
  def apply(name: SlotTypeName): DeleteSlotTypeRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSlotTypeRequest]
  }
  @scala.inline
  implicit class DeleteSlotTypeRequestOps[Self <: DeleteSlotTypeRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setName(value: SlotTypeName): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

