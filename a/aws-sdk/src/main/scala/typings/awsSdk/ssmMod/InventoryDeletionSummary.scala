package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InventoryDeletionSummary extends js.Object {
  
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
  implicit class InventoryDeletionSummaryOps[Self <: InventoryDeletionSummary] (val x: Self) extends AnyVal {
    
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
    def setRemainingCount(value: RemainingCount): Self = this.set("RemainingCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemainingCount: Self = this.set("RemainingCount", js.undefined)
    
    @scala.inline
    def setSummaryItemsVarargs(value: InventoryDeletionSummaryItem*): Self = this.set("SummaryItems", js.Array(value :_*))
    
    @scala.inline
    def setSummaryItems(value: InventoryDeletionSummaryItems): Self = this.set("SummaryItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSummaryItems: Self = this.set("SummaryItems", js.undefined)
    
    @scala.inline
    def setTotalCount(value: TotalCount): Self = this.set("TotalCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalCount: Self = this.set("TotalCount", js.undefined)
  }
}
