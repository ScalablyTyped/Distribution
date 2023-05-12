package typings.awsSdk2Types.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InventoryDeletionSummaryItem extends StObject {
  
  /**
    * A count of the number of deleted items.
    */
  var Count: js.UndefOr[ResourceCount] = js.undefined
  
  /**
    * The remaining number of items to delete.
    */
  var RemainingCount: js.UndefOr[typings.awsSdk2Types.clientsSsmMod.RemainingCount] = js.undefined
  
  /**
    * The inventory type version.
    */
  var Version: js.UndefOr[InventoryItemSchemaVersion] = js.undefined
}
object InventoryDeletionSummaryItem {
  
  inline def apply(): InventoryDeletionSummaryItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InventoryDeletionSummaryItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InventoryDeletionSummaryItem] (val x: Self) extends AnyVal {
    
    inline def setCount(value: ResourceCount): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "Count", js.undefined)
    
    inline def setRemainingCount(value: RemainingCount): Self = StObject.set(x, "RemainingCount", value.asInstanceOf[js.Any])
    
    inline def setRemainingCountUndefined: Self = StObject.set(x, "RemainingCount", js.undefined)
    
    inline def setVersion(value: InventoryItemSchemaVersion): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
  }
}
