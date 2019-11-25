package typings.atAwsDashSdkClientDashLambdaDashNode.typesRequestTooLargeExceptionMod

import typings.atAwsDashSdkClientDashLambdaDashNode.typesInvokeExceptionsUnionMod.InvokeExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestTooLargeException
  extends ServiceException[_RequestTooLargeExceptionDetails]
     with InvokeExceptionsUnion {
  @JSName("name")
  var name_RequestTooLargeException: typings.atAwsDashSdkClientDashLambdaDashNode.atAwsDashSdkClientDashLambdaDashNodeStrings.RequestTooLargeException
}

object RequestTooLargeException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: _RequestTooLargeExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashLambdaDashNode.atAwsDashSdkClientDashLambdaDashNodeStrings.RequestTooLargeException,
    stack: String = null
  ): RequestTooLargeException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestTooLargeException]
  }
}

