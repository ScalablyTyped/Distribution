package typings.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateContainerAgentResponse extends js.Object {
  /**
    * The container instance for which the container agent was updated.
    */
  var containerInstance: js.UndefOr[ContainerInstance] = js.native
}

object UpdateContainerAgentResponse {
  @scala.inline
  def apply(containerInstance: ContainerInstance = null): UpdateContainerAgentResponse = {
    val __obj = js.Dynamic.literal()
    if (containerInstance != null) __obj.updateDynamic("containerInstance")(containerInstance.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateContainerAgentResponse]
  }
}

