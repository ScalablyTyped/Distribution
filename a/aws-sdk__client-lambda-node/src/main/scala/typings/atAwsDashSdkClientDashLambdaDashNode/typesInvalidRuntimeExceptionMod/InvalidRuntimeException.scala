package typings.atAwsDashSdkClientDashLambdaDashNode.typesInvalidRuntimeExceptionMod

import typings.atAwsDashSdkClientDashLambdaDashNode.typesInvokeAsyncExceptionsUnionMod.InvokeAsyncExceptionsUnion
import typings.atAwsDashSdkClientDashLambdaDashNode.typesInvokeExceptionsUnionMod.InvokeExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidRuntimeException
  extends ServiceException[_InvalidRuntimeExceptionDetails]
     with InvokeAsyncExceptionsUnion
     with InvokeExceptionsUnion {
  @JSName("name")
  var name_InvalidRuntimeException: typings.atAwsDashSdkClientDashLambdaDashNode.atAwsDashSdkClientDashLambdaDashNodeStrings.InvalidRuntimeException
}

object InvalidRuntimeException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: _InvalidRuntimeExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashLambdaDashNode.atAwsDashSdkClientDashLambdaDashNodeStrings.InvalidRuntimeException,
    stack: String = null
  ): InvalidRuntimeException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidRuntimeException]
  }
}

