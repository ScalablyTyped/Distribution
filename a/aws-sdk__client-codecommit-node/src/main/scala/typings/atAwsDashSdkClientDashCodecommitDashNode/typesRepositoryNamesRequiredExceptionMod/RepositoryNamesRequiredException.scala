package typings.atAwsDashSdkClientDashCodecommitDashNode.typesRepositoryNamesRequiredExceptionMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesBatchGetRepositoriesExceptionsUnionMod.BatchGetRepositoriesExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RepositoryNamesRequiredException
  extends ServiceException[_RepositoryNamesRequiredExceptionDetails]
     with BatchGetRepositoriesExceptionsUnion {
  @JSName("name")
  var name_RepositoryNamesRequiredException: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.RepositoryNamesRequiredException
}

object RepositoryNamesRequiredException {
  @scala.inline
  def apply(
    details: _RepositoryNamesRequiredExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.RepositoryNamesRequiredException,
    stack: String = null
  ): RepositoryNamesRequiredException = {
    val __obj = js.Dynamic.literal(details = details, message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[RepositoryNamesRequiredException]
  }
}

