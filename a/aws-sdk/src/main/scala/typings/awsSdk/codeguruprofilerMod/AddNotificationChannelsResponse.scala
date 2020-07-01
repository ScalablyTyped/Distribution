package typings.awsSdk.codeguruprofilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddNotificationChannelsResponse extends js.Object {
  /**
    * The new notification configuration for this profiling group.
    */
  var notificationConfiguration: js.UndefOr[NotificationConfiguration] = js.native
}

object AddNotificationChannelsResponse {
  @scala.inline
  def apply(notificationConfiguration: NotificationConfiguration = null): AddNotificationChannelsResponse = {
    val __obj = js.Dynamic.literal()
    if (notificationConfiguration != null) __obj.updateDynamic("notificationConfiguration")(notificationConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddNotificationChannelsResponse]
  }
}

