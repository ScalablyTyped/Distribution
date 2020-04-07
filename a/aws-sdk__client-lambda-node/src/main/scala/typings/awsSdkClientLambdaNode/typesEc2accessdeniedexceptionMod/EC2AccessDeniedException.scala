package typings.awsSdkClientLambdaNode.typesEc2accessdeniedexceptionMod

import typings.awsSdkClientLambdaNode.invokeExceptionsUnionMod.InvokeExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EC2AccessDeniedException
  extends ServiceException[EC2AccessDeniedExceptionDetails]
     with InvokeExceptionsUnion {
  @JSName("name")
  var name_EC2AccessDeniedException: typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.EC2AccessDeniedException
}

object EC2AccessDeniedException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: EC2AccessDeniedExceptionDetails,
    message: String,
    name: typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.EC2AccessDeniedException,
    stack: String = null
  ): EC2AccessDeniedException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[EC2AccessDeniedException]
  }
}

