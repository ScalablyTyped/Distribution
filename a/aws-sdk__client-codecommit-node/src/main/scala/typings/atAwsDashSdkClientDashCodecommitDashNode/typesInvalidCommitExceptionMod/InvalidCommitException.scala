package typings.atAwsDashSdkClientDashCodecommitDashNode.typesInvalidCommitExceptionMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesGetDifferencesExceptionsUnionMod.GetDifferencesExceptionsUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesGetFileExceptionsUnionMod.GetFileExceptionsUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesGetFolderExceptionsUnionMod.GetFolderExceptionsUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesGetMergeConflictsExceptionsUnionMod.GetMergeConflictsExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidCommitException
  extends ServiceException[_InvalidCommitExceptionDetails]
     with GetDifferencesExceptionsUnion
     with GetFileExceptionsUnion
     with GetFolderExceptionsUnion
     with GetMergeConflictsExceptionsUnion {
  @JSName("name")
  var name_InvalidCommitException: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.InvalidCommitException
}

object InvalidCommitException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: _InvalidCommitExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.InvalidCommitException,
    stack: String = null
  ): InvalidCommitException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidCommitException]
  }
}

