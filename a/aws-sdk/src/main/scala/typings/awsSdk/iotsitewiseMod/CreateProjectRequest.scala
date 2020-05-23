package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateProjectRequest extends js.Object {
  /**
    * A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't reuse this client token if a new idempotent request is required.
    */
  var clientToken: js.UndefOr[ClientToken] = js.native
  /**
    * The ID of the portal in which to create the project.
    */
  var portalId: ID = js.native
  /**
    * A description for the project.
    */
  var projectDescription: js.UndefOr[Description] = js.native
  /**
    * A friendly name for the project.
    */
  var projectName: Name = js.native
  /**
    * A list of key-value pairs that contain metadata for the project. For more information, see Tagging your AWS IoT SiteWise resources in the AWS IoT SiteWise User Guide.
    */
  var tags: js.UndefOr[TagMap] = js.native
}

object CreateProjectRequest {
  @scala.inline
  def apply(
    portalId: ID,
    projectName: Name,
    clientToken: ClientToken = null,
    projectDescription: Description = null,
    tags: TagMap = null
  ): CreateProjectRequest = {
    val __obj = js.Dynamic.literal(portalId = portalId.asInstanceOf[js.Any], projectName = projectName.asInstanceOf[js.Any])
    if (clientToken != null) __obj.updateDynamic("clientToken")(clientToken.asInstanceOf[js.Any])
    if (projectDescription != null) __obj.updateDynamic("projectDescription")(projectDescription.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateProjectRequest]
  }
}

