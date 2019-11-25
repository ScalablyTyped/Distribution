package typings.atAwsDashSdkClientDashCodecommitDashNode.typesReferenceNameRequiredExceptionMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesCreatePullRequestExceptionsUnionMod.CreatePullRequestExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReferenceNameRequiredException
  extends ServiceException[_ReferenceNameRequiredExceptionDetails]
     with CreatePullRequestExceptionsUnion {
  @JSName("name")
  var name_ReferenceNameRequiredException: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.ReferenceNameRequiredException
}

object ReferenceNameRequiredException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: _ReferenceNameRequiredExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.ReferenceNameRequiredException,
    stack: String = null
  ): ReferenceNameRequiredException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReferenceNameRequiredException]
  }
}

