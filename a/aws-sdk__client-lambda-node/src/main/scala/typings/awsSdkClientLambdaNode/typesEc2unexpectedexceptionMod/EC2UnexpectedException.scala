package typings.awsSdkClientLambdaNode.typesEc2unexpectedexceptionMod

import typings.awsSdkClientLambdaNode.invokeExceptionsUnionMod.InvokeExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EC2UnexpectedException
  extends ServiceException[EC2UnexpectedExceptionDetails]
     with InvokeExceptionsUnion {
  @JSName("name")
  var name_EC2UnexpectedException: typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.EC2UnexpectedException
}

object EC2UnexpectedException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: EC2UnexpectedExceptionDetails,
    message: String,
    name: typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.EC2UnexpectedException,
    stack: String = null
  ): EC2UnexpectedException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[EC2UnexpectedException]
  }
}

