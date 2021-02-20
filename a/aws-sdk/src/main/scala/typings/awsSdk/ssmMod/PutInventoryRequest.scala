package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutInventoryRequest extends StObject {
  
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
  implicit class PutInventoryRequestMutableBuilder[Self <: PutInventoryRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItems(value: InventoryItemList): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: InventoryItem*): Self = StObject.set(x, "Items", js.Array(value :_*))
  }
}
