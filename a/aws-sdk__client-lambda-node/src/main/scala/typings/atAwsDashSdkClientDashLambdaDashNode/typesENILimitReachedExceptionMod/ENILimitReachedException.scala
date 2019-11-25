package typings.atAwsDashSdkClientDashLambdaDashNode.typesENILimitReachedExceptionMod

import typings.atAwsDashSdkClientDashLambdaDashNode.typesInvokeExceptionsUnionMod.InvokeExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
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
    $metadata: ResponseMetadata,
    details: _ENILimitReachedExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashLambdaDashNode.atAwsDashSdkClientDashLambdaDashNodeStrings.ENILimitReachedException,
    stack: String = null
  ): ENILimitReachedException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[ENILimitReachedException]
  }
}

