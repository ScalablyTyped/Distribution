package typings.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeregisterContainerInstanceResponse extends js.Object {
  /**
    * The container instance that was deregistered.
    */
  var containerInstance: js.UndefOr[ContainerInstance] = js.native
}

object DeregisterContainerInstanceResponse {
  @scala.inline
  def apply(containerInstance: ContainerInstance = null): DeregisterContainerInstanceResponse = {
    val __obj = js.Dynamic.literal()
    if (containerInstance != null) __obj.updateDynamic("containerInstance")(containerInstance.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeregisterContainerInstanceResponse]
  }
}

