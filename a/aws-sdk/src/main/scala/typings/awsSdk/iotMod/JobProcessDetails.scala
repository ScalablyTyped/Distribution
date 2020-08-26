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
  def apply(): JobProcessDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobProcessDetails]
  }
  @scala.inline
  implicit class JobProcessDetailsOps[Self <: JobProcessDetails] (val x: Self) extends AnyVal {
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
    def setNumberOfCanceledThings(value: CanceledThings): Self = this.set("numberOfCanceledThings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberOfCanceledThings: Self = this.set("numberOfCanceledThings", js.undefined)
    @scala.inline
    def setNumberOfFailedThings(value: FailedThings): Self = this.set("numberOfFailedThings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberOfFailedThings: Self = this.set("numberOfFailedThings", js.undefined)
    @scala.inline
    def setNumberOfInProgressThings(value: InProgressThings): Self = this.set("numberOfInProgressThings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberOfInProgressThings: Self = this.set("numberOfInProgressThings", js.undefined)
    @scala.inline
    def setNumberOfQueuedThings(value: QueuedThings): Self = this.set("numberOfQueuedThings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberOfQueuedThings: Self = this.set("numberOfQueuedThings", js.undefined)
    @scala.inline
    def setNumberOfRejectedThings(value: RejectedThings): Self = this.set("numberOfRejectedThings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberOfRejectedThings: Self = this.set("numberOfRejectedThings", js.undefined)
    @scala.inline
    def setNumberOfRemovedThings(value: RemovedThings): Self = this.set("numberOfRemovedThings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberOfRemovedThings: Self = this.set("numberOfRemovedThings", js.undefined)
    @scala.inline
    def setNumberOfSucceededThings(value: SucceededThings): Self = this.set("numberOfSucceededThings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberOfSucceededThings: Self = this.set("numberOfSucceededThings", js.undefined)
    @scala.inline
    def setNumberOfTimedOutThings(value: TimedOutThings): Self = this.set("numberOfTimedOutThings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberOfTimedOutThings: Self = this.set("numberOfTimedOutThings", js.undefined)
    @scala.inline
    def setProcessingTargetsVarargs(value: ProcessingTargetName*): Self = this.set("processingTargets", js.Array(value :_*))
    @scala.inline
    def setProcessingTargets(value: ProcessingTargetNameList): Self = this.set("processingTargets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProcessingTargets: Self = this.set("processingTargets", js.undefined)
  }
  
}

