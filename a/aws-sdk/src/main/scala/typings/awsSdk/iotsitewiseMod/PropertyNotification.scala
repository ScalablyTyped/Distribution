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
}

