package typings.atAwsDashSdkClientDashCodecommitDashNode.typesDirectoryNameConflictsWithFileNameExceptionMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesPutFileExceptionsUnionMod.PutFileExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectoryNameConflictsWithFileNameException
  extends ServiceException[_DirectoryNameConflictsWithFileNameExceptionDetails]
     with PutFileExceptionsUnion {
  @JSName("name")
  var name_DirectoryNameConflictsWithFileNameException: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.DirectoryNameConflictsWithFileNameException
}

object DirectoryNameConflictsWithFileNameException {
  @scala.inline
  def apply(
    details: _DirectoryNameConflictsWithFileNameExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.DirectoryNameConflictsWithFileNameException,
    stack: String = null
  ): DirectoryNameConflictsWithFileNameException = {
    val __obj = js.Dynamic.literal(details = details, message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[DirectoryNameConflictsWithFileNameException]
  }
}

