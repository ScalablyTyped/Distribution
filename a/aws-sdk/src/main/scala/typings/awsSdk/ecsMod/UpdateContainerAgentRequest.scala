package typings.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateContainerAgentRequest extends js.Object {
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
  def apply(containerInstance: String, cluster: String = null): UpdateContainerAgentRequest = {
    val __obj = js.Dynamic.literal(containerInstance = containerInstance.asInstanceOf[js.Any])
    if (cluster != null) __obj.updateDynamic("cluster")(cluster.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateContainerAgentRequest]
  }
}

