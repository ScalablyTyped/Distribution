package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateTestGridProjectRequest extends js.Object {
  /**
    * Human-readable description for the project.
    */
  var description: js.UndefOr[ResourceDescription] = js.native
  /**
    * Human-readable name for the project.
    */
  var name: js.UndefOr[ResourceName] = js.native
  /**
    * ARN of the project to update.
    */
  var projectArn: DeviceFarmArn = js.native
}

object UpdateTestGridProjectRequest {
  @scala.inline
  def apply(projectArn: DeviceFarmArn, description: ResourceDescription = null, name: ResourceName = null): UpdateTestGridProjectRequest = {
    val __obj = js.Dynamic.literal(projectArn = projectArn.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTestGridProjectRequest]
  }
}

