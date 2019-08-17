package typings.atAwsDashSdkClientDashCodecommitDashNode.typesFileNameConflictsWithDirectoryNameExceptionMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesPutFileExceptionsUnionMod.PutFileExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
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
    details: _FileNameConflictsWithDirectoryNameExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.FileNameConflictsWithDirectoryNameException,
    stack: String = null
  ): FileNameConflictsWithDirectoryNameException = {
    val __obj = js.Dynamic.literal(details = details, message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[FileNameConflictsWithDirectoryNameException]
  }
}

