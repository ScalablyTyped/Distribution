package typings.atAwsDashSdkClientDashCodecommitDashNode.typesInvalidTitleExceptionMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesCreatePullRequestExceptionsUnionMod.CreatePullRequestExceptionsUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesUpdatePullRequestTitleExceptionsUnionMod.UpdatePullRequestTitleExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvalidTitleException
  extends ServiceException[_InvalidTitleExceptionDetails]
     with CreatePullRequestExceptionsUnion
     with UpdatePullRequestTitleExceptionsUnion {
  @JSName("name")
  var name_InvalidTitleException: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.InvalidTitleException = js.native
}

