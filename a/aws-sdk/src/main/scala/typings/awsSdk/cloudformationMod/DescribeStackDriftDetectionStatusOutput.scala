package typings.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeStackDriftDetectionStatusOutput extends js.Object {
  /**
    * The status of the stack drift detection operation.    DETECTION_COMPLETE: The stack drift detection operation has successfully completed for all resources in the stack that support drift detection. (Resources that do not currently support stack detection remain unchecked.) If you specified logical resource IDs for AWS CloudFormation to use as a filter for the stack drift detection operation, only the resources with those logical IDs are checked for drift.    DETECTION_FAILED: The stack drift detection operation has failed for at least one resource in the stack. Results will be available for resources on which AWS CloudFormation successfully completed drift detection.    DETECTION_IN_PROGRESS: The stack drift detection operation is currently in progress.  
    */
  var DetectionStatus: StackDriftDetectionStatus = js.native
  /**
    * The reason the stack drift detection operation has its current status.
    */
  var DetectionStatusReason: js.UndefOr[StackDriftDetectionStatusReason] = js.native
  /**
    * Total number of stack resources that have drifted. This is NULL until the drift detection operation reaches a status of DETECTION_COMPLETE. This value will be 0 for stacks whose drift status is IN_SYNC.
    */
  var DriftedStackResourceCount: js.UndefOr[BoxedInteger] = js.native
  /**
    * The ID of the drift detection results of this operation.  AWS CloudFormation generates new results, with a new drift detection ID, each time this operation is run. However, the number of reports AWS CloudFormation retains for any given stack, and for how long, may vary.
    */
  var StackDriftDetectionId: typings.awsSdk.cloudformationMod.StackDriftDetectionId = js.native
  /**
    * Status of the stack's actual configuration compared to its expected configuration.     DRIFTED: The stack differs from its expected template configuration. A stack is considered to have drifted if one or more of its resources have drifted.    NOT_CHECKED: AWS CloudFormation has not checked if the stack differs from its expected template configuration.    IN_SYNC: The stack's actual configuration matches its expected template configuration.    UNKNOWN: This value is reserved for future use.  
    */
  var StackDriftStatus: js.UndefOr[typings.awsSdk.cloudformationMod.StackDriftStatus] = js.native
  /**
    * The ID of the stack.
    */
  var StackId: typings.awsSdk.cloudformationMod.StackId = js.native
  /**
    * Time at which the stack drift detection operation was initiated.
    */
  var Timestamp: typings.awsSdk.cloudformationMod.Timestamp = js.native
}

object DescribeStackDriftDetectionStatusOutput {
  @scala.inline
  def apply(
    DetectionStatus: StackDriftDetectionStatus,
    StackDriftDetectionId: StackDriftDetectionId,
    StackId: StackId,
    Timestamp: Timestamp
  ): DescribeStackDriftDetectionStatusOutput = {
    val __obj = js.Dynamic.literal(DetectionStatus = DetectionStatus.asInstanceOf[js.Any], StackDriftDetectionId = StackDriftDetectionId.asInstanceOf[js.Any], StackId = StackId.asInstanceOf[js.Any], Timestamp = Timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeStackDriftDetectionStatusOutput]
  }
  @scala.inline
  implicit class DescribeStackDriftDetectionStatusOutputOps[Self <: DescribeStackDriftDetectionStatusOutput] (val x: Self) extends AnyVal {
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
    def setDetectionStatus(value: StackDriftDetectionStatus): Self = this.set("DetectionStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def setStackDriftDetectionId(value: StackDriftDetectionId): Self = this.set("StackDriftDetectionId", value.asInstanceOf[js.Any])
    @scala.inline
    def setStackId(value: StackId): Self = this.set("StackId", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimestamp(value: Timestamp): Self = this.set("Timestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def setDetectionStatusReason(value: StackDriftDetectionStatusReason): Self = this.set("DetectionStatusReason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetectionStatusReason: Self = this.set("DetectionStatusReason", js.undefined)
    @scala.inline
    def setDriftedStackResourceCount(value: BoxedInteger): Self = this.set("DriftedStackResourceCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDriftedStackResourceCount: Self = this.set("DriftedStackResourceCount", js.undefined)
    @scala.inline
    def setStackDriftStatus(value: StackDriftStatus): Self = this.set("StackDriftStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStackDriftStatus: Self = this.set("StackDriftStatus", js.undefined)
  }
  
}

