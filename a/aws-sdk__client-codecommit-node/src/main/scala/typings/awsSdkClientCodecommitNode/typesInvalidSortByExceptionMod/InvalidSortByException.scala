package typings.awsSdkClientCodecommitNode.typesInvalidSortByExceptionMod

import typings.awsSdkClientCodecommitNode.listRepositoriesExceptionsUnionMod.ListRepositoriesExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidSortByException
  extends ServiceException[InvalidSortByExceptionDetails]
     with ListRepositoriesExceptionsUnion {
  @JSName("name")
  var name_InvalidSortByException: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidSortByException
}

object InvalidSortByException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: InvalidSortByExceptionDetails,
    message: String,
    name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidSortByException,
    stack: String = null
  ): InvalidSortByException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidSortByException]
  }
}

