package typings.awsSdkClientLambdaNode.typesEc2throttledexceptionMod

import typings.awsSdkClientLambdaNode.invokeExceptionsUnionMod.InvokeExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EC2ThrottledException
  extends ServiceException[EC2ThrottledExceptionDetails]
     with InvokeExceptionsUnion {
  @JSName("name")
  var name_EC2ThrottledException: typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.EC2ThrottledException = js.native
}

object EC2ThrottledException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: EC2ThrottledExceptionDetails,
    message: String,
    name: typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.EC2ThrottledException
  ): EC2ThrottledException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[EC2ThrottledException]
  }
  @scala.inline
  implicit class EC2ThrottledExceptionOps[Self <: EC2ThrottledException] (val x: Self) extends AnyVal {
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
    def setName(value: typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.EC2ThrottledException): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

