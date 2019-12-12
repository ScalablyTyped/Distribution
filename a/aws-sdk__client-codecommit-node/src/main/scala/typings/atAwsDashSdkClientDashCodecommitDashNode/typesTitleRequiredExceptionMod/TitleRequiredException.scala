package typings.atAwsDashSdkClientDashCodecommitDashNode.typesTitleRequiredExceptionMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesCreatePullRequestExceptionsUnionMod.CreatePullRequestExceptionsUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesUpdatePullRequestTitleExceptionsUnionMod.UpdatePullRequestTitleExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TitleRequiredException
  extends ServiceException[_TitleRequiredExceptionDetails]
     with CreatePullRequestExceptionsUnion
     with UpdatePullRequestTitleExceptionsUnion {
  @JSName("name")
  var name_TitleRequiredException: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.TitleRequiredException = js.native
}

