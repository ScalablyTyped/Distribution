package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  @scala.inline
  implicit class PutInventoryRequestOps[Self <: PutInventoryRequest] (val x: Self) extends AnyVal {
    
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
    def setInstanceId(value: InstanceId): Self = this.set("InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: InventoryItem*): Self = this.set("Items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: InventoryItemList): Self = this.set("Items", value.asInstanceOf[js.Any])
  }
}
