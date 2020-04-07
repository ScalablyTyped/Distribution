package typings.awsSdkClientLambdaNode.typesInvalidSubnetIDExceptionMod

import typings.awsSdkClientLambdaNode.invokeExceptionsUnionMod.InvokeExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidSubnetIDException
  extends ServiceException[InvalidSubnetIDExceptionDetails]
     with InvokeExceptionsUnion {
  @JSName("name")
  var name_InvalidSubnetIDException: typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.InvalidSubnetIDException
}

object InvalidSubnetIDException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: InvalidSubnetIDExceptionDetails,
    message: String,
    name: typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.InvalidSubnetIDException,
    stack: String = null
  ): InvalidSubnetIDException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidSubnetIDException]
  }
}

