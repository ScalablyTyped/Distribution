package typings.atAwsDashSdkClientDashSqsDashNode.typesInvalidAttributeNameMod

import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidAttributeName extends ServiceException[_InvalidAttributeNameDetails] {
  @JSName("name")
  var name_InvalidAttributeName: typings.atAwsDashSdkClientDashSqsDashNode.atAwsDashSdkClientDashSqsDashNodeStrings.InvalidAttributeName
}

object InvalidAttributeName {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: _InvalidAttributeNameDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashSqsDashNode.atAwsDashSdkClientDashSqsDashNodeStrings.InvalidAttributeName,
    stack: String = null
  ): InvalidAttributeName = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidAttributeName]
  }
}

