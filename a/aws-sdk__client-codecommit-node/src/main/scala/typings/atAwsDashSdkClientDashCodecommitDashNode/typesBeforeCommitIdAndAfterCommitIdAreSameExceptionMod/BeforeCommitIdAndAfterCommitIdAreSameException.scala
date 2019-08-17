package typings.atAwsDashSdkClientDashCodecommitDashNode.typesBeforeCommitIdAndAfterCommitIdAreSameExceptionMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesPostCommentForComparedCommitExceptionsUnionMod.PostCommentForComparedCommitExceptionsUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesPostCommentForPullRequestExceptionsUnionMod.PostCommentForPullRequestExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
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
    details: _BeforeCommitIdAndAfterCommitIdAreSameExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.BeforeCommitIdAndAfterCommitIdAreSameException,
    stack: String = null
  ): BeforeCommitIdAndAfterCommitIdAreSameException = {
    val __obj = js.Dynamic.literal(details = details, message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[BeforeCommitIdAndAfterCommitIdAreSameException]
  }
}

