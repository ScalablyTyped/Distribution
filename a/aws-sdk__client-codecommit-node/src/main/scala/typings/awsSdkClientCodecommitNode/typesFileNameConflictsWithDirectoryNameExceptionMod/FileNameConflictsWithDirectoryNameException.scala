package typings.awsSdkClientCodecommitNode.typesFileNameConflictsWithDirectoryNameExceptionMod

import typings.awsSdkClientCodecommitNode.putFileExceptionsUnionMod.PutFileExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileNameConflictsWithDirectoryNameException
  extends ServiceException[FileNameConflictsWithDirectoryNameExceptionDetails]
     with PutFileExceptionsUnion {
  @JSName("name")
  var name_FileNameConflictsWithDirectoryNameException: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.FileNameConflictsWithDirectoryNameException
}

object FileNameConflictsWithDirectoryNameException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: FileNameConflictsWithDirectoryNameExceptionDetails,
    message: String,
    name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.FileNameConflictsWithDirectoryNameException,
    stack: String = null
  ): FileNameConflictsWithDirectoryNameException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileNameConflictsWithDirectoryNameException]
  }
}

