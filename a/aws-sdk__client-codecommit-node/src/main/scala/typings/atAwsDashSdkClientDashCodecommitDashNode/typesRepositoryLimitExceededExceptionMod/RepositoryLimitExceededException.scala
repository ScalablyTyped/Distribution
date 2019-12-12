package typings.atAwsDashSdkClientDashCodecommitDashNode.typesRepositoryLimitExceededExceptionMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesCreateRepositoryExceptionsUnionMod.CreateRepositoryExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RepositoryLimitExceededException
  extends ServiceException[_RepositoryLimitExceededExceptionDetails]
     with CreateRepositoryExceptionsUnion {
  @JSName("name")
  var name_RepositoryLimitExceededException: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.RepositoryLimitExceededException = js.native
}

