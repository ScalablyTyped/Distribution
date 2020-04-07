package typings.awsSdkClientLambdaNode.typesEc2throttledexceptionMod

import typings.awsSdkClientLambdaNode.invokeExceptionsUnionMod.InvokeExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EC2ThrottledException
  extends ServiceException[EC2ThrottledExceptionDetails]
     with InvokeExceptionsUnion {
  @JSName("name")
  var name_EC2ThrottledException: typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.EC2ThrottledException
}

object EC2ThrottledException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: EC2ThrottledExceptionDetails,
    message: String,
    name: typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.EC2ThrottledException,
    stack: String = null
  ): EC2ThrottledException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[EC2ThrottledException]
  }
}

