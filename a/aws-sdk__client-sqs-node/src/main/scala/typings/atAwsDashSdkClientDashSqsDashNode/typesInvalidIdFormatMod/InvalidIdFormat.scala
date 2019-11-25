package typings.atAwsDashSdkClientDashSqsDashNode.typesInvalidIdFormatMod

import typings.atAwsDashSdkClientDashSqsDashNode.typesDeleteMessageExceptionsUnionMod.DeleteMessageExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidIdFormat
  extends ServiceException[_InvalidIdFormatDetails]
     with DeleteMessageExceptionsUnion {
  @JSName("name")
  var name_InvalidIdFormat: typings.atAwsDashSdkClientDashSqsDashNode.atAwsDashSdkClientDashSqsDashNodeStrings.InvalidIdFormat
}

object InvalidIdFormat {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: _InvalidIdFormatDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashSqsDashNode.atAwsDashSdkClientDashSqsDashNodeStrings.InvalidIdFormat,
    stack: String = null
  ): InvalidIdFormat = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidIdFormat]
  }
}

