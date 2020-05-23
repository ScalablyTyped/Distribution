package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LabelCounters extends js.Object {
  /**
    * The total number of objects that could not be labeled due to an error.
    */
  var FailedNonRetryableError: js.UndefOr[LabelCounter] = js.native
  /**
    * The total number of objects labeled by a human worker.
    */
  var HumanLabeled: js.UndefOr[LabelCounter] = js.native
  /**
    * The total number of objects labeled by automated data labeling.
    */
  var MachineLabeled: js.UndefOr[LabelCounter] = js.native
  /**
    * The total number of objects labeled.
    */
  var TotalLabeled: js.UndefOr[LabelCounter] = js.native
  /**
    * The total number of objects not yet labeled.
    */
  var Unlabeled: js.UndefOr[LabelCounter] = js.native
}

object LabelCounters {
  @scala.inline
  def apply(
    FailedNonRetryableError: js.UndefOr[LabelCounter] = js.undefined,
    HumanLabeled: js.UndefOr[LabelCounter] = js.undefined,
    MachineLabeled: js.UndefOr[LabelCounter] = js.undefined,
    TotalLabeled: js.UndefOr[LabelCounter] = js.undefined,
    Unlabeled: js.UndefOr[LabelCounter] = js.undefined
  ): LabelCounters = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(FailedNonRetryableError)) __obj.updateDynamic("FailedNonRetryableError")(FailedNonRetryableError.get.asInstanceOf[js.Any])
    if (!js.isUndefined(HumanLabeled)) __obj.updateDynamic("HumanLabeled")(HumanLabeled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(MachineLabeled)) __obj.updateDynamic("MachineLabeled")(MachineLabeled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(TotalLabeled)) __obj.updateDynamic("TotalLabeled")(TotalLabeled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(Unlabeled)) __obj.updateDynamic("Unlabeled")(Unlabeled.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelCounters]
  }
}

