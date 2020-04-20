package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutInventoryRequest extends js.Object {
  /**
    * An instance ID where you want to add or update inventory items.
    */
  var InstanceId: typings.awsSdk.ssmMod.InstanceId = js.native
  /**
    * The inventory items that you want to add or update on instances.
    */
  var Items: InventoryItemList = js.native
}

object PutInventoryRequest {
  @scala.inline
  def apply(InstanceId: InstanceId, Items: InventoryItemList): PutInventoryRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any], Items = Items.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutInventoryRequest]
  }
}

