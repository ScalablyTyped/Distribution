package typings.atAwsDashSdkClientDashCodecommitDashNode.typesPullRequestDoesNotExistExceptionMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesDescribePullRequestEventsExceptionsUnionMod.DescribePullRequestEventsExceptionsUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesGetCommentsForPullRequestExceptionsUnionMod.GetCommentsForPullRequestExceptionsUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesGetPullRequestExceptionsUnionMod.GetPullRequestExceptionsUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesMergePullRequestByFastForwardExceptionsUnionMod.MergePullRequestByFastForwardExceptionsUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesPostCommentForPullRequestExceptionsUnionMod.PostCommentForPullRequestExceptionsUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesUpdatePullRequestDescriptionExceptionsUnionMod.UpdatePullRequestDescriptionExceptionsUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesUpdatePullRequestStatusExceptionsUnionMod.UpdatePullRequestStatusExceptionsUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesUpdatePullRequestTitleExceptionsUnionMod.UpdatePullRequestTitleExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullRequestDoesNotExistException
  extends ServiceException[_PullRequestDoesNotExistExceptionDetails]
     with DescribePullRequestEventsExceptionsUnion
     with GetCommentsForPullRequestExceptionsUnion
     with GetPullRequestExceptionsUnion
     with MergePullRequestByFastForwardExceptionsUnion
     with PostCommentForPullRequestExceptionsUnion
     with UpdatePullRequestDescriptionExceptionsUnion
     with UpdatePullRequestStatusExceptionsUnion
     with UpdatePullRequestTitleExceptionsUnion {
  @JSName("name")
  var name_PullRequestDoesNotExistException: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.PullRequestDoesNotExistException
}

object PullRequestDoesNotExistException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: _PullRequestDoesNotExistExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.PullRequestDoesNotExistException,
    stack: String = null
  ): PullRequestDoesNotExistException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullRequestDoesNotExistException]
  }
}

