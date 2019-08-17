package typings.atAwsDashSdkClientDashLambdaDashNode.typesSubnetIPAddressLimitReachedExceptionMod

import typings.atAwsDashSdkClientDashLambdaDashNode.typesInvokeExceptionsUnionMod.InvokeExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
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
    details: _SubnetIPAddressLimitReachedExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashLambdaDashNode.atAwsDashSdkClientDashLambdaDashNodeStrings.SubnetIPAddressLimitReachedException,
    stack: String = null
  ): SubnetIPAddressLimitReachedException = {
    val __obj = js.Dynamic.literal(details = details, message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[SubnetIPAddressLimitReachedException]
  }
}

