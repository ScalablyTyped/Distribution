package typings.awsSdkClientCodecommitNode.typesInvalidPullRequestStatusUpdateExceptionMod

import typings.awsSdkClientCodecommitNode.updatePullRequestStatusExceptionsUnionMod.UpdatePullRequestStatusExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidPullRequestStatusUpdateException
  extends ServiceException[InvalidPullRequestStatusUpdateExceptionDetails]
     with UpdatePullRequestStatusExceptionsUnion {
  @JSName("name")
  var name_InvalidPullRequestStatusUpdateException: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidPullRequestStatusUpdateException
}

object InvalidPullRequestStatusUpdateException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: InvalidPullRequestStatusUpdateExceptionDetails,
    message: String,
    name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidPullRequestStatusUpdateException,
    stack: String = null
  ): InvalidPullRequestStatusUpdateException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidPullRequestStatusUpdateException]
  }
}

