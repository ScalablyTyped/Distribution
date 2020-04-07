package typings.awsSdkClientCodecommitNode.typesInvalidPullRequestStatusExceptionMod

import typings.awsSdkClientCodecommitNode.listPullRequestsExceptionsUnionMod.ListPullRequestsExceptionsUnion
import typings.awsSdkClientCodecommitNode.updatePullRequestStatusExceptionsUnionMod.UpdatePullRequestStatusExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidPullRequestStatusException
  extends ServiceException[InvalidPullRequestStatusExceptionDetails]
     with ListPullRequestsExceptionsUnion
     with UpdatePullRequestStatusExceptionsUnion {
  @JSName("name")
  var name_InvalidPullRequestStatusException: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidPullRequestStatusException
}

object InvalidPullRequestStatusException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: InvalidPullRequestStatusExceptionDetails,
    message: String,
    name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidPullRequestStatusException,
    stack: String = null
  ): InvalidPullRequestStatusException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidPullRequestStatusException]
  }
}

