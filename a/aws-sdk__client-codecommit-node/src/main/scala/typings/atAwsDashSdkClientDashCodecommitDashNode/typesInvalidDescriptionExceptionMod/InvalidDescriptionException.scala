package typings.atAwsDashSdkClientDashCodecommitDashNode.typesInvalidDescriptionExceptionMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesCreatePullRequestExceptionsUnionMod.CreatePullRequestExceptionsUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesUpdatePullRequestDescriptionExceptionsUnionMod.UpdatePullRequestDescriptionExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidDescriptionException
  extends ServiceException[_InvalidDescriptionExceptionDetails]
     with CreatePullRequestExceptionsUnion
     with UpdatePullRequestDescriptionExceptionsUnion {
  @JSName("name")
  var name_InvalidDescriptionException: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.InvalidDescriptionException
}

object InvalidDescriptionException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: _InvalidDescriptionExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.InvalidDescriptionException,
    stack: String = null
  ): InvalidDescriptionException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidDescriptionException]
  }
}

