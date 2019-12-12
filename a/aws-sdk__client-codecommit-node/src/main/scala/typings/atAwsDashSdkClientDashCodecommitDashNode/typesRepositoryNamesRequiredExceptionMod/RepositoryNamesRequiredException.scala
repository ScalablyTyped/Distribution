package typings.atAwsDashSdkClientDashCodecommitDashNode.typesRepositoryNamesRequiredExceptionMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesBatchGetRepositoriesExceptionsUnionMod.BatchGetRepositoriesExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RepositoryNamesRequiredException
  extends ServiceException[_RepositoryNamesRequiredExceptionDetails]
     with BatchGetRepositoriesExceptionsUnion {
  @JSName("name")
  var name_RepositoryNamesRequiredException: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.RepositoryNamesRequiredException = js.native
}

