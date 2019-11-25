package typings.atAwsDashSdkClientDashCodecommitDashNode.typesRepositoryNotAssociatedWithPullRequestExceptionMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesGetCommentsForPullRequestExceptionsUnionMod.GetCommentsForPullRequestExceptionsUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesPostCommentForPullRequestExceptionsUnionMod.PostCommentForPullRequestExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RepositoryNotAssociatedWithPullRequestException
  extends ServiceException[_RepositoryNotAssociatedWithPullRequestExceptionDetails]
     with GetCommentsForPullRequestExceptionsUnion
     with PostCommentForPullRequestExceptionsUnion {
  @JSName("name")
  var name_RepositoryNotAssociatedWithPullRequestException: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.RepositoryNotAssociatedWithPullRequestException
}

object RepositoryNotAssociatedWithPullRequestException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: _RepositoryNotAssociatedWithPullRequestExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.RepositoryNotAssociatedWithPullRequestException,
    stack: String = null
  ): RepositoryNotAssociatedWithPullRequestException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepositoryNotAssociatedWithPullRequestException]
  }
}

