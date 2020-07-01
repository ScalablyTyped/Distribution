package typings.awsSdk.codeguruprofilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetNotificationConfigurationResponse extends js.Object {
  /**
    * The current notification configuration for this profiling group.
    */
  var notificationConfiguration: NotificationConfiguration = js.native
}

object GetNotificationConfigurationResponse {
  @scala.inline
  def apply(notificationConfiguration: NotificationConfiguration): GetNotificationConfigurationResponse = {
    val __obj = js.Dynamic.literal(notificationConfiguration = notificationConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetNotificationConfigurationResponse]
  }
}

