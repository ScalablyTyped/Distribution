package typings.atAwsDashSdkClientDashCodecommitDashNode.typesMaximumRepositoryNamesExceededExceptionMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesBatchGetRepositoriesExceptionsUnionMod.BatchGetRepositoriesExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaximumRepositoryNamesExceededException
  extends ServiceException[_MaximumRepositoryNamesExceededExceptionDetails]
     with BatchGetRepositoriesExceptionsUnion {
  @JSName("name")
  var name_MaximumRepositoryNamesExceededException: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.MaximumRepositoryNamesExceededException
}

object MaximumRepositoryNamesExceededException {
  @scala.inline
  def apply(
    details: _MaximumRepositoryNamesExceededExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.MaximumRepositoryNamesExceededException,
    stack: String = null
  ): MaximumRepositoryNamesExceededException = {
    val __obj = js.Dynamic.literal(details = details, message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[MaximumRepositoryNamesExceededException]
  }
}

