package typings.awsSdk.codeguruprofilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotificationConfiguration extends js.Object {
  /**
    * List of up to two channels to be used for sending notifications for events detected from the application profile.
    */
  var channels: js.UndefOr[Channels] = js.native
}

object NotificationConfiguration {
  @scala.inline
  def apply(channels: Channels = null): NotificationConfiguration = {
    val __obj = js.Dynamic.literal()
    if (channels != null) __obj.updateDynamic("channels")(channels.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationConfiguration]
  }
}

