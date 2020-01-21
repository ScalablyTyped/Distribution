package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotificationConfigurationFilter extends js.Object {
  var Key: js.UndefOr[S3KeyFilter] = js.native
}

object NotificationConfigurationFilter {
  @scala.inline
  def apply(Key: S3KeyFilter = null): NotificationConfigurationFilter = {
    val __obj = js.Dynamic.literal()
    if (Key != null) __obj.updateDynamic("Key")(Key.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationConfigurationFilter]
  }
}

