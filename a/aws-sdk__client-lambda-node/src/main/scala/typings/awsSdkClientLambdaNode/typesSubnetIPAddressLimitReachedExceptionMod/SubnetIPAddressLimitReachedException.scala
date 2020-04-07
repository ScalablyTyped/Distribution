package typings.awsSdkClientLambdaNode.typesSubnetIPAddressLimitReachedExceptionMod

import typings.awsSdkClientLambdaNode.invokeExceptionsUnionMod.InvokeExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubnetIPAddressLimitReachedException
  extends ServiceException[SubnetIPAddressLimitReachedExceptionDetails]
     with InvokeExceptionsUnion {
  @JSName("name")
  var name_SubnetIPAddressLimitReachedException: typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.SubnetIPAddressLimitReachedException
}

object SubnetIPAddressLimitReachedException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: SubnetIPAddressLimitReachedExceptionDetails,
    message: String,
    name: typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.SubnetIPAddressLimitReachedException,
    stack: String = null
  ): SubnetIPAddressLimitReachedException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubnetIPAddressLimitReachedException]
  }
}

