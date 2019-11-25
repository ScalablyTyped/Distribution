package typings.atAwsDashSdkClientDashCodecommitDashNode.typesMultipleRepositoriesInPullRequestExceptionMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesCreatePullRequestExceptionsUnionMod.CreatePullRequestExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
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
    $metadata: ResponseMetadata,
    details: _MultipleRepositoriesInPullRequestExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.MultipleRepositoriesInPullRequestException,
    stack: String = null
  ): MultipleRepositoriesInPullRequestException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultipleRepositoriesInPullRequestException]
  }
}

