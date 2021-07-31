package typings.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StackSetDriftDetectionDetails extends StObject {
  
  /**
    * The status of the stack set drift detection operation.    COMPLETED: The drift detection operation completed without failing on any stack instances.    FAILED: The drift detection operation exceeded the specified failure tolerance.     PARTIAL_SUCCESS: The drift detection operation completed without exceeding the failure tolerance for the operation.    IN_PROGRESS: The drift detection operation is currently being performed.    STOPPED: The user has cancelled the drift detection operation.  
    */
  var DriftDetectionStatus: js.UndefOr[StackSetDriftDetectionStatus] = js.undefined
  
  /**
    * Status of the stack set's actual configuration compared to its expected template and parameter configuration. A stack set is considered to have drifted if one or more of its stack instances have drifted from their expected template and parameter configuration.    DRIFTED: One or more of the stack instances belonging to the stack set stack differs from the expected template and parameter configuration. A stack instance is considered to have drifted if one or more of the resources in the associated stack have drifted.    NOT_CHECKED: AWS CloudFormation has not checked the stack set for drift.    IN_SYNC: All of the stack instances belonging to the stack set stack match from the expected template and parameter configuration.  
    */
  var DriftStatus: js.UndefOr[StackSetDriftStatus] = js.undefined
  
  /**
    * The number of stack instances that have drifted from the expected template and parameter configuration of the stack set. A stack instance is considered to have drifted if one or more of the resources in the associated stack do not match their expected configuration.
    */
  var DriftedStackInstancesCount: js.UndefOr[typings.awsSdk.cloudformationMod.DriftedStackInstancesCount] = js.undefined
  
  /**
    * The number of stack instances for which the drift detection operation failed.
    */
  var FailedStackInstancesCount: js.UndefOr[typings.awsSdk.cloudformationMod.FailedStackInstancesCount] = js.undefined
  
  /**
    * The number of stack instances that are currently being checked for drift.
    */
  var InProgressStackInstancesCount: js.UndefOr[typings.awsSdk.cloudformationMod.InProgressStackInstancesCount] = js.undefined
  
  /**
    * The number of stack instances which match the expected template and parameter configuration of the stack set.
    */
  var InSyncStackInstancesCount: js.UndefOr[typings.awsSdk.cloudformationMod.InSyncStackInstancesCount] = js.undefined
  
  /**
    * Most recent time when CloudFormation performed a drift detection operation on the stack set. This value will be NULL for any stack set on which drift detection has not yet been performed.
    */
  var LastDriftCheckTimestamp: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The total number of stack instances belonging to this stack set.  The total number of stack instances is equal to the total of:   Stack instances that match the stack set configuration.    Stack instances that have drifted from the stack set configuration.    Stack instances where the drift detection operation has failed.   Stack instances currently being checked for drift.  
    */
  var TotalStackInstancesCount: js.UndefOr[typings.awsSdk.cloudformationMod.TotalStackInstancesCount] = js.undefined
}
object StackSetDriftDetectionDetails {
  
  @scala.inline
  def apply(): StackSetDriftDetectionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StackSetDriftDetectionDetails]
  }
  
  @scala.inline
  implicit class StackSetDriftDetectionDetailsMutableBuilder[Self <: StackSetDriftDetectionDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDriftDetectionStatus(value: StackSetDriftDetectionStatus): Self = StObject.set(x, "DriftDetectionStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDriftDetectionStatusUndefined: Self = StObject.set(x, "DriftDetectionStatus", js.undefined)
    
    @scala.inline
    def setDriftStatus(value: StackSetDriftStatus): Self = StObject.set(x, "DriftStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDriftStatusUndefined: Self = StObject.set(x, "DriftStatus", js.undefined)
    
    @scala.inline
    def setDriftedStackInstancesCount(value: DriftedStackInstancesCount): Self = StObject.set(x, "DriftedStackInstancesCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDriftedStackInstancesCountUndefined: Self = StObject.set(x, "DriftedStackInstancesCount", js.undefined)
    
    @scala.inline
    def setFailedStackInstancesCount(value: FailedStackInstancesCount): Self = StObject.set(x, "FailedStackInstancesCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailedStackInstancesCountUndefined: Self = StObject.set(x, "FailedStackInstancesCount", js.undefined)
    
    @scala.inline
    def setInProgressStackInstancesCount(value: InProgressStackInstancesCount): Self = StObject.set(x, "InProgressStackInstancesCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInProgressStackInstancesCountUndefined: Self = StObject.set(x, "InProgressStackInstancesCount", js.undefined)
    
    @scala.inline
    def setInSyncStackInstancesCount(value: InSyncStackInstancesCount): Self = StObject.set(x, "InSyncStackInstancesCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInSyncStackInstancesCountUndefined: Self = StObject.set(x, "InSyncStackInstancesCount", js.undefined)
    
    @scala.inline
    def setLastDriftCheckTimestamp(value: Timestamp): Self = StObject.set(x, "LastDriftCheckTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastDriftCheckTimestampUndefined: Self = StObject.set(x, "LastDriftCheckTimestamp", js.undefined)
    
    @scala.inline
    def setTotalStackInstancesCount(value: TotalStackInstancesCount): Self = StObject.set(x, "TotalStackInstancesCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalStackInstancesCountUndefined: Self = StObject.set(x, "TotalStackInstancesCount", js.undefined)
  }
}
