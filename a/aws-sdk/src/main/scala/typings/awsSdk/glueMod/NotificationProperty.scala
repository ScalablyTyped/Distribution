package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotificationProperty extends js.Object {
  /**
    * After a job run starts, the number of minutes to wait before sending a job run delay notification.
    */
  var NotifyDelayAfter: js.UndefOr[typings.awsSdk.glueMod.NotifyDelayAfter] = js.native
}

object NotificationProperty {
  @scala.inline
  def apply(): NotificationProperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotificationProperty]
  }
  @scala.inline
  implicit class NotificationPropertyOps[Self <: NotificationProperty] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setNotifyDelayAfter(value: NotifyDelayAfter): Self = this.set("NotifyDelayAfter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotifyDelayAfter: Self = this.set("NotifyDelayAfter", js.undefined)
  }
  
}

