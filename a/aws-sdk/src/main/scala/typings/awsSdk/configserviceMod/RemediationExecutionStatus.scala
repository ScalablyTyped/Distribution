package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemediationExecutionStatus extends js.Object {
  /**
    * Start time when the remediation was executed.
    */
  var InvocationTime: js.UndefOr[Date] = js.native
  /**
    * The time when the remediation execution was last updated.
    */
  var LastUpdatedTime: js.UndefOr[Date] = js.native
  var ResourceKey: js.UndefOr[typings.awsSdk.configserviceMod.ResourceKey] = js.native
  /**
    * ENUM of the values.
    */
  var State: js.UndefOr[RemediationExecutionState] = js.native
  /**
    * Details of every step.
    */
  var StepDetails: js.UndefOr[RemediationExecutionSteps] = js.native
}

object RemediationExecutionStatus {
  @scala.inline
  def apply(
    InvocationTime: Date = null,
    LastUpdatedTime: Date = null,
    ResourceKey: ResourceKey = null,
    State: RemediationExecutionState = null,
    StepDetails: RemediationExecutionSteps = null
  ): RemediationExecutionStatus = {
    val __obj = js.Dynamic.literal()
    if (InvocationTime != null) __obj.updateDynamic("InvocationTime")(InvocationTime.asInstanceOf[js.Any])
    if (LastUpdatedTime != null) __obj.updateDynamic("LastUpdatedTime")(LastUpdatedTime.asInstanceOf[js.Any])
    if (ResourceKey != null) __obj.updateDynamic("ResourceKey")(ResourceKey.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (StepDetails != null) __obj.updateDynamic("StepDetails")(StepDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemediationExecutionStatus]
  }
}

