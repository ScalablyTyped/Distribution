package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobProcessDetails extends js.Object {
  /**
    * The number of things that cancelled the job.
    */
  var numberOfCanceledThings: js.UndefOr[CanceledThings] = js.native
  /**
    * The number of things that failed executing the job.
    */
  var numberOfFailedThings: js.UndefOr[FailedThings] = js.native
  /**
    * The number of things currently executing the job.
    */
  var numberOfInProgressThings: js.UndefOr[InProgressThings] = js.native
  /**
    * The number of things that are awaiting execution of the job.
    */
  var numberOfQueuedThings: js.UndefOr[QueuedThings] = js.native
  /**
    * The number of things that rejected the job.
    */
  var numberOfRejectedThings: js.UndefOr[RejectedThings] = js.native
  /**
    * The number of things that are no longer scheduled to execute the job because they have been deleted or have been removed from the group that was a target of the job.
    */
  var numberOfRemovedThings: js.UndefOr[RemovedThings] = js.native
  /**
    * The number of things which successfully completed the job.
    */
  var numberOfSucceededThings: js.UndefOr[SucceededThings] = js.native
  /**
    * The number of things whose job execution status is TIMED_OUT.
    */
  var numberOfTimedOutThings: js.UndefOr[TimedOutThings] = js.native
  /**
    * The target devices to which the job execution is being rolled out. This value will be null after the job execution has finished rolling out to all the target devices.
    */
  var processingTargets: js.UndefOr[ProcessingTargetNameList] = js.native
}

object JobProcessDetails {
  @scala.inline
  def apply(
    numberOfCanceledThings: js.UndefOr[CanceledThings] = js.undefined,
    numberOfFailedThings: js.UndefOr[FailedThings] = js.undefined,
    numberOfInProgressThings: js.UndefOr[InProgressThings] = js.undefined,
    numberOfQueuedThings: js.UndefOr[QueuedThings] = js.undefined,
    numberOfRejectedThings: js.UndefOr[RejectedThings] = js.undefined,
    numberOfRemovedThings: js.UndefOr[RemovedThings] = js.undefined,
    numberOfSucceededThings: js.UndefOr[SucceededThings] = js.undefined,
    numberOfTimedOutThings: js.UndefOr[TimedOutThings] = js.undefined,
    processingTargets: ProcessingTargetNameList = null
  ): JobProcessDetails = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(numberOfCanceledThings)) __obj.updateDynamic("numberOfCanceledThings")(numberOfCanceledThings.get.asInstanceOf[js.Any])
    if (!js.isUndefined(numberOfFailedThings)) __obj.updateDynamic("numberOfFailedThings")(numberOfFailedThings.get.asInstanceOf[js.Any])
    if (!js.isUndefined(numberOfInProgressThings)) __obj.updateDynamic("numberOfInProgressThings")(numberOfInProgressThings.get.asInstanceOf[js.Any])
    if (!js.isUndefined(numberOfQueuedThings)) __obj.updateDynamic("numberOfQueuedThings")(numberOfQueuedThings.get.asInstanceOf[js.Any])
    if (!js.isUndefined(numberOfRejectedThings)) __obj.updateDynamic("numberOfRejectedThings")(numberOfRejectedThings.get.asInstanceOf[js.Any])
    if (!js.isUndefined(numberOfRemovedThings)) __obj.updateDynamic("numberOfRemovedThings")(numberOfRemovedThings.get.asInstanceOf[js.Any])
    if (!js.isUndefined(numberOfSucceededThings)) __obj.updateDynamic("numberOfSucceededThings")(numberOfSucceededThings.get.asInstanceOf[js.Any])
    if (!js.isUndefined(numberOfTimedOutThings)) __obj.updateDynamic("numberOfTimedOutThings")(numberOfTimedOutThings.get.asInstanceOf[js.Any])
    if (processingTargets != null) __obj.updateDynamic("processingTargets")(processingTargets.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobProcessDetails]
  }
}

