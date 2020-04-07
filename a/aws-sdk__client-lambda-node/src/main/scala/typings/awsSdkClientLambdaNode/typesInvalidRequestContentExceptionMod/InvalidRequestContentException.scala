package typings.awsSdkClientLambdaNode.typesInvalidRequestContentExceptionMod

import typings.awsSdkClientLambdaNode.invokeAsyncExceptionsUnionMod.InvokeAsyncExceptionsUnion
import typings.awsSdkClientLambdaNode.invokeExceptionsUnionMod.InvokeExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidRequestContentException
  extends ServiceException[InvalidRequestContentExceptionDetails]
     with InvokeAsyncExceptionsUnion
     with InvokeExceptionsUnion {
  @JSName("name")
  var name_InvalidRequestContentException: typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.InvalidRequestContentException
}

object InvalidRequestContentException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: InvalidRequestContentExceptionDetails,
    message: String,
    name: typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.InvalidRequestContentException,
    stack: String = null
  ): InvalidRequestContentException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidRequestContentException]
  }
}

