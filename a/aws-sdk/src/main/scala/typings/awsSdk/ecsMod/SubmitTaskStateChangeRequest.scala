package typings.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubmitTaskStateChangeRequest extends StObject {
  
  /**
    * Any attachments associated with the state change request.
    */
  var attachments: js.UndefOr[AttachmentStateChanges] = js.undefined
  
  /**
    * The short name or full Amazon Resource Name (ARN) of the cluster that hosts the task.
    */
  var cluster: js.UndefOr[String] = js.undefined
  
  /**
    * Any containers associated with the state change request.
    */
  var containers: js.UndefOr[ContainerStateChanges] = js.undefined
  
  /**
    * The Unix timestamp for when the task execution stopped.
    */
  var executionStoppedAt: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The Unix timestamp for when the container image pull began.
    */
  var pullStartedAt: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The Unix timestamp for when the container image pull completed.
    */
  var pullStoppedAt: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The reason for the state change request.
    */
  var reason: js.UndefOr[String] = js.undefined
  
  /**
    * The status of the state change request.
    */
  var status: js.UndefOr[String] = js.undefined
  
  /**
    * The task ID or full ARN of the task in the state change request.
    */
  var task: js.UndefOr[String] = js.undefined
}
object SubmitTaskStateChangeRequest {
  
  @scala.inline
  def apply(): SubmitTaskStateChangeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubmitTaskStateChangeRequest]
  }
  
  @scala.inline
  implicit class SubmitTaskStateChangeRequestMutableBuilder[Self <: SubmitTaskStateChangeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttachments(value: AttachmentStateChanges): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachmentsUndefined: Self = StObject.set(x, "attachments", js.undefined)
    
    @scala.inline
    def setAttachmentsVarargs(value: AttachmentStateChange*): Self = StObject.set(x, "attachments", js.Array(value :_*))
    
    @scala.inline
    def setCluster(value: String): Self = StObject.set(x, "cluster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterUndefined: Self = StObject.set(x, "cluster", js.undefined)
    
    @scala.inline
    def setContainers(value: ContainerStateChanges): Self = StObject.set(x, "containers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainersUndefined: Self = StObject.set(x, "containers", js.undefined)
    
    @scala.inline
    def setContainersVarargs(value: ContainerStateChange*): Self = StObject.set(x, "containers", js.Array(value :_*))
    
    @scala.inline
    def setExecutionStoppedAt(value: Timestamp): Self = StObject.set(x, "executionStoppedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionStoppedAtUndefined: Self = StObject.set(x, "executionStoppedAt", js.undefined)
    
    @scala.inline
    def setPullStartedAt(value: Timestamp): Self = StObject.set(x, "pullStartedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPullStartedAtUndefined: Self = StObject.set(x, "pullStartedAt", js.undefined)
    
    @scala.inline
    def setPullStoppedAt(value: Timestamp): Self = StObject.set(x, "pullStoppedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPullStoppedAtUndefined: Self = StObject.set(x, "pullStoppedAt", js.undefined)
    
    @scala.inline
    def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setTask(value: String): Self = StObject.set(x, "task", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskUndefined: Self = StObject.set(x, "task", js.undefined)
  }
}
