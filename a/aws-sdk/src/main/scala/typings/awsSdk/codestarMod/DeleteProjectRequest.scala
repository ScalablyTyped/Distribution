package typings.awsSdk.codestarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteProjectRequest extends js.Object {
  /**
    * A user- or system-generated token that identifies the entity that requested project deletion. This token can be used to repeat the request. 
    */
  var clientRequestToken: js.UndefOr[ClientRequestToken] = js.native
  /**
    * Whether to send a delete request for the primary stack in AWS CloudFormation originally used to generate the project and its resources. This option will delete all AWS resources for the project (except for any buckets in Amazon S3) as well as deleting the project itself. Recommended for most use cases.
    */
  var deleteStack: js.UndefOr[DeleteStack] = js.native
  /**
    * The ID of the project to be deleted in AWS CodeStar.
    */
  var id: ProjectId = js.native
}

object DeleteProjectRequest {
  @scala.inline
  def apply(id: ProjectId): DeleteProjectRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteProjectRequest]
  }
  @scala.inline
  implicit class DeleteProjectRequestOps[Self <: DeleteProjectRequest] (val x: Self) extends AnyVal {
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
    def setId(value: ProjectId): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientRequestToken(value: ClientRequestToken): Self = this.set("clientRequestToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientRequestToken: Self = this.set("clientRequestToken", js.undefined)
    @scala.inline
    def setDeleteStack(value: DeleteStack): Self = this.set("deleteStack", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleteStack: Self = this.set("deleteStack", js.undefined)
  }
  
}

