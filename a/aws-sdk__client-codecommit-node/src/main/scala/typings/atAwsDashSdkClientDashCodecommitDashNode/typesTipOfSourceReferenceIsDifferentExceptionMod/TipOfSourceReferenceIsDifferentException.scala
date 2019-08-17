package typings.atAwsDashSdkClientDashCodecommitDashNode.typesTipOfSourceReferenceIsDifferentExceptionMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesMergePullRequestByFastForwardExceptionsUnionMod.MergePullRequestByFastForwardExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TipOfSourceReferenceIsDifferentException
  extends ServiceException[_TipOfSourceReferenceIsDifferentExceptionDetails]
     with MergePullRequestByFastForwardExceptionsUnion {
  @JSName("name")
  var name_TipOfSourceReferenceIsDifferentException: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.TipOfSourceReferenceIsDifferentException
}

object TipOfSourceReferenceIsDifferentException {
  @scala.inline
  def apply(
    details: _TipOfSourceReferenceIsDifferentExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.TipOfSourceReferenceIsDifferentException,
    stack: String = null
  ): TipOfSourceReferenceIsDifferentException = {
    val __obj = js.Dynamic.literal(details = details, message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[TipOfSourceReferenceIsDifferentException]
  }
}

