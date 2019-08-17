package typings.atAwsDashSdkClientDashCodecommitDashNode.typesInvalidSortByExceptionMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesListRepositoriesExceptionsUnionMod.ListRepositoriesExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidSortByException
  extends ServiceException[_InvalidSortByExceptionDetails]
     with ListRepositoriesExceptionsUnion {
  @JSName("name")
  var name_InvalidSortByException: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.InvalidSortByException
}

object InvalidSortByException {
  @scala.inline
  def apply(
    details: _InvalidSortByExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.InvalidSortByException,
    stack: String = null
  ): InvalidSortByException = {
    val __obj = js.Dynamic.literal(details = details, message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[InvalidSortByException]
  }
}

