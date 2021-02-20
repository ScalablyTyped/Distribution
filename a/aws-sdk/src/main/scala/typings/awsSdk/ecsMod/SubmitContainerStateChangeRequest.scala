package typings.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubmitContainerStateChangeRequest extends StObject {
  
  /**
    * The short name or full ARN of the cluster that hosts the container.
    */
  var cluster: js.UndefOr[String] = js.native
  
  /**
    * The name of the container.
    */
  var containerName: js.UndefOr[String] = js.native
  
  /**
    * The exit code returned for the state change request.
    */
  var exitCode: js.UndefOr[BoxedInteger] = js.native
  
  /**
    * The network bindings of the container.
    */
  var networkBindings: js.UndefOr[NetworkBindings] = js.native
  
  /**
    * The reason for the state change request.
    */
  var reason: js.UndefOr[String] = js.native
  
  /**
    * The ID of the Docker container.
    */
  var runtimeId: js.UndefOr[String] = js.native
  
  /**
    * The status of the state change request.
    */
  var status: js.UndefOr[String] = js.native
  
  /**
    * The task ID or full Amazon Resource Name (ARN) of the task that hosts the container.
    */
  var task: js.UndefOr[String] = js.native
}
object SubmitContainerStateChangeRequest {
  
  @scala.inline
  def apply(): SubmitContainerStateChangeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubmitContainerStateChangeRequest]
  }
  
  @scala.inline
  implicit class SubmitContainerStateChangeRequestMutableBuilder[Self <: SubmitContainerStateChangeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCluster(value: String): Self = StObject.set(x, "cluster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterUndefined: Self = StObject.set(x, "cluster", js.undefined)
    
    @scala.inline
    def setContainerName(value: String): Self = StObject.set(x, "containerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerNameUndefined: Self = StObject.set(x, "containerName", js.undefined)
    
    @scala.inline
    def setExitCode(value: BoxedInteger): Self = StObject.set(x, "exitCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExitCodeUndefined: Self = StObject.set(x, "exitCode", js.undefined)
    
    @scala.inline
    def setNetworkBindings(value: NetworkBindings): Self = StObject.set(x, "networkBindings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkBindingsUndefined: Self = StObject.set(x, "networkBindings", js.undefined)
    
    @scala.inline
    def setNetworkBindingsVarargs(value: NetworkBinding*): Self = StObject.set(x, "networkBindings", js.Array(value :_*))
    
    @scala.inline
    def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    @scala.inline
    def setRuntimeId(value: String): Self = StObject.set(x, "runtimeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuntimeIdUndefined: Self = StObject.set(x, "runtimeId", js.undefined)
    
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
