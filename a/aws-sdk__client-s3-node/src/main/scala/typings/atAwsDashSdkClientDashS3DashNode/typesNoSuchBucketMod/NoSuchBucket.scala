package typings.atAwsDashSdkClientDashS3DashNode.typesNoSuchBucketMod

import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NoSuchBucket extends ServiceException[_NoSuchBucketDetails] {
  @JSName("name")
  var name_NoSuchBucket: typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.NoSuchBucket
}

object NoSuchBucket {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: _NoSuchBucketDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.NoSuchBucket,
    stack: String = null
  ): NoSuchBucket = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[NoSuchBucket]
  }
}

