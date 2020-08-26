package typings.awsSdkClientLambdaNode.typesInvalidSubnetIDExceptionMod

import typings.awsSdkClientLambdaNode.invokeExceptionsUnionMod.InvokeExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvalidSubnetIDException
  extends ServiceException[InvalidSubnetIDExceptionDetails]
     with InvokeExceptionsUnion {
  @JSName("name")
  var name_InvalidSubnetIDException: typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.InvalidSubnetIDException = js.native
}

object InvalidSubnetIDException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: InvalidSubnetIDExceptionDetails,
    message: String,
    name: typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.InvalidSubnetIDException
  ): InvalidSubnetIDException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidSubnetIDException]
  }
  @scala.inline
  implicit class InvalidSubnetIDExceptionOps[Self <: InvalidSubnetIDException] (val x: Self) extends AnyVal {
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
    def setName(value: typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.InvalidSubnetIDException): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

