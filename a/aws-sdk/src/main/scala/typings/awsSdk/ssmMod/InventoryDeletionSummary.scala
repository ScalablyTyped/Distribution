package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InventoryDeletionSummary extends StObject {
  
  /**
    * Remaining number of items to delete.
    */
  var RemainingCount: js.UndefOr[typings.awsSdk.ssmMod.RemainingCount] = js.native
  
  /**
    * A list of counts and versions for deleted items.
    */
  var SummaryItems: js.UndefOr[InventoryDeletionSummaryItems] = js.native
  
  /**
    * The total number of items to delete. This count does not change during the delete operation.
    */
  var TotalCount: js.UndefOr[typings.awsSdk.ssmMod.TotalCount] = js.native
}
object InventoryDeletionSummary {
  
  @scala.inline
  def apply(): InventoryDeletionSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InventoryDeletionSummary]
  }
  
  @scala.inline
  implicit class InventoryDeletionSummaryMutableBuilder[Self <: InventoryDeletionSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRemainingCount(value: RemainingCount): Self = StObject.set(x, "RemainingCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemainingCountUndefined: Self = StObject.set(x, "RemainingCount", js.undefined)
    
    @scala.inline
    def setSummaryItems(value: InventoryDeletionSummaryItems): Self = StObject.set(x, "SummaryItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummaryItemsUndefined: Self = StObject.set(x, "SummaryItems", js.undefined)
    
    @scala.inline
    def setSummaryItemsVarargs(value: InventoryDeletionSummaryItem*): Self = StObject.set(x, "SummaryItems", js.Array(value :_*))
    
    @scala.inline
    def setTotalCount(value: TotalCount): Self = StObject.set(x, "TotalCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalCountUndefined: Self = StObject.set(x, "TotalCount", js.undefined)
  }
}
