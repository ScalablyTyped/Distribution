package typings.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiscoverPollEndpointRequest extends StObject {
  
  /**
    * The short name or full Amazon Resource Name (ARN) of the cluster to which the container instance belongs.
    */
  var cluster: js.UndefOr[String] = js.undefined
  
  /**
    * The container instance ID or full ARN of the container instance. The ARN contains the arn:aws:ecs namespace, followed by the Region of the container instance, the AWS account ID of the container instance owner, the container-instance namespace, and then the container instance ID. For example, arn:aws:ecs:region:aws_account_id:container-instance/container_instance_ID.
    */
  var containerInstance: js.UndefOr[String] = js.undefined
}
object DiscoverPollEndpointRequest {
  
  inline def apply(): DiscoverPollEndpointRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiscoverPollEndpointRequest]
  }
  
  extension [Self <: DiscoverPollEndpointRequest](x: Self) {
    
    inline def setCluster(value: String): Self = StObject.set(x, "cluster", value.asInstanceOf[js.Any])
    
    inline def setClusterUndefined: Self = StObject.set(x, "cluster", js.undefined)
    
    inline def setContainerInstance(value: String): Self = StObject.set(x, "containerInstance", value.asInstanceOf[js.Any])
    
    inline def setContainerInstanceUndefined: Self = StObject.set(x, "containerInstance", js.undefined)
  }
}
