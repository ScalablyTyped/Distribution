package typings.awsSdk.kafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClusterOperationInfo extends StObject {
  
  /**
    * 
    The ID of the API request that triggered this operation.
    
    */
  var ClientRequestId: js.UndefOr[string] = js.native
  
  /**
    * 
    ARN of the cluster.
    
    */
  var ClusterArn: js.UndefOr[string] = js.native
  
  /**
    * 
    The time that the operation was created.
    
    */
  var CreationTime: js.UndefOr[timestampIso8601] = js.native
  
  /**
    * 
    The time at which the operation finished.
    
    */
  var EndTime: js.UndefOr[timestampIso8601] = js.native
  
  /**
    * 
    Describes the error if the operation fails.
    
    */
  var ErrorInfo: js.UndefOr[typings.awsSdk.kafkaMod.ErrorInfo] = js.native
  
  /**
    * 
    ARN of the cluster operation.
    
    */
  var OperationArn: js.UndefOr[string] = js.native
  
  /**
    * 
    State of the cluster operation.
    
    */
  var OperationState: js.UndefOr[string] = js.native
  
  /**
    * 
    Steps completed during the operation.
    
    */
  var OperationSteps: js.UndefOr[listOfClusterOperationStep] = js.native
  
  /**
    * 
    Type of the cluster operation.
    
    */
  var OperationType: js.UndefOr[string] = js.native
  
  /**
    * 
    Information about cluster attributes before a cluster is updated.
    
    */
  var SourceClusterInfo: js.UndefOr[MutableClusterInfo] = js.native
  
  /**
    * 
    Information about cluster attributes after a cluster is updated.
    
    */
  var TargetClusterInfo: js.UndefOr[MutableClusterInfo] = js.native
}
object ClusterOperationInfo {
  
  @scala.inline
  def apply(): ClusterOperationInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterOperationInfo]
  }
  
  @scala.inline
  implicit class ClusterOperationInfoMutableBuilder[Self <: ClusterOperationInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientRequestId(value: string): Self = StObject.set(x, "ClientRequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientRequestIdUndefined: Self = StObject.set(x, "ClientRequestId", js.undefined)
    
    @scala.inline
    def setClusterArn(value: string): Self = StObject.set(x, "ClusterArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterArnUndefined: Self = StObject.set(x, "ClusterArn", js.undefined)
    
    @scala.inline
    def setCreationTime(value: timestampIso8601): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    @scala.inline
    def setEndTime(value: timestampIso8601): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
    
    @scala.inline
    def setErrorInfo(value: ErrorInfo): Self = StObject.set(x, "ErrorInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorInfoUndefined: Self = StObject.set(x, "ErrorInfo", js.undefined)
    
    @scala.inline
    def setOperationArn(value: string): Self = StObject.set(x, "OperationArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationArnUndefined: Self = StObject.set(x, "OperationArn", js.undefined)
    
    @scala.inline
    def setOperationState(value: string): Self = StObject.set(x, "OperationState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationStateUndefined: Self = StObject.set(x, "OperationState", js.undefined)
    
    @scala.inline
    def setOperationSteps(value: listOfClusterOperationStep): Self = StObject.set(x, "OperationSteps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationStepsUndefined: Self = StObject.set(x, "OperationSteps", js.undefined)
    
    @scala.inline
    def setOperationStepsVarargs(value: ClusterOperationStep*): Self = StObject.set(x, "OperationSteps", js.Array(value :_*))
    
    @scala.inline
    def setOperationType(value: string): Self = StObject.set(x, "OperationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationTypeUndefined: Self = StObject.set(x, "OperationType", js.undefined)
    
    @scala.inline
    def setSourceClusterInfo(value: MutableClusterInfo): Self = StObject.set(x, "SourceClusterInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceClusterInfoUndefined: Self = StObject.set(x, "SourceClusterInfo", js.undefined)
    
    @scala.inline
    def setTargetClusterInfo(value: MutableClusterInfo): Self = StObject.set(x, "TargetClusterInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetClusterInfoUndefined: Self = StObject.set(x, "TargetClusterInfo", js.undefined)
  }
}
