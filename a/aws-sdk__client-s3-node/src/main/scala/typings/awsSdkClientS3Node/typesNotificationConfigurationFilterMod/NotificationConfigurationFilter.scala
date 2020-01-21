package typings.awsSdkClientS3Node.typesNotificationConfigurationFilterMod

import typings.awsSdkClientS3Node.typesS3KeyFilterMod.S3KeyFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationConfigurationFilter extends js.Object {
  /**
    * <p>Container for object key name prefix and suffix filtering rules.</p>
    */
  var Key: js.UndefOr[S3KeyFilter] = js.undefined
}

object NotificationConfigurationFilter {
  @scala.inline
  def apply(Key: S3KeyFilter = null): NotificationConfigurationFilter = {
    val __obj = js.Dynamic.literal()
    if (Key != null) __obj.updateDynamic("Key")(Key.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationConfigurationFilter]
  }
}

