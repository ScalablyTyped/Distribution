package typings.awsSdk.codeguruprofilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoveNotificationChannelResponse extends js.Object {
  /**
    * The new notification configuration for this profiling group.
    */
  var notificationConfiguration: js.UndefOr[NotificationConfiguration] = js.native
}

object RemoveNotificationChannelResponse {
  @scala.inline
  def apply(): RemoveNotificationChannelResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoveNotificationChannelResponse]
  }
  @scala.inline
  implicit class RemoveNotificationChannelResponseOps[Self <: RemoveNotificationChannelResponse] (val x: Self) extends AnyVal {
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
    @scala.inline
    def deleteNotificationConfiguration: Self = this.set("notificationConfiguration", js.undefined)
  }
  
}

