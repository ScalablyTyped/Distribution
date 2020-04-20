package typings.awsSdk.lexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
}

