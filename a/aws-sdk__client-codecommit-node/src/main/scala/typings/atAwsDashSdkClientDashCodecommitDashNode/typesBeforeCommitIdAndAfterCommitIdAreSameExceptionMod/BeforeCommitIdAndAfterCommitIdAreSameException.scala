package typings.atAwsDashSdkClientDashCodecommitDashNode.typesBeforeCommitIdAndAfterCommitIdAreSameExceptionMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesPostCommentForComparedCommitExceptionsUnionMod.PostCommentForComparedCommitExceptionsUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesPostCommentForPullRequestExceptionsUnionMod.PostCommentForPullRequestExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeforeCommitIdAndAfterCommitIdAreSameException
  extends ServiceException[_BeforeCommitIdAndAfterCommitIdAreSameExceptionDetails]
     with PostCommentForComparedCommitExceptionsUnion
     with PostCommentForPullRequestExceptionsUnion {
  @JSName("name")
  var name_BeforeCommitIdAndAfterCommitIdAreSameException: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.BeforeCommitIdAndAfterCommitIdAreSameException
}

object BeforeCommitIdAndAfterCommitIdAreSameException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: _BeforeCommitIdAndAfterCommitIdAreSameExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.BeforeCommitIdAndAfterCommitIdAreSameException,
    stack: String = null
  ): BeforeCommitIdAndAfterCommitIdAreSameException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[BeforeCommitIdAndAfterCommitIdAreSameException]
  }
}

