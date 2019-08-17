package typings.atAwsDashSdkClientDashLambdaDashNode.typesUnsupportedMediaTypeExceptionMod

import typings.atAwsDashSdkClientDashLambdaDashNode.typesInvokeExceptionsUnionMod.InvokeExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnsupportedMediaTypeException
  extends ServiceException[_UnsupportedMediaTypeExceptionDetails]
     with InvokeExceptionsUnion {
  @JSName("name")
  var name_UnsupportedMediaTypeException: typings.atAwsDashSdkClientDashLambdaDashNode.atAwsDashSdkClientDashLambdaDashNodeStrings.UnsupportedMediaTypeException
}

object UnsupportedMediaTypeException {
  @scala.inline
  def apply(
    details: _UnsupportedMediaTypeExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashLambdaDashNode.atAwsDashSdkClientDashLambdaDashNodeStrings.UnsupportedMediaTypeException,
    stack: String = null
  ): UnsupportedMediaTypeException = {
    val __obj = js.Dynamic.literal(details = details, message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[UnsupportedMediaTypeException]
  }
}

