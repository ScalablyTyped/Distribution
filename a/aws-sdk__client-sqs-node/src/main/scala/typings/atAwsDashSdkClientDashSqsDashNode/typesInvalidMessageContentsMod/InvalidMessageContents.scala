package typings.atAwsDashSdkClientDashSqsDashNode.typesInvalidMessageContentsMod

import typings.atAwsDashSdkClientDashSqsDashNode.typesSendMessageExceptionsUnionMod.SendMessageExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidMessageContents
  extends ServiceException[_InvalidMessageContentsDetails]
     with SendMessageExceptionsUnion {
  @JSName("name")
  var name_InvalidMessageContents: typings.atAwsDashSdkClientDashSqsDashNode.atAwsDashSdkClientDashSqsDashNodeStrings.InvalidMessageContents
}

object InvalidMessageContents {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: _InvalidMessageContentsDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashSqsDashNode.atAwsDashSdkClientDashSqsDashNodeStrings.InvalidMessageContents,
    stack: String = null
  ): InvalidMessageContents = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidMessageContents]
  }
}

