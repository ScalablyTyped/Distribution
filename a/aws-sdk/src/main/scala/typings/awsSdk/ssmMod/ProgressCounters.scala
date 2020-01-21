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
    CancelledSteps: Int | Double = null,
    FailedSteps: Int | Double = null,
    SuccessSteps: Int | Double = null,
    TimedOutSteps: Int | Double = null,
    TotalSteps: Int | Double = null
  ): ProgressCounters = {
    val __obj = js.Dynamic.literal()
    if (CancelledSteps != null) __obj.updateDynamic("CancelledSteps")(CancelledSteps.asInstanceOf[js.Any])
    if (FailedSteps != null) __obj.updateDynamic("FailedSteps")(FailedSteps.asInstanceOf[js.Any])
    if (SuccessSteps != null) __obj.updateDynamic("SuccessSteps")(SuccessSteps.asInstanceOf[js.Any])
    if (TimedOutSteps != null) __obj.updateDynamic("TimedOutSteps")(TimedOutSteps.asInstanceOf[js.Any])
    if (TotalSteps != null) __obj.updateDynamic("TotalSteps")(TotalSteps.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressCounters]
  }
}

