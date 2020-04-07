package typings.awsSdkClientLambdaNode.typesRequestTooLargeExceptionMod

import typings.awsSdkClientLambdaNode.invokeExceptionsUnionMod.InvokeExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestTooLargeException
  extends ServiceException[RequestTooLargeExceptionDetails]
     with InvokeExceptionsUnion {
  @JSName("name")
  var name_RequestTooLargeException: typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.RequestTooLargeException
}

object RequestTooLargeException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: RequestTooLargeExceptionDetails,
    message: String,
    name: typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.RequestTooLargeException,
    stack: String = null
  ): RequestTooLargeException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestTooLargeException]
  }
}

