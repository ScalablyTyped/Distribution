package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PropertyNotification extends js.Object {
  /**
    * The current notification state.
    */
  var state: PropertyNotificationState = js.native
  /**
    * The MQTT topic to which AWS IoT SiteWise publishes property value update notifications.
    */
  var topic: PropertyNotificationTopic = js.native
}

object PropertyNotification {
  @scala.inline
  def apply(state: PropertyNotificationState, topic: PropertyNotificationTopic): PropertyNotification = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyNotification]
  }
  @scala.inline
  implicit class PropertyNotificationOps[Self <: PropertyNotification] (val x: Self) extends AnyVal {
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
    def setState(value: PropertyNotificationState): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def setTopic(value: PropertyNotificationTopic): Self = this.set("topic", value.asInstanceOf[js.Any])
  }
  
}

