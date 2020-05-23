package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    RemainingCount: js.UndefOr[RemainingCount] = js.undefined,
    SummaryItems: InventoryDeletionSummaryItems = null,
    TotalCount: js.UndefOr[TotalCount] = js.undefined
  ): InventoryDeletionSummary = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(RemainingCount)) __obj.updateDynamic("RemainingCount")(RemainingCount.get.asInstanceOf[js.Any])
    if (SummaryItems != null) __obj.updateDynamic("SummaryItems")(SummaryItems.asInstanceOf[js.Any])
    if (!js.isUndefined(TotalCount)) __obj.updateDynamic("TotalCount")(TotalCount.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[InventoryDeletionSummary]
  }
}

