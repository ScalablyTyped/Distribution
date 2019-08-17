package typings.atAwsDashSdkClientDashLambdaDashNode.typesPolicyLengthExceededExceptionMod

import typings.atAwsDashSdkClientDashLambdaDashNode.typesAddPermissionExceptionsUnionMod.AddPermissionExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolicyLengthExceededException
  extends ServiceException[_PolicyLengthExceededExceptionDetails]
     with AddPermissionExceptionsUnion {
  @JSName("name")
  var name_PolicyLengthExceededException: typings.atAwsDashSdkClientDashLambdaDashNode.atAwsDashSdkClientDashLambdaDashNodeStrings.PolicyLengthExceededException
}

object PolicyLengthExceededException {
  @scala.inline
  def apply(
    details: _PolicyLengthExceededExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashLambdaDashNode.atAwsDashSdkClientDashLambdaDashNodeStrings.PolicyLengthExceededException,
    stack: String = null
  ): PolicyLengthExceededException = {
    val __obj = js.Dynamic.literal(details = details, message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[PolicyLengthExceededException]
  }
}

