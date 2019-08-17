package typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreNotificationConfigurationFilterMod

import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreS3KeyFilterMod._S3KeyFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _NotificationConfigurationFilter extends js.Object {
  /**
    * <p>Container for object key name prefix and suffix filtering rules.</p>
    */
  var Key: js.UndefOr[_S3KeyFilter] = js.undefined
}

object _NotificationConfigurationFilter {
  @scala.inline
  def apply(Key: _S3KeyFilter = null): _NotificationConfigurationFilter = {
    val __obj = js.Dynamic.literal()
    if (Key != null) __obj.updateDynamic("Key")(Key)
    __obj.asInstanceOf[_NotificationConfigurationFilter]
  }
}

