package typings.atAwsDashSdkClientDashCodecommitDashNode.typesMultipleRepositoriesInPullRequestExceptionMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesCreatePullRequestExceptionsUnionMod.CreatePullRequestExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultipleRepositoriesInPullRequestException
  extends ServiceException[_MultipleRepositoriesInPullRequestExceptionDetails]
     with CreatePullRequestExceptionsUnion {
  @JSName("name")
  var name_MultipleRepositoriesInPullRequestException: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.MultipleRepositoriesInPullRequestException
}

object MultipleRepositoriesInPullRequestException {
  @scala.inline
  def apply(
    details: _MultipleRepositoriesInPullRequestExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.MultipleRepositoriesInPullRequestException,
    stack: String = null
  ): MultipleRepositoriesInPullRequestException = {
    val __obj = js.Dynamic.literal(details = details, message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[MultipleRepositoriesInPullRequestException]
  }
}

