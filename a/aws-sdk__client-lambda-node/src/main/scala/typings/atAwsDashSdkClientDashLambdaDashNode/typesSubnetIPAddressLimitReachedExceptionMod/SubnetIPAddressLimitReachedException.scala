package typings.atAwsDashSdkClientDashLambdaDashNode.typesSubnetIPAddressLimitReachedExceptionMod

import typings.atAwsDashSdkClientDashLambdaDashNode.typesInvokeExceptionsUnionMod.InvokeExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubnetIPAddressLimitReachedException
  extends ServiceException[_SubnetIPAddressLimitReachedExceptionDetails]
     with InvokeExceptionsUnion {
  @JSName("name")
  var name_SubnetIPAddressLimitReachedException: typings.atAwsDashSdkClientDashLambdaDashNode.atAwsDashSdkClientDashLambdaDashNodeStrings.SubnetIPAddressLimitReachedException
}

object SubnetIPAddressLimitReachedException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: _SubnetIPAddressLimitReachedExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashLambdaDashNode.atAwsDashSdkClientDashLambdaDashNodeStrings.SubnetIPAddressLimitReachedException,
    stack: String = null
  ): SubnetIPAddressLimitReachedException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubnetIPAddressLimitReachedException]
  }
}

