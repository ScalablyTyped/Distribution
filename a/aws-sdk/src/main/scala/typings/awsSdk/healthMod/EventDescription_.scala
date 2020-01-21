package typings.awsSdk.healthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventDescription_ extends js.Object {
  /**
    * The most recent description of the event.
    */
  var latestDescription: js.UndefOr[eventDescription] = js.native
}

object EventDescription_ {
  @scala.inline
  def apply(latestDescription: eventDescription = null): EventDescription_ = {
    val __obj = js.Dynamic.literal()
    if (latestDescription != null) __obj.updateDynamic("latestDescription")(latestDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventDescription_]
  }
}

