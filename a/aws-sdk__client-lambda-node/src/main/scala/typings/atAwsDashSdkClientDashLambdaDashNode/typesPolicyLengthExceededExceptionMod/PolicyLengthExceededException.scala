package typings.atAwsDashSdkClientDashLambdaDashNode.typesPolicyLengthExceededExceptionMod

import typings.atAwsDashSdkClientDashLambdaDashNode.typesAddPermissionExceptionsUnionMod.AddPermissionExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolicyLengthExceededException
  extends ServiceException[_PolicyLengthExceededExceptionDetails]
     with AddPermissionExceptionsUnion {
  @JSName("name")
  var name_PolicyLengthExceededException: typings.atAwsDashSdkClientDashLambdaDashNode.atAwsDashSdkClientDashLambdaDashNodeStrings.PolicyLengthExceededException
}

object PolicyLengthExceededException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: _PolicyLengthExceededExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashLambdaDashNode.atAwsDashSdkClientDashLambdaDashNodeStrings.PolicyLengthExceededException,
    stack: String = null
  ): PolicyLengthExceededException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyLengthExceededException]
  }
}

