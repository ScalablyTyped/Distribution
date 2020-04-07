package typings.awsSdkClientCodecommitNode.typesInvalidFileModeExceptionMod

import typings.awsSdkClientCodecommitNode.putFileExceptionsUnionMod.PutFileExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidFileModeException
  extends ServiceException[InvalidFileModeExceptionDetails]
     with PutFileExceptionsUnion {
  @JSName("name")
  var name_InvalidFileModeException: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidFileModeException
}

object InvalidFileModeException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: InvalidFileModeExceptionDetails,
    message: String,
    name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.InvalidFileModeException,
    stack: String = null
  ): InvalidFileModeException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidFileModeException]
  }
}

