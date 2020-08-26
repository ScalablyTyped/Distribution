package typings.awsSdkClientLambdaNode.typesEc2unexpectedexceptionMod

import typings.awsSdkClientLambdaNode.invokeExceptionsUnionMod.InvokeExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EC2UnexpectedException
  extends ServiceException[EC2UnexpectedExceptionDetails]
     with InvokeExceptionsUnion {
  @JSName("name")
  var name_EC2UnexpectedException: typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.EC2UnexpectedException = js.native
}

object EC2UnexpectedException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: EC2UnexpectedExceptionDetails,
    message: String,
    name: typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.EC2UnexpectedException
  ): EC2UnexpectedException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[EC2UnexpectedException]
  }
  @scala.inline
  implicit class EC2UnexpectedExceptionOps[Self <: EC2UnexpectedException] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setName(value: typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.EC2UnexpectedException): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

