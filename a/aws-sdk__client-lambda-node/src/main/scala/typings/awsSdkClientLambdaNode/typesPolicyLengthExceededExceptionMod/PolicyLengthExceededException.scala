package typings.awsSdkClientLambdaNode.typesPolicyLengthExceededExceptionMod

import typings.awsSdkClientLambdaNode.addPermissionExceptionsUnionMod.AddPermissionExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolicyLengthExceededException
  extends ServiceException[PolicyLengthExceededExceptionDetails]
     with AddPermissionExceptionsUnion {
  @JSName("name")
  var name_PolicyLengthExceededException: typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.PolicyLengthExceededException
}

object PolicyLengthExceededException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: PolicyLengthExceededExceptionDetails,
    message: String,
    name: typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.PolicyLengthExceededException,
    stack: String = null
  ): PolicyLengthExceededException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyLengthExceededException]
  }
}

