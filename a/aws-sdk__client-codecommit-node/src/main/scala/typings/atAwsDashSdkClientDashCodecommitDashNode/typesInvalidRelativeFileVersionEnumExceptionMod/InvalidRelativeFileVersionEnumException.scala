package typings.atAwsDashSdkClientDashCodecommitDashNode.typesInvalidRelativeFileVersionEnumExceptionMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesPostCommentForComparedCommitExceptionsUnionMod.PostCommentForComparedCommitExceptionsUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesPostCommentForPullRequestExceptionsUnionMod.PostCommentForPullRequestExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
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
    details: _InvalidRelativeFileVersionEnumExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.InvalidRelativeFileVersionEnumException,
    stack: String = null
  ): InvalidRelativeFileVersionEnumException = {
    val __obj = js.Dynamic.literal(details = details, message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[InvalidRelativeFileVersionEnumException]
  }
}

