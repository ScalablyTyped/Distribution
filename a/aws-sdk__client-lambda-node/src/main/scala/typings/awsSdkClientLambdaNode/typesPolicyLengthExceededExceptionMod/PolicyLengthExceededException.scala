package typings.awsSdkClientLambdaNode.typesPolicyLengthExceededExceptionMod

import typings.awsSdkClientLambdaNode.addPermissionExceptionsUnionMod.AddPermissionExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolicyLengthExceededException
  extends ServiceException[PolicyLengthExceededExceptionDetails]
     with AddPermissionExceptionsUnion {
  @JSName("name")
  var name_PolicyLengthExceededException: typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.PolicyLengthExceededException = js.native
}

object PolicyLengthExceededException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: PolicyLengthExceededExceptionDetails,
    message: String,
    name: typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.PolicyLengthExceededException
  ): PolicyLengthExceededException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyLengthExceededException]
  }
  @scala.inline
  implicit class PolicyLengthExceededExceptionOps[Self <: PolicyLengthExceededException] (val x: Self) extends AnyVal {
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
    def setName(value: typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.PolicyLengthExceededException): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

