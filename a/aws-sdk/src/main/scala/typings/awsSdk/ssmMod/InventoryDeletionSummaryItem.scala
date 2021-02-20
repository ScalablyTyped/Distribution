package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InventoryDeletionSummaryItem extends StObject {
  
  /**
    * A count of the number of deleted items.
    */
  var Count: js.UndefOr[ResourceCount] = js.native
  
  /**
    * The remaining number of items to delete.
    */
  var RemainingCount: js.UndefOr[typings.awsSdk.ssmMod.RemainingCount] = js.native
  
  /**
    * The inventory type version.
    */
  var Version: js.UndefOr[InventoryItemSchemaVersion] = js.native
}
object InventoryDeletionSummaryItem {
  
  @scala.inline
  def apply(): InventoryDeletionSummaryItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InventoryDeletionSummaryItem]
  }
  
  @scala.inline
  implicit class InventoryDeletionSummaryItemMutableBuilder[Self <: InventoryDeletionSummaryItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: ResourceCount): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "Count", js.undefined)
    
    @scala.inline
    def setRemainingCount(value: RemainingCount): Self = StObject.set(x, "RemainingCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemainingCountUndefined: Self = StObject.set(x, "RemainingCount", js.undefined)
    
    @scala.inline
    def setVersion(value: InventoryItemSchemaVersion): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
  }
}
