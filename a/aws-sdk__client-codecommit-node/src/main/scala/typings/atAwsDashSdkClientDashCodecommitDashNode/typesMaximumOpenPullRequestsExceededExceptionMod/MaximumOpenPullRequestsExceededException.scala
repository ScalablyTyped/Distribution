package typings.atAwsDashSdkClientDashCodecommitDashNode.typesMaximumOpenPullRequestsExceededExceptionMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesCreatePullRequestExceptionsUnionMod.CreatePullRequestExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaximumOpenPullRequestsExceededException
  extends ServiceException[_MaximumOpenPullRequestsExceededExceptionDetails]
     with CreatePullRequestExceptionsUnion {
  @JSName("name")
  var name_MaximumOpenPullRequestsExceededException: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.MaximumOpenPullRequestsExceededException
}

object MaximumOpenPullRequestsExceededException {
  @scala.inline
  def apply(
    details: _MaximumOpenPullRequestsExceededExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.MaximumOpenPullRequestsExceededException,
    stack: String = null
  ): MaximumOpenPullRequestsExceededException = {
    val __obj = js.Dynamic.literal(details = details, message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[MaximumOpenPullRequestsExceededException]
  }
}

