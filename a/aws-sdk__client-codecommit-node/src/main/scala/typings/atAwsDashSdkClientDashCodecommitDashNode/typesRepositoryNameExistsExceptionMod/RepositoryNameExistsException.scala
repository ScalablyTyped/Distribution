package typings.atAwsDashSdkClientDashCodecommitDashNode.typesRepositoryNameExistsExceptionMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesCreateRepositoryExceptionsUnionMod.CreateRepositoryExceptionsUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesUpdateRepositoryNameExceptionsUnionMod.UpdateRepositoryNameExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RepositoryNameExistsException
  extends ServiceException[_RepositoryNameExistsExceptionDetails]
     with CreateRepositoryExceptionsUnion
     with UpdateRepositoryNameExceptionsUnion {
  @JSName("name")
  var name_RepositoryNameExistsException: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.RepositoryNameExistsException
}

object RepositoryNameExistsException {
  @scala.inline
  def apply(
    details: _RepositoryNameExistsExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.RepositoryNameExistsException,
    stack: String = null
  ): RepositoryNameExistsException = {
    val __obj = js.Dynamic.literal(details = details, message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[RepositoryNameExistsException]
  }
}

