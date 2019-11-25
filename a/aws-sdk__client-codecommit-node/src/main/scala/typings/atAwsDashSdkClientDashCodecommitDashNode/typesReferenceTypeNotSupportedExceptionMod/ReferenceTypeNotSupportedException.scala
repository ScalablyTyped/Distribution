package typings.atAwsDashSdkClientDashCodecommitDashNode.typesReferenceTypeNotSupportedExceptionMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesCreatePullRequestExceptionsUnionMod.CreatePullRequestExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReferenceTypeNotSupportedException
  extends ServiceException[_ReferenceTypeNotSupportedExceptionDetails]
     with CreatePullRequestExceptionsUnion {
  @JSName("name")
  var name_ReferenceTypeNotSupportedException: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.ReferenceTypeNotSupportedException
}

object ReferenceTypeNotSupportedException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: _ReferenceTypeNotSupportedExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashCodecommitDashNode.atAwsDashSdkClientDashCodecommitDashNodeStrings.ReferenceTypeNotSupportedException,
    stack: String = null
  ): ReferenceTypeNotSupportedException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReferenceTypeNotSupportedException]
  }
}

