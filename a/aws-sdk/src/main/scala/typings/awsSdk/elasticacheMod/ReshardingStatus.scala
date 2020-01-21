package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReshardingStatus extends js.Object {
  /**
    * Represents the progress of an online resharding operation.
    */
  var SlotMigration: js.UndefOr[typings.awsSdk.elasticacheMod.SlotMigration] = js.native
}

object ReshardingStatus {
  @scala.inline
  def apply(SlotMigration: SlotMigration = null): ReshardingStatus = {
    val __obj = js.Dynamic.literal()
    if (SlotMigration != null) __obj.updateDynamic("SlotMigration")(SlotMigration.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReshardingStatus]
  }
}

