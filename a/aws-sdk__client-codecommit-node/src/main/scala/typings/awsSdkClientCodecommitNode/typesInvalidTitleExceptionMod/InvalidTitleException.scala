package typings.awsSdkClientCodecommitNode.typesInvalidTitleExceptionMod

import typings.awsSdkClientCodecommitNode.createPullRequestExceptionsUnionMod.CreatePullRequestExceptionsUnion
import typings.awsSdkClientCodecommitNode.updatePullRequestTitleExceptionsUnionMod.UpdatePullRequestTitleExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidTitleException
  extends ServiceException[InvalidTitleExceptionDetails]
     with CreatePullRequestExceptionsUnion
     with UpdatePullRequestTitleExceptionsUnion {
  @JSName("name")
  var name_InvalidTitleException: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidTitleException
}

object InvalidTitleException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: InvalidTitleExceptionDetails,
    message: String,
    name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidTitleException,
    stack: String = null
  ): InvalidTitleException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidTitleException]
  }
}

