package typings.awsSdkClientLambdaNode.typesInvalidSecurityGroupIDExceptionMod

import typings.awsSdkClientLambdaNode.invokeExceptionsUnionMod.InvokeExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidSecurityGroupIDException
  extends ServiceException[InvalidSecurityGroupIDExceptionDetails]
     with InvokeExceptionsUnion {
  @JSName("name")
  var name_InvalidSecurityGroupIDException: typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.InvalidSecurityGroupIDException
}

object InvalidSecurityGroupIDException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: InvalidSecurityGroupIDExceptionDetails,
    message: String,
    name: typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.InvalidSecurityGroupIDException,
    stack: String = null
  ): InvalidSecurityGroupIDException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidSecurityGroupIDException]
  }
}

