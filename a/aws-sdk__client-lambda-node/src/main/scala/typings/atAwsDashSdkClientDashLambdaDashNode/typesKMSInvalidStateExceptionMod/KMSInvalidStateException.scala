package typings.atAwsDashSdkClientDashLambdaDashNode.typesKMSInvalidStateExceptionMod

import typings.atAwsDashSdkClientDashLambdaDashNode.typesInvokeExceptionsUnionMod.InvokeExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KMSInvalidStateException
  extends ServiceException[_KMSInvalidStateExceptionDetails]
     with InvokeExceptionsUnion {
  @JSName("name")
  var name_KMSInvalidStateException: typings.atAwsDashSdkClientDashLambdaDashNode.atAwsDashSdkClientDashLambdaDashNodeStrings.KMSInvalidStateException
}

object KMSInvalidStateException {
  @scala.inline
  def apply(
    details: _KMSInvalidStateExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashLambdaDashNode.atAwsDashSdkClientDashLambdaDashNodeStrings.KMSInvalidStateException,
    stack: String = null
  ): KMSInvalidStateException = {
    val __obj = js.Dynamic.literal(details = details, message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[KMSInvalidStateException]
  }
}

