package typings.atAwsDashSdkClientDashS3DashNode.typesNoSuchKeyMod

import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NoSuchKey extends ServiceException[_NoSuchKeyDetails] {
  @JSName("name")
  var name_NoSuchKey: typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.NoSuchKey
}

object NoSuchKey {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: _NoSuchKeyDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.NoSuchKey,
    stack: String = null
  ): NoSuchKey = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[NoSuchKey]
  }
}

