package typings.atAwsDashSdkClientDashCodecommitDashNode.typesReferenceDoesNotExistExceptionMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesCreatePullRequestExceptionsUnionMod.CreatePullRequestExceptionsUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesMergePullRequestByFastForwardExceptionsUnionMod.MergePullRequestByFastForwardExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReferenceDoesNotExistException
  extends ServiceException[_ReferenceDoesNotExistExceptionDetails]
     with CreatePullRequestExceptionsUnion
     with MergePullRequestByFastForwardExceptionsUnion {
  @JSName("name")
  var name_ReferenceDoesNotExistException: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.ReferenceDoesNotExistException
}

object ReferenceDoesNotExistException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: _ReferenceDoesNotExistExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.ReferenceDoesNotExistException,
    stack: String = null
  ): ReferenceDoesNotExistException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReferenceDoesNotExistException]
  }
}

