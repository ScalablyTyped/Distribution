package typings.atAwsDashSdkClientDashCodecommitDashNode.typesInvalidRelativeFileVersionEnumExceptionMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesPostCommentForComparedCommitExceptionsUnionMod.PostCommentForComparedCommitExceptionsUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesPostCommentForPullRequestExceptionsUnionMod.PostCommentForPullRequestExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidRelativeFileVersionEnumException
  extends ServiceException[_InvalidRelativeFileVersionEnumExceptionDetails]
     with PostCommentForComparedCommitExceptionsUnion
     with PostCommentForPullRequestExceptionsUnion {
  @JSName("name")
  var name_InvalidRelativeFileVersionEnumException: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.InvalidRelativeFileVersionEnumException
}

object InvalidRelativeFileVersionEnumException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: _InvalidRelativeFileVersionEnumExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.InvalidRelativeFileVersionEnumException,
    stack: String = null
  ): InvalidRelativeFileVersionEnumException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidRelativeFileVersionEnumException]
  }
}

