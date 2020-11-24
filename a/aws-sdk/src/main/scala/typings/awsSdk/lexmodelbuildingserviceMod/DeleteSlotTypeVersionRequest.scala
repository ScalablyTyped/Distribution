package typings.awsSdk.lexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteSlotTypeVersionRequest extends js.Object {
  
  /**
    * The name of the slot type.
    */
  var name: SlotTypeName = js.native
  
  /**
    * The version of the slot type to delete. You cannot delete the $LATEST version of the slot type. To delete the $LATEST version, use the DeleteSlotType operation.
    */
  var version: NumericalVersion = js.native
}
object DeleteSlotTypeVersionRequest {
  
  @scala.inline
  def apply(name: SlotTypeName, version: NumericalVersion): DeleteSlotTypeVersionRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSlotTypeVersionRequest]
  }
  
  @scala.inline
  implicit class DeleteSlotTypeVersionRequestOps[Self <: DeleteSlotTypeVersionRequest] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setVersion(value: NumericalVersion): Self = this.set("version", value.asInstanceOf[js.Any])
  }
}
