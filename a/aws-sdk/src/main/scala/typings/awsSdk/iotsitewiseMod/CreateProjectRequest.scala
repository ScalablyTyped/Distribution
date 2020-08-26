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
  def apply(portalId: ID, projectName: Name): CreateProjectRequest = {
    val __obj = js.Dynamic.literal(portalId = portalId.asInstanceOf[js.Any], projectName = projectName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateProjectRequest]
  }
  @scala.inline
  implicit class CreateProjectRequestOps[Self <: CreateProjectRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPortalId(value: ID): Self = this.set("portalId", value.asInstanceOf[js.Any])
    @scala.inline
    def setProjectName(value: Name): Self = this.set("projectName", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientToken(value: ClientToken): Self = this.set("clientToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientToken: Self = this.set("clientToken", js.undefined)
    @scala.inline
    def setProjectDescription(value: Description): Self = this.set("projectDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjectDescription: Self = this.set("projectDescription", js.undefined)
    @scala.inline
    def setTags(value: TagMap): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

