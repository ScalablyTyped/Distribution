package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SlotMigration extends js.Object {
  /**
    * The percentage of the slot migration that is complete.
    */
  var ProgressPercentage: js.UndefOr[Double] = js.native
}

object SlotMigration {
  @scala.inline
  def apply(ProgressPercentage: js.UndefOr[Double] = js.undefined): SlotMigration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ProgressPercentage)) __obj.updateDynamic("ProgressPercentage")(ProgressPercentage.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlotMigration]
  }
}

