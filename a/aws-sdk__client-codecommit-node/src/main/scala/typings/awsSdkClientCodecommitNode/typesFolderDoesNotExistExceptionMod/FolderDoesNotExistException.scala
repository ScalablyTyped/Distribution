package typings.awsSdkClientCodecommitNode.typesFolderDoesNotExistExceptionMod

import typings.awsSdkClientCodecommitNode.getFolderExceptionsUnionMod.GetFolderExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FolderDoesNotExistException
  extends ServiceException[FolderDoesNotExistExceptionDetails]
     with GetFolderExceptionsUnion {
  @JSName("name")
  var name_FolderDoesNotExistException: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.FolderDoesNotExistException
}

object FolderDoesNotExistException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: FolderDoesNotExistExceptionDetails,
    message: String,
    name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.FolderDoesNotExistException,
    stack: String = null
  ): FolderDoesNotExistException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[FolderDoesNotExistException]
  }
}

