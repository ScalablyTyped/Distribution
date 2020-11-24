package typings.awsSdk.kafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClusterOperationInfo extends js.Object {
  
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
  implicit class ClusterOperationInfoOps[Self <: ClusterOperationInfo] (val x: Self) extends AnyVal {
    
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
    def setClientRequestId(value: string): Self = this.set("ClientRequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientRequestId: Self = this.set("ClientRequestId", js.undefined)
    
    @scala.inline
    def setClusterArn(value: string): Self = this.set("ClusterArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterArn: Self = this.set("ClusterArn", js.undefined)
    
    @scala.inline
    def setCreationTime(value: timestampIso8601): Self = this.set("CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTime: Self = this.set("CreationTime", js.undefined)
    
    @scala.inline
    def setEndTime(value: timestampIso8601): Self = this.set("EndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndTime: Self = this.set("EndTime", js.undefined)
    
    @scala.inline
    def setErrorInfo(value: ErrorInfo): Self = this.set("ErrorInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorInfo: Self = this.set("ErrorInfo", js.undefined)
    
    @scala.inline
    def setOperationArn(value: string): Self = this.set("OperationArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperationArn: Self = this.set("OperationArn", js.undefined)
    
    @scala.inline
    def setOperationState(value: string): Self = this.set("OperationState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperationState: Self = this.set("OperationState", js.undefined)
    
    @scala.inline
    def setOperationStepsVarargs(value: ClusterOperationStep*): Self = this.set("OperationSteps", js.Array(value :_*))
    
    @scala.inline
    def setOperationSteps(value: listOfClusterOperationStep): Self = this.set("OperationSteps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperationSteps: Self = this.set("OperationSteps", js.undefined)
    
    @scala.inline
    def setOperationType(value: string): Self = this.set("OperationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperationType: Self = this.set("OperationType", js.undefined)
    
    @scala.inline
    def setSourceClusterInfo(value: MutableClusterInfo): Self = this.set("SourceClusterInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceClusterInfo: Self = this.set("SourceClusterInfo", js.undefined)
    
    @scala.inline
    def setTargetClusterInfo(value: MutableClusterInfo): Self = this.set("TargetClusterInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetClusterInfo: Self = this.set("TargetClusterInfo", js.undefined)
  }
}
