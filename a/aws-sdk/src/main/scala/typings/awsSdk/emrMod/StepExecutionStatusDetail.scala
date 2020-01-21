package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StepExecutionStatusDetail extends js.Object {
  /**
    * The creation date and time of the step.
    */
  var CreationDateTime: Date = js.native
  /**
    * The completion date and time of the step.
    */
  var EndDateTime: js.UndefOr[Date] = js.native
  /**
    * A description of the step's current state.
    */
  var LastStateChangeReason: js.UndefOr[XmlString] = js.native
  /**
    * The start date and time of the step.
    */
  var StartDateTime: js.UndefOr[Date] = js.native
  /**
    * The state of the step.
    */
  var State: StepExecutionState = js.native
}

object StepExecutionStatusDetail {
  @scala.inline
  def apply(
    CreationDateTime: Date,
    State: StepExecutionState,
    EndDateTime: Date = null,
    LastStateChangeReason: XmlString = null,
    StartDateTime: Date = null
  ): StepExecutionStatusDetail = {
    val __obj = js.Dynamic.literal(CreationDateTime = CreationDateTime.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any])
    if (EndDateTime != null) __obj.updateDynamic("EndDateTime")(EndDateTime.asInstanceOf[js.Any])
    if (LastStateChangeReason != null) __obj.updateDynamic("LastStateChangeReason")(LastStateChangeReason.asInstanceOf[js.Any])
    if (StartDateTime != null) __obj.updateDynamic("StartDateTime")(StartDateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepExecutionStatusDetail]
  }
}

