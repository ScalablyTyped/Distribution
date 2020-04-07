package typings.awsSdkClientCodecommitNode.typesInvalidOrderExceptionMod

import typings.awsSdkClientCodecommitNode.listRepositoriesExceptionsUnionMod.ListRepositoriesExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidOrderException
  extends ServiceException[InvalidOrderExceptionDetails]
     with ListRepositoriesExceptionsUnion {
  @JSName("name")
  var name_InvalidOrderException: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidOrderException
}

object InvalidOrderException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: InvalidOrderExceptionDetails,
    message: String,
    name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidOrderException,
    stack: String = null
  ): InvalidOrderException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidOrderException]
  }
}

