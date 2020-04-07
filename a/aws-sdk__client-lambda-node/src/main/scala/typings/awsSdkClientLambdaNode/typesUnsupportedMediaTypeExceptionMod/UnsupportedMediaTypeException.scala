package typings.awsSdkClientLambdaNode.typesUnsupportedMediaTypeExceptionMod

import typings.awsSdkClientLambdaNode.invokeExceptionsUnionMod.InvokeExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnsupportedMediaTypeException
  extends ServiceException[UnsupportedMediaTypeExceptionDetails]
     with InvokeExceptionsUnion {
  @JSName("name")
  var name_UnsupportedMediaTypeException: typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.UnsupportedMediaTypeException
}

object UnsupportedMediaTypeException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: UnsupportedMediaTypeExceptionDetails,
    message: String,
    name: typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.UnsupportedMediaTypeException,
    stack: String = null
  ): UnsupportedMediaTypeException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnsupportedMediaTypeException]
  }
}

