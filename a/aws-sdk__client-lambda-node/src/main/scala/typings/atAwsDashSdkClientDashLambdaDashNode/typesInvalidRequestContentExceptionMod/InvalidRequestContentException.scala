package typings.atAwsDashSdkClientDashLambdaDashNode.typesInvalidRequestContentExceptionMod

import typings.atAwsDashSdkClientDashLambdaDashNode.typesInvokeAsyncExceptionsUnionMod.InvokeAsyncExceptionsUnion
import typings.atAwsDashSdkClientDashLambdaDashNode.typesInvokeExceptionsUnionMod.InvokeExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidRequestContentException
  extends ServiceException[_InvalidRequestContentExceptionDetails]
     with InvokeAsyncExceptionsUnion
     with InvokeExceptionsUnion {
  @JSName("name")
  var name_InvalidRequestContentException: typings.atAwsDashSdkClientDashLambdaDashNode.atAwsDashSdkClientDashLambdaDashNodeStrings.InvalidRequestContentException
}

object InvalidRequestContentException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: _InvalidRequestContentExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashLambdaDashNode.atAwsDashSdkClientDashLambdaDashNodeStrings.InvalidRequestContentException,
    stack: String = null
  ): InvalidRequestContentException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidRequestContentException]
  }
}

