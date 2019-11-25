package typings.atAwsDashSdkClientDashCodecommitDashNode.typesCommentContentRequiredExceptionMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesPostCommentForComparedCommitExceptionsUnionMod.PostCommentForComparedCommitExceptionsUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesPostCommentForPullRequestExceptionsUnionMod.PostCommentForPullRequestExceptionsUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesPostCommentReplyExceptionsUnionMod.PostCommentReplyExceptionsUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesUpdateCommentExceptionsUnionMod.UpdateCommentExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentContentRequiredException
  extends ServiceException[_CommentContentRequiredExceptionDetails]
     with PostCommentForComparedCommitExceptionsUnion
     with PostCommentForPullRequestExceptionsUnion
     with PostCommentReplyExceptionsUnion
     with UpdateCommentExceptionsUnion {
  @JSName("name")
  var name_CommentContentRequiredException: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.CommentContentRequiredException
}

object CommentContentRequiredException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: _CommentContentRequiredExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.CommentContentRequiredException,
    stack: String = null
  ): CommentContentRequiredException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentContentRequiredException]
  }
}

