package typings.atAwsDashSdkClientDashCodecommitDashNode.typesFileNameConflictsWithDirectoryNameExceptionMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesPutFileExceptionsUnionMod.PutFileExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileNameConflictsWithDirectoryNameException
  extends ServiceException[_FileNameConflictsWithDirectoryNameExceptionDetails]
     with PutFileExceptionsUnion {
  @JSName("name")
  var name_FileNameConflictsWithDirectoryNameException: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.FileNameConflictsWithDirectoryNameException
}

object FileNameConflictsWithDirectoryNameException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: _FileNameConflictsWithDirectoryNameExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.FileNameConflictsWithDirectoryNameException,
    stack: String = null
  ): FileNameConflictsWithDirectoryNameException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileNameConflictsWithDirectoryNameException]
  }
}

