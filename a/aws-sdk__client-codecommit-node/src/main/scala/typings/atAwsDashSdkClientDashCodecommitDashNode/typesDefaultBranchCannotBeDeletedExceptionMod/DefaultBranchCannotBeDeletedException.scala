package typings.atAwsDashSdkClientDashCodecommitDashNode.typesDefaultBranchCannotBeDeletedExceptionMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesDeleteBranchExceptionsUnionMod.DeleteBranchExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultBranchCannotBeDeletedException
  extends ServiceException[_DefaultBranchCannotBeDeletedExceptionDetails]
     with DeleteBranchExceptionsUnion {
  @JSName("name")
  var name_DefaultBranchCannotBeDeletedException: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.DefaultBranchCannotBeDeletedException
}

object DefaultBranchCannotBeDeletedException {
  @scala.inline
  def apply(
    details: _DefaultBranchCannotBeDeletedExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.DefaultBranchCannotBeDeletedException,
    stack: String = null
  ): DefaultBranchCannotBeDeletedException = {
    val __obj = js.Dynamic.literal(details = details, message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[DefaultBranchCannotBeDeletedException]
  }
}

