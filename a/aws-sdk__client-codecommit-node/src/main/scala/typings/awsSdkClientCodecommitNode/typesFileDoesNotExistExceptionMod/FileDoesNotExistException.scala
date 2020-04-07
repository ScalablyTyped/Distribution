package typings.awsSdkClientCodecommitNode.typesFileDoesNotExistExceptionMod

import typings.awsSdkClientCodecommitNode.deleteFileExceptionsUnionMod.DeleteFileExceptionsUnion
import typings.awsSdkClientCodecommitNode.getFileExceptionsUnionMod.GetFileExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileDoesNotExistException
  extends ServiceException[FileDoesNotExistExceptionDetails]
     with DeleteFileExceptionsUnion
     with GetFileExceptionsUnion {
  @JSName("name")
  var name_FileDoesNotExistException: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.FileDoesNotExistException
}

object FileDoesNotExistException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: FileDoesNotExistExceptionDetails,
    message: String,
    name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.FileDoesNotExistException,
    stack: String = null
  ): FileDoesNotExistException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileDoesNotExistException]
  }
}

