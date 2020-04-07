package typings.awsSdkClientCodecommitNode.typesFileTooLargeExceptionMod

import typings.awsSdkClientCodecommitNode.getBlobExceptionsUnionMod.GetBlobExceptionsUnion
import typings.awsSdkClientCodecommitNode.getFileExceptionsUnionMod.GetFileExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileTooLargeException
  extends ServiceException[FileTooLargeExceptionDetails]
     with GetBlobExceptionsUnion
     with GetFileExceptionsUnion {
  @JSName("name")
  var name_FileTooLargeException: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.FileTooLargeException
}

object FileTooLargeException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: FileTooLargeExceptionDetails,
    message: String,
    name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.FileTooLargeException,
    stack: String = null
  ): FileTooLargeException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileTooLargeException]
  }
}

