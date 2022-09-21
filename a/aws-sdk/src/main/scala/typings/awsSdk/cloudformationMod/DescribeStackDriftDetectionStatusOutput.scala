package typings.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeStackDriftDetectionStatusOutput extends StObject {
  
  /**
    * The status of the stack drift detection operation.    DETECTION_COMPLETE: The stack drift detection operation has successfully completed for all resources in the stack that support drift detection. (Resources that don't currently support stack detection remain unchecked.) If you specified logical resource IDs for CloudFormation to use as a filter for the stack drift detection operation, only the resources with those logical IDs are checked for drift.    DETECTION_FAILED: The stack drift detection operation has failed for at least one resource in the stack. Results will be available for resources on which CloudFormation successfully completed drift detection.    DETECTION_IN_PROGRESS: The stack drift detection operation is currently in progress.  
    */
  var DetectionStatus: StackDriftDetectionStatus
  
  /**
    * The reason the stack drift detection operation has its current status.
    */
  var DetectionStatusReason: js.UndefOr[StackDriftDetectionStatusReason] = js.undefined
  
  /**
    * Total number of stack resources that have drifted. This is NULL until the drift detection operation reaches a status of DETECTION_COMPLETE. This value will be 0 for stacks whose drift status is IN_SYNC.
    */
  var DriftedStackResourceCount: js.UndefOr[BoxedInteger] = js.undefined
  
  /**
    * The ID of the drift detection results of this operation. CloudFormation generates new results, with a new drift detection ID, each time this operation is run. However, the number of reports CloudFormation retains for any given stack, and for how long, may vary.
    */
  var StackDriftDetectionId: typings.awsSdk.cloudformationMod.StackDriftDetectionId
  
  /**
    * Status of the stack's actual configuration compared to its expected configuration.    DRIFTED: The stack differs from its expected template configuration. A stack is considered to have drifted if one or more of its resources have drifted.    NOT_CHECKED: CloudFormation hasn't checked if the stack differs from its expected template configuration.    IN_SYNC: The stack's actual configuration matches its expected template configuration.    UNKNOWN: This value is reserved for future use.  
    */
  var StackDriftStatus: js.UndefOr[typings.awsSdk.cloudformationMod.StackDriftStatus] = js.undefined
  
  /**
    * The ID of the stack.
    */
  var StackId: typings.awsSdk.cloudformationMod.StackId
  
  /**
    * Time at which the stack drift detection operation was initiated.
    */
  var Timestamp: js.Date
}
object DescribeStackDriftDetectionStatusOutput {
  
  inline def apply(
    DetectionStatus: StackDriftDetectionStatus,
    StackDriftDetectionId: StackDriftDetectionId,
    StackId: StackId,
    Timestamp: js.Date
  ): DescribeStackDriftDetectionStatusOutput = {
    val __obj = js.Dynamic.literal(DetectionStatus = DetectionStatus.asInstanceOf[js.Any], StackDriftDetectionId = StackDriftDetectionId.asInstanceOf[js.Any], StackId = StackId.asInstanceOf[js.Any], Timestamp = Timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeStackDriftDetectionStatusOutput]
  }
  
  extension [Self <: DescribeStackDriftDetectionStatusOutput](x: Self) {
    
    inline def setDetectionStatus(value: StackDriftDetectionStatus): Self = StObject.set(x, "DetectionStatus", value.asInstanceOf[js.Any])
    
    inline def setDetectionStatusReason(value: StackDriftDetectionStatusReason): Self = StObject.set(x, "DetectionStatusReason", value.asInstanceOf[js.Any])
    
    inline def setDetectionStatusReasonUndefined: Self = StObject.set(x, "DetectionStatusReason", js.undefined)
    
    inline def setDriftedStackResourceCount(value: BoxedInteger): Self = StObject.set(x, "DriftedStackResourceCount", value.asInstanceOf[js.Any])
    
    inline def setDriftedStackResourceCountUndefined: Self = StObject.set(x, "DriftedStackResourceCount", js.undefined)
    
    inline def setStackDriftDetectionId(value: StackDriftDetectionId): Self = StObject.set(x, "StackDriftDetectionId", value.asInstanceOf[js.Any])
    
    inline def setStackDriftStatus(value: StackDriftStatus): Self = StObject.set(x, "StackDriftStatus", value.asInstanceOf[js.Any])
    
    inline def setStackDriftStatusUndefined: Self = StObject.set(x, "StackDriftStatus", js.undefined)
    
    inline def setStackId(value: StackId): Self = StObject.set(x, "StackId", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: js.Date): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
  }
}
