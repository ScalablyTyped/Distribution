package typings.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StackSetDriftDetectionDetails extends js.Object {
  /**
    * The status of the stack set drift detection operation.    COMPLETED: The drift detection operation completed without failing on any stack instances.    FAILED: The drift detection operation exceeded the specified failure tolerance.     PARTIAL_SUCCESS: The drift detection operation completed without exceeding the failure tolerance for the operation.    IN_PROGRESS: The drift detection operation is currently being performed.    STOPPED: The user has cancelled the drift detection operation.  
    */
  var DriftDetectionStatus: js.UndefOr[StackSetDriftDetectionStatus] = js.native
  /**
    * Status of the stack set's actual configuration compared to its expected template and parameter configuration. A stack set is considered to have drifted if one or more of its stack instances have drifted from their expected template and parameter configuration.    DRIFTED: One or more of the stack instances belonging to the stack set stack differs from the expected template and parameter configuration. A stack instance is considered to have drifted if one or more of the resources in the associated stack have drifted.    NOT_CHECKED: AWS CloudFormation has not checked the stack set for drift.    IN_SYNC: All of the stack instances belonging to the stack set stack match from the expected template and parameter configuration.  
    */
  var DriftStatus: js.UndefOr[StackSetDriftStatus] = js.native
  /**
    * The number of stack instances that have drifted from the expected template and parameter configuration of the stack set. A stack instance is considered to have drifted if one or more of the resources in the associated stack do not match their expected configuration.
    */
  var DriftedStackInstancesCount: js.UndefOr[typings.awsSdk.cloudformationMod.DriftedStackInstancesCount] = js.native
  /**
    * The number of stack instances for which the drift detection operation failed.
    */
  var FailedStackInstancesCount: js.UndefOr[typings.awsSdk.cloudformationMod.FailedStackInstancesCount] = js.native
  /**
    * The number of stack instances that are currently being checked for drift.
    */
  var InProgressStackInstancesCount: js.UndefOr[typings.awsSdk.cloudformationMod.InProgressStackInstancesCount] = js.native
  /**
    * The number of stack instances which match the expected template and parameter configuration of the stack set.
    */
  var InSyncStackInstancesCount: js.UndefOr[typings.awsSdk.cloudformationMod.InSyncStackInstancesCount] = js.native
  /**
    * Most recent time when CloudFormation performed a drift detection operation on the stack set. This value will be NULL for any stack set on which drift detection has not yet been performed.
    */
  var LastDriftCheckTimestamp: js.UndefOr[Timestamp] = js.native
  /**
    * The total number of stack instances belonging to this stack set.  The total number of stack instances is equal to the total of:   Stack instances that match the stack set configuration.    Stack instances that have drifted from the stack set configuration.    Stack instances where the drift detection operation has failed.   Stack instances currently being checked for drift.  
    */
  var TotalStackInstancesCount: js.UndefOr[typings.awsSdk.cloudformationMod.TotalStackInstancesCount] = js.native
}

object StackSetDriftDetectionDetails {
  @scala.inline
  def apply(): StackSetDriftDetectionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StackSetDriftDetectionDetails]
  }
  @scala.inline
  implicit class StackSetDriftDetectionDetailsOps[Self <: StackSetDriftDetectionDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDriftDetectionStatus(value: StackSetDriftDetectionStatus): Self = this.set("DriftDetectionStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDriftDetectionStatus: Self = this.set("DriftDetectionStatus", js.undefined)
    @scala.inline
    def setDriftStatus(value: StackSetDriftStatus): Self = this.set("DriftStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDriftStatus: Self = this.set("DriftStatus", js.undefined)
    @scala.inline
    def setDriftedStackInstancesCount(value: DriftedStackInstancesCount): Self = this.set("DriftedStackInstancesCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDriftedStackInstancesCount: Self = this.set("DriftedStackInstancesCount", js.undefined)
    @scala.inline
    def setFailedStackInstancesCount(value: FailedStackInstancesCount): Self = this.set("FailedStackInstancesCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailedStackInstancesCount: Self = this.set("FailedStackInstancesCount", js.undefined)
    @scala.inline
    def setInProgressStackInstancesCount(value: InProgressStackInstancesCount): Self = this.set("InProgressStackInstancesCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInProgressStackInstancesCount: Self = this.set("InProgressStackInstancesCount", js.undefined)
    @scala.inline
    def setInSyncStackInstancesCount(value: InSyncStackInstancesCount): Self = this.set("InSyncStackInstancesCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInSyncStackInstancesCount: Self = this.set("InSyncStackInstancesCount", js.undefined)
    @scala.inline
    def setLastDriftCheckTimestamp(value: Timestamp): Self = this.set("LastDriftCheckTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastDriftCheckTimestamp: Self = this.set("LastDriftCheckTimestamp", js.undefined)
    @scala.inline
    def setTotalStackInstancesCount(value: TotalStackInstancesCount): Self = this.set("TotalStackInstancesCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalStackInstancesCount: Self = this.set("TotalStackInstancesCount", js.undefined)
  }
  
}

