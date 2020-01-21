package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InventoryDeletionSummaryItem extends js.Object {
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
  def apply(
    Count: Int | Double = null,
    RemainingCount: Int | Double = null,
    Version: InventoryItemSchemaVersion = null
  ): InventoryDeletionSummaryItem = {
    val __obj = js.Dynamic.literal()
    if (Count != null) __obj.updateDynamic("Count")(Count.asInstanceOf[js.Any])
    if (RemainingCount != null) __obj.updateDynamic("RemainingCount")(RemainingCount.asInstanceOf[js.Any])
    if (Version != null) __obj.updateDynamic("Version")(Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[InventoryDeletionSummaryItem]
  }
}

