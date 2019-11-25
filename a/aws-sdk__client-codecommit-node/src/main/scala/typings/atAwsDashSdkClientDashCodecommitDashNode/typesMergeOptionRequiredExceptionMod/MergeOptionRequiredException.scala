package typings.atAwsDashSdkClientDashCodecommitDashNode.typesMergeOptionRequiredExceptionMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesGetMergeConflictsExceptionsUnionMod.GetMergeConflictsExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MergeOptionRequiredException
  extends ServiceException[_MergeOptionRequiredExceptionDetails]
     with GetMergeConflictsExceptionsUnion {
  @JSName("name")
  var name_MergeOptionRequiredException: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.MergeOptionRequiredException
}

object MergeOptionRequiredException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: _MergeOptionRequiredExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.MergeOptionRequiredException,
    stack: String = null
  ): MergeOptionRequiredException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[MergeOptionRequiredException]
  }
}

