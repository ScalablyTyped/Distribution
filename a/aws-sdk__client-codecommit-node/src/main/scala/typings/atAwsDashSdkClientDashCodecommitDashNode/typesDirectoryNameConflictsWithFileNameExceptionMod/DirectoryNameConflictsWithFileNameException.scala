package typings.atAwsDashSdkClientDashCodecommitDashNode.typesDirectoryNameConflictsWithFileNameExceptionMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesPutFileExceptionsUnionMod.PutFileExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
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
    $metadata: ResponseMetadata,
    details: _DirectoryNameConflictsWithFileNameExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.DirectoryNameConflictsWithFileNameException,
    stack: String = null
  ): DirectoryNameConflictsWithFileNameException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectoryNameConflictsWithFileNameException]
  }
}

