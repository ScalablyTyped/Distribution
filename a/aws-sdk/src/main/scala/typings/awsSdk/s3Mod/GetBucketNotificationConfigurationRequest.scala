package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBucketNotificationConfigurationRequest extends js.Object {
  /**
    * Name of the bucket for which to get the notification configuration.
    */
  var Bucket: BucketName = js.native
}

object GetBucketNotificationConfigurationRequest {
  @scala.inline
  def apply(Bucket: BucketName): GetBucketNotificationConfigurationRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBucketNotificationConfigurationRequest]
  }
}

