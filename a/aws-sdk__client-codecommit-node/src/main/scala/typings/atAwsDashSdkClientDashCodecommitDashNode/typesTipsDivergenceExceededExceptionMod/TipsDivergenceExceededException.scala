package typings.atAwsDashSdkClientDashCodecommitDashNode.typesTipsDivergenceExceededExceptionMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesGetMergeConflictsExceptionsUnionMod.GetMergeConflictsExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TipsDivergenceExceededException
  extends ServiceException[_TipsDivergenceExceededExceptionDetails]
     with GetMergeConflictsExceptionsUnion {
  @JSName("name")
  var name_TipsDivergenceExceededException: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.TipsDivergenceExceededException
}

object TipsDivergenceExceededException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: _TipsDivergenceExceededExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.TipsDivergenceExceededException,
    stack: String = null
  ): TipsDivergenceExceededException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[TipsDivergenceExceededException]
  }
}

