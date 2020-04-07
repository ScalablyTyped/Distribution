package typings.awsSdkClientCodecommitNode.typesInvalidDescriptionExceptionMod

import typings.awsSdkClientCodecommitNode.createPullRequestExceptionsUnionMod.CreatePullRequestExceptionsUnion
import typings.awsSdkClientCodecommitNode.updatePullRequestDescriptionExceptionsUnionMod.UpdatePullRequestDescriptionExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidDescriptionException
  extends ServiceException[InvalidDescriptionExceptionDetails]
     with CreatePullRequestExceptionsUnion
     with UpdatePullRequestDescriptionExceptionsUnion {
  @JSName("name")
  var name_InvalidDescriptionException: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidDescriptionException
}

object InvalidDescriptionException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: InvalidDescriptionExceptionDetails,
    message: String,
    name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidDescriptionException,
    stack: String = null
  ): InvalidDescriptionException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidDescriptionException]
  }
}

