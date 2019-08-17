package typings.atAwsDashSdkClientDashCodecommitDashNode.typesInvalidOrderExceptionMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesListRepositoriesExceptionsUnionMod.ListRepositoriesExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidOrderException
  extends ServiceException[_InvalidOrderExceptionDetails]
     with ListRepositoriesExceptionsUnion {
  @JSName("name")
  var name_InvalidOrderException: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.InvalidOrderException
}

object InvalidOrderException {
  @scala.inline
  def apply(
    details: _InvalidOrderExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.InvalidOrderException,
    stack: String = null
  ): InvalidOrderException = {
    val __obj = js.Dynamic.literal(details = details, message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[InvalidOrderException]
  }
}

