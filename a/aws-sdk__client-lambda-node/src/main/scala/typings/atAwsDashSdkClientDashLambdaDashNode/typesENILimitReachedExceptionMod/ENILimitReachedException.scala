package typings.atAwsDashSdkClientDashLambdaDashNode.typesENILimitReachedExceptionMod

import typings.atAwsDashSdkClientDashLambdaDashNode.typesInvokeExceptionsUnionMod.InvokeExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ENILimitReachedException
  extends ServiceException[_ENILimitReachedExceptionDetails]
     with InvokeExceptionsUnion {
  @JSName("name")
  var name_ENILimitReachedException: typings.atAwsDashSdkClientDashLambdaDashNode.atAwsDashSdkClientDashLambdaDashNodeStrings.ENILimitReachedException
}

object ENILimitReachedException {
  @scala.inline
  def apply(
    details: _ENILimitReachedExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashLambdaDashNode.atAwsDashSdkClientDashLambdaDashNodeStrings.ENILimitReachedException,
    stack: String = null
  ): ENILimitReachedException = {
    val __obj = js.Dynamic.literal(details = details, message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[ENILimitReachedException]
  }
}

