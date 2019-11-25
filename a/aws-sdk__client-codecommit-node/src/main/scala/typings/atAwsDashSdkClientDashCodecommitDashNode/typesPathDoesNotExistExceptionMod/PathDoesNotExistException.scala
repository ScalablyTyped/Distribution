package typings.atAwsDashSdkClientDashCodecommitDashNode.typesPathDoesNotExistExceptionMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesGetDifferencesExceptionsUnionMod.GetDifferencesExceptionsUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesPostCommentForComparedCommitExceptionsUnionMod.PostCommentForComparedCommitExceptionsUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesPostCommentForPullRequestExceptionsUnionMod.PostCommentForPullRequestExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PathDoesNotExistException
  extends ServiceException[_PathDoesNotExistExceptionDetails]
     with GetDifferencesExceptionsUnion
     with PostCommentForComparedCommitExceptionsUnion
     with PostCommentForPullRequestExceptionsUnion {
  @JSName("name")
  var name_PathDoesNotExistException: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.PathDoesNotExistException
}

object PathDoesNotExistException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: _PathDoesNotExistExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.PathDoesNotExistException,
    stack: String = null
  ): PathDoesNotExistException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathDoesNotExistException]
  }
}

