package typings.awsSdk.codestarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateProjectRequest extends js.Object {
  /**
    * The description of the project, if any.
    */
  var description: js.UndefOr[ProjectDescription] = js.native
  /**
    * The ID of the project you want to update.
    */
  var id: ProjectId = js.native
  /**
    * The name of the project you want to update.
    */
  var name: js.UndefOr[ProjectName] = js.native
}

object UpdateProjectRequest {
  @scala.inline
  def apply(id: ProjectId, description: ProjectDescription = null, name: ProjectName = null): UpdateProjectRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateProjectRequest]
  }
}

