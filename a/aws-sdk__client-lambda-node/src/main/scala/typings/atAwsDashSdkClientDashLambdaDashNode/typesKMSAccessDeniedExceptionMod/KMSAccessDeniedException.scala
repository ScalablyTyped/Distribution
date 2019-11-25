package typings.atAwsDashSdkClientDashLambdaDashNode.typesKMSAccessDeniedExceptionMod

import typings.atAwsDashSdkClientDashLambdaDashNode.typesInvokeExceptionsUnionMod.InvokeExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KMSAccessDeniedException
  extends ServiceException[_KMSAccessDeniedExceptionDetails]
     with InvokeExceptionsUnion {
  @JSName("name")
  var name_KMSAccessDeniedException: typings.atAwsDashSdkClientDashLambdaDashNode.atAwsDashSdkClientDashLambdaDashNodeStrings.KMSAccessDeniedException
}

object KMSAccessDeniedException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: _KMSAccessDeniedExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashLambdaDashNode.atAwsDashSdkClientDashLambdaDashNodeStrings.KMSAccessDeniedException,
    stack: String = null
  ): KMSAccessDeniedException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[KMSAccessDeniedException]
  }
}

