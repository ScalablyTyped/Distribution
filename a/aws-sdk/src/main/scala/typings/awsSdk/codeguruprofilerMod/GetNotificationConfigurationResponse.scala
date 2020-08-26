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
  @scala.inline
  implicit class GetNotificationConfigurationResponseOps[Self <: GetNotificationConfigurationResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setNotificationConfiguration(value: NotificationConfiguration): Self = this.set("notificationConfiguration", value.asInstanceOf[js.Any])
  }
  
}

