package typings.atAwsDashSdkClientDashLambdaDashNode.typesUnsupportedMediaTypeExceptionMod

import typings.atAwsDashSdkClientDashLambdaDashNode.typesInvokeExceptionsUnionMod.InvokeExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
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
    $metadata: ResponseMetadata,
    details: _UnsupportedMediaTypeExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashLambdaDashNode.atAwsDashSdkClientDashLambdaDashNodeStrings.UnsupportedMediaTypeException,
    stack: String = null
  ): UnsupportedMediaTypeException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnsupportedMediaTypeException]
  }
}

