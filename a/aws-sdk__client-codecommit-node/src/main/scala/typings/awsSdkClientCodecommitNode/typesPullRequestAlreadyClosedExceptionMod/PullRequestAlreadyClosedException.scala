package typings.awsSdkClientCodecommitNode.typesPullRequestAlreadyClosedExceptionMod

import typings.awsSdkClientCodecommitNode.mergePullRequestByFastForwardExceptionsUnionMod.MergePullRequestByFastForwardExceptionsUnion
import typings.awsSdkClientCodecommitNode.updatePullRequestDescriptionExceptionsUnionMod.UpdatePullRequestDescriptionExceptionsUnion
import typings.awsSdkClientCodecommitNode.updatePullRequestTitleExceptionsUnionMod.UpdatePullRequestTitleExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullRequestAlreadyClosedException
  extends ServiceException[PullRequestAlreadyClosedExceptionDetails]
     with MergePullRequestByFastForwardExceptionsUnion
     with UpdatePullRequestDescriptionExceptionsUnion
     with UpdatePullRequestTitleExceptionsUnion {
  @JSName("name")
  var name_PullRequestAlreadyClosedException: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.PullRequestAlreadyClosedException
}

object PullRequestAlreadyClosedException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: PullRequestAlreadyClosedExceptionDetails,
    message: String,
    name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.PullRequestAlreadyClosedException,
    stack: String = null
  ): PullRequestAlreadyClosedException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullRequestAlreadyClosedException]
  }
}

