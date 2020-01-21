package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutBucketNotificationRequest extends js.Object {
  /**
    * The name of the bucket.
    */
  var Bucket: BucketName = js.native
  /**
    * The MD5 hash of the PutPublicAccessBlock request body.
    */
  var ContentMD5: js.UndefOr[typings.awsSdk.s3Mod.ContentMD5] = js.native
  /**
    * The container for the configuration.
    */
  var NotificationConfiguration: NotificationConfigurationDeprecated = js.native
}

object PutBucketNotificationRequest {
  @scala.inline
  def apply(
    Bucket: BucketName,
    NotificationConfiguration: NotificationConfigurationDeprecated,
    ContentMD5: ContentMD5 = null
  ): PutBucketNotificationRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], NotificationConfiguration = NotificationConfiguration.asInstanceOf[js.Any])
    if (ContentMD5 != null) __obj.updateDynamic("ContentMD5")(ContentMD5.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutBucketNotificationRequest]
  }
}

