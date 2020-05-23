package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProgressCounters extends js.Object {
  /**
    * The total number of steps that the system cancelled in all specified AWS Regions and accounts for the current Automation execution.
    */
  var CancelledSteps: js.UndefOr[Integer] = js.native
  /**
    * The total number of steps that failed to run in all specified AWS Regions and accounts for the current Automation execution.
    */
  var FailedSteps: js.UndefOr[Integer] = js.native
  /**
    * The total number of steps that successfully completed in all specified AWS Regions and accounts for the current Automation execution.
    */
  var SuccessSteps: js.UndefOr[Integer] = js.native
  /**
    * The total number of steps that timed out in all specified AWS Regions and accounts for the current Automation execution.
    */
  var TimedOutSteps: js.UndefOr[Integer] = js.native
  /**
    * The total number of steps run in all specified AWS Regions and accounts for the current Automation execution.
    */
  var TotalSteps: js.UndefOr[Integer] = js.native
}

object ProgressCounters {
  @scala.inline
  def apply(
    CancelledSteps: js.UndefOr[Integer] = js.undefined,
    FailedSteps: js.UndefOr[Integer] = js.undefined,
    SuccessSteps: js.UndefOr[Integer] = js.undefined,
    TimedOutSteps: js.UndefOr[Integer] = js.undefined,
    TotalSteps: js.UndefOr[Integer] = js.undefined
  ): ProgressCounters = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(CancelledSteps)) __obj.updateDynamic("CancelledSteps")(CancelledSteps.get.asInstanceOf[js.Any])
    if (!js.isUndefined(FailedSteps)) __obj.updateDynamic("FailedSteps")(FailedSteps.get.asInstanceOf[js.Any])
    if (!js.isUndefined(SuccessSteps)) __obj.updateDynamic("SuccessSteps")(SuccessSteps.get.asInstanceOf[js.Any])
    if (!js.isUndefined(TimedOutSteps)) __obj.updateDynamic("TimedOutSteps")(TimedOutSteps.get.asInstanceOf[js.Any])
    if (!js.isUndefined(TotalSteps)) __obj.updateDynamic("TotalSteps")(TotalSteps.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressCounters]
  }
}

