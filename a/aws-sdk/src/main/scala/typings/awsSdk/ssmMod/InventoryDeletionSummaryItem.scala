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
  def apply(): InventoryDeletionSummaryItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InventoryDeletionSummaryItem]
  }
  @scala.inline
  implicit class InventoryDeletionSummaryItemOps[Self <: InventoryDeletionSummaryItem] (val x: Self) extends AnyVal {
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
    def setCount(value: ResourceCount): Self = this.set("Count", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCount: Self = this.set("Count", js.undefined)
    @scala.inline
    def setRemainingCount(value: RemainingCount): Self = this.set("RemainingCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemainingCount: Self = this.set("RemainingCount", js.undefined)
    @scala.inline
    def setVersion(value: InventoryItemSchemaVersion): Self = this.set("Version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("Version", js.undefined)
  }
  
}

