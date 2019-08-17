package typings.atAwsDashSdkClientDashCodecommitDashNode.typesMergeOptionRequiredExceptionMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesGetMergeConflictsExceptionsUnionMod.GetMergeConflictsExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
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
    details: _MergeOptionRequiredExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.MergeOptionRequiredException,
    stack: String = null
  ): MergeOptionRequiredException = {
    val __obj = js.Dynamic.literal(details = details, message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[MergeOptionRequiredException]
  }
}

