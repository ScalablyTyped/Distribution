package typings.awsSdkClientCodecommitNode.typesInvalidDeletionParameterExceptionMod

import typings.awsSdkClientCodecommitNode.putFileExceptionsUnionMod.PutFileExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidDeletionParameterException
  extends ServiceException[InvalidDeletionParameterExceptionDetails]
     with PutFileExceptionsUnion {
  @JSName("name")
  var name_InvalidDeletionParameterException: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidDeletionParameterException
}

object InvalidDeletionParameterException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: InvalidDeletionParameterExceptionDetails,
    message: String,
    name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidDeletionParameterException,
    stack: String = null
  ): InvalidDeletionParameterException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidDeletionParameterException]
  }
}

