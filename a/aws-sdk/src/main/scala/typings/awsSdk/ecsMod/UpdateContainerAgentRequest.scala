package typings.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateContainerAgentRequest extends StObject {
  
  /**
    * The short name or full Amazon Resource Name (ARN) of the cluster that your container instance is running on. If you do not specify a cluster, the default cluster is assumed.
    */
  var cluster: js.UndefOr[String] = js.native
  
  /**
    * The container instance ID or full ARN entries for the container instance on which you would like to update the Amazon ECS container agent.
    */
  var containerInstance: String = js.native
}
object UpdateContainerAgentRequest {
  
  @scala.inline
  def apply(containerInstance: String): UpdateContainerAgentRequest = {
    val __obj = js.Dynamic.literal(containerInstance = containerInstance.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateContainerAgentRequest]
  }
  
  @scala.inline
  implicit class UpdateContainerAgentRequestMutableBuilder[Self <: UpdateContainerAgentRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCluster(value: String): Self = StObject.set(x, "cluster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterUndefined: Self = StObject.set(x, "cluster", js.undefined)
    
    @scala.inline
    def setContainerInstance(value: String): Self = StObject.set(x, "containerInstance", value.asInstanceOf[js.Any])
  }
}
