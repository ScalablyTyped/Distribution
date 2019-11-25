package typings.atAwsDashSdkClientDashSqsDashNode.typesOverLimitMod

import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OverLimit extends ServiceException[_OverLimitDetails] {
  @JSName("name")
  var name_OverLimit: typings.atAwsDashSdkClientDashSqsDashNode.atAwsDashSdkClientDashSqsDashNodeStrings.OverLimit
}

object OverLimit {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: _OverLimitDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashSqsDashNode.atAwsDashSdkClientDashSqsDashNodeStrings.OverLimit,
    stack: String = null
  ): OverLimit = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverLimit]
  }
}

