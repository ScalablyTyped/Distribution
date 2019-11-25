package typings.atAwsDashSdkClientDashCodecommitDashNode.typesInvalidMergeOptionExceptionMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesGetMergeConflictsExceptionsUnionMod.GetMergeConflictsExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidMergeOptionException
  extends ServiceException[_InvalidMergeOptionExceptionDetails]
     with GetMergeConflictsExceptionsUnion {
  @JSName("name")
  var name_InvalidMergeOptionException: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.InvalidMergeOptionException
}

object InvalidMergeOptionException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: _InvalidMergeOptionExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.InvalidMergeOptionException,
    stack: String = null
  ): InvalidMergeOptionException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidMergeOptionException]
  }
}

