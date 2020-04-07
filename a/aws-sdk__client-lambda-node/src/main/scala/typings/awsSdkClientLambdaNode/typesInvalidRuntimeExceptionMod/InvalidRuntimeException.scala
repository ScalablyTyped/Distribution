package typings.awsSdkClientLambdaNode.typesInvalidRuntimeExceptionMod

import typings.awsSdkClientLambdaNode.invokeAsyncExceptionsUnionMod.InvokeAsyncExceptionsUnion
import typings.awsSdkClientLambdaNode.invokeExceptionsUnionMod.InvokeExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidRuntimeException
  extends ServiceException[InvalidRuntimeExceptionDetails]
     with InvokeAsyncExceptionsUnion
     with InvokeExceptionsUnion {
  @JSName("name")
  var name_InvalidRuntimeException: typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.InvalidRuntimeException
}

object InvalidRuntimeException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: InvalidRuntimeExceptionDetails,
    message: String,
    name: typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.InvalidRuntimeException,
    stack: String = null
  ): InvalidRuntimeException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidRuntimeException]
  }
}

