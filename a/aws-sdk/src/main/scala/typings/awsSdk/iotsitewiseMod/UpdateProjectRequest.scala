package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateProjectRequest extends js.Object {
  /**
    * A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't reuse this client token if a new idempotent request is required.
    */
  var clientToken: js.UndefOr[ClientToken] = js.native
  /**
    * A new description for the project.
    */
  var projectDescription: js.UndefOr[Description] = js.native
  /**
    * The ID of the project to update.
    */
  var projectId: ID = js.native
  /**
    * A new friendly name for the project.
    */
  var projectName: Name = js.native
}

object UpdateProjectRequest {
  @scala.inline
  def apply(
    projectId: ID,
    projectName: Name,
    clientToken: ClientToken = null,
    projectDescription: Description = null
  ): UpdateProjectRequest = {
    val __obj = js.Dynamic.literal(projectId = projectId.asInstanceOf[js.Any], projectName = projectName.asInstanceOf[js.Any])
    if (clientToken != null) __obj.updateDynamic("clientToken")(clientToken.asInstanceOf[js.Any])
    if (projectDescription != null) __obj.updateDynamic("projectDescription")(projectDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateProjectRequest]
  }
}

