package typings.awsSdkClientCodecommitNode.typesMaximumOpenPullRequestsExceededExceptionMod

import typings.awsSdkClientCodecommitNode.createPullRequestExceptionsUnionMod.CreatePullRequestExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaximumOpenPullRequestsExceededException
  extends ServiceException[MaximumOpenPullRequestsExceededExceptionDetails]
     with CreatePullRequestExceptionsUnion {
  @JSName("name")
  var name_MaximumOpenPullRequestsExceededException: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.MaximumOpenPullRequestsExceededException
}

object MaximumOpenPullRequestsExceededException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: MaximumOpenPullRequestsExceededExceptionDetails,
    message: String,
    name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.MaximumOpenPullRequestsExceededException,
    stack: String = null
  ): MaximumOpenPullRequestsExceededException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaximumOpenPullRequestsExceededException]
  }
}

