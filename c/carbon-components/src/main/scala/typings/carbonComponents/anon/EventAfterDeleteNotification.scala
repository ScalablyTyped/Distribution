package typings.carbonComponents.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventAfterDeleteNotification extends js.Object {
  var eventAfterDeleteNotification: String = js.native
  var eventBeforeDeleteNotification: String = js.native
  var selectorButton: String = js.native
  var selectorInit: String = js.native
}

object EventAfterDeleteNotification {
  @scala.inline
  def apply(
    eventAfterDeleteNotification: String,
    eventBeforeDeleteNotification: String,
    selectorButton: String,
    selectorInit: String
  ): EventAfterDeleteNotification = {
    val __obj = js.Dynamic.literal(eventAfterDeleteNotification = eventAfterDeleteNotification.asInstanceOf[js.Any], eventBeforeDeleteNotification = eventBeforeDeleteNotification.asInstanceOf[js.Any], selectorButton = selectorButton.asInstanceOf[js.Any], selectorInit = selectorInit.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventAfterDeleteNotification]
  }
  @scala.inline
  implicit class EventAfterDeleteNotificationOps[Self <: EventAfterDeleteNotification] (val x: Self) extends AnyVal {
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
    def setEventAfterDeleteNotification(value: String): Self = this.set("eventAfterDeleteNotification", value.asInstanceOf[js.Any])
    @scala.inline
    def setEventBeforeDeleteNotification(value: String): Self = this.set("eventBeforeDeleteNotification", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectorButton(value: String): Self = this.set("selectorButton", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectorInit(value: String): Self = this.set("selectorInit", value.asInstanceOf[js.Any])
  }
  
}

