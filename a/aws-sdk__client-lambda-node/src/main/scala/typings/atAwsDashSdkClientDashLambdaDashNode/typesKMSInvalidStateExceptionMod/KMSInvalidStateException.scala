package typings.atAwsDashSdkClientDashLambdaDashNode.typesKMSInvalidStateExceptionMod

import typings.atAwsDashSdkClientDashLambdaDashNode.typesInvokeExceptionsUnionMod.InvokeExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
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
    $metadata: ResponseMetadata,
    details: _KMSInvalidStateExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashLambdaDashNode.atAwsDashSdkClientDashLambdaDashNodeStrings.KMSInvalidStateException,
    stack: String = null
  ): KMSInvalidStateException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[KMSInvalidStateException]
  }
}

