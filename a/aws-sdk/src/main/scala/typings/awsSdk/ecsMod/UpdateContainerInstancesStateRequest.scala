package typings.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateContainerInstancesStateRequest extends StObject {
  
  /**
    * The short name or full Amazon Resource Name (ARN) of the cluster that hosts the container instance to update. If you do not specify a cluster, the default cluster is assumed.
    */
  var cluster: js.UndefOr[String] = js.native
  
  /**
    * A list of container instance IDs or full ARN entries.
    */
  var containerInstances: StringList = js.native
  
  /**
    * The container instance state with which to update the container instance. The only valid values for this action are ACTIVE and DRAINING. A container instance can only be updated to DRAINING status once it has reached an ACTIVE state. If a container instance is in REGISTERING, DEREGISTERING, or REGISTRATION_FAILED state you can describe the container instance but will be unable to update the container instance state.
    */
  var status: ContainerInstanceStatus = js.native
}
object UpdateContainerInstancesStateRequest {
  
  @scala.inline
  def apply(containerInstances: StringList, status: ContainerInstanceStatus): UpdateContainerInstancesStateRequest = {
    val __obj = js.Dynamic.literal(containerInstances = containerInstances.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateContainerInstancesStateRequest]
  }
  
  @scala.inline
  implicit class UpdateContainerInstancesStateRequestMutableBuilder[Self <: UpdateContainerInstancesStateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCluster(value: String): Self = StObject.set(x, "cluster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterUndefined: Self = StObject.set(x, "cluster", js.undefined)
    
    @scala.inline
    def setContainerInstances(value: StringList): Self = StObject.set(x, "containerInstances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerInstancesVarargs(value: String*): Self = StObject.set(x, "containerInstances", js.Array(value :_*))
    
    @scala.inline
    def setStatus(value: ContainerInstanceStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
