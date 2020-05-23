package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LabelCountersForWorkteam extends js.Object {
  /**
    * The total number of data objects labeled by a human worker.
    */
  var HumanLabeled: js.UndefOr[LabelCounter] = js.native
  /**
    * The total number of data objects that need to be labeled by a human worker.
    */
  var PendingHuman: js.UndefOr[LabelCounter] = js.native
  /**
    * The total number of tasks in the labeling job.
    */
  var Total: js.UndefOr[LabelCounter] = js.native
}

object LabelCountersForWorkteam {
  @scala.inline
  def apply(
    HumanLabeled: js.UndefOr[LabelCounter] = js.undefined,
    PendingHuman: js.UndefOr[LabelCounter] = js.undefined,
    Total: js.UndefOr[LabelCounter] = js.undefined
  ): LabelCountersForWorkteam = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(HumanLabeled)) __obj.updateDynamic("HumanLabeled")(HumanLabeled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(PendingHuman)) __obj.updateDynamic("PendingHuman")(PendingHuman.get.asInstanceOf[js.Any])
    if (!js.isUndefined(Total)) __obj.updateDynamic("Total")(Total.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelCountersForWorkteam]
  }
}

