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
  def apply(
    id: ProjectId,
    clientRequestToken: ClientRequestToken = null,
    deleteStack: js.UndefOr[Boolean] = js.undefined
  ): DeleteProjectRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (clientRequestToken != null) __obj.updateDynamic("clientRequestToken")(clientRequestToken.asInstanceOf[js.Any])
    if (!js.isUndefined(deleteStack)) __obj.updateDynamic("deleteStack")(deleteStack.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteProjectRequest]
  }
}

