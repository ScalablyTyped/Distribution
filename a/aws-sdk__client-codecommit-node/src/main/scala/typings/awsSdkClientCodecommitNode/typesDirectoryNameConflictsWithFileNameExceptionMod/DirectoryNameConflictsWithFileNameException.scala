package typings.awsSdkClientCodecommitNode.typesDirectoryNameConflictsWithFileNameExceptionMod

import typings.awsSdkClientCodecommitNode.putFileExceptionsUnionMod.PutFileExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectoryNameConflictsWithFileNameException
  extends ServiceException[DirectoryNameConflictsWithFileNameExceptionDetails]
     with PutFileExceptionsUnion {
  @JSName("name")
  var name_DirectoryNameConflictsWithFileNameException: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.DirectoryNameConflictsWithFileNameException
}

object DirectoryNameConflictsWithFileNameException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: DirectoryNameConflictsWithFileNameExceptionDetails,
    message: String,
    name: typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.DirectoryNameConflictsWithFileNameException,
    stack: String = null
  ): DirectoryNameConflictsWithFileNameException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectoryNameConflictsWithFileNameException]
  }
}

