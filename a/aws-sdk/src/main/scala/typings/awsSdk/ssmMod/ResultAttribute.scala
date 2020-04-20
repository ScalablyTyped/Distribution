package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResultAttribute extends js.Object {
  /**
    * Name of the inventory item type. Valid value: AWS:InstanceInformation. Default Value: AWS:InstanceInformation.
    */
  var TypeName: InventoryItemTypeName = js.native
}

object ResultAttribute {
  @scala.inline
  def apply(TypeName: InventoryItemTypeName): ResultAttribute = {
    val __obj = js.Dynamic.literal(TypeName = TypeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultAttribute]
  }
}

