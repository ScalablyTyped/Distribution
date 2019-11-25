package typings.atAwsDashSdkClientDashCodecommitDashNode.typesCommitRequiredExceptionMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesGetDifferencesExceptionsUnionMod.GetDifferencesExceptionsUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesGetMergeConflictsExceptionsUnionMod.GetMergeConflictsExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommitRequiredException
  extends ServiceException[_CommitRequiredExceptionDetails]
     with GetDifferencesExceptionsUnion
     with GetMergeConflictsExceptionsUnion {
  @JSName("name")
  var name_CommitRequiredException: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.CommitRequiredException
}

object CommitRequiredException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: _CommitRequiredExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.CommitRequiredException,
    stack: String = null
  ): CommitRequiredException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommitRequiredException]
  }
}

