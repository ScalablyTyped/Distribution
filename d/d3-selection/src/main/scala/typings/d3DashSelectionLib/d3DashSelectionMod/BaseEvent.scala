package typings
package d3DashSelectionLib.d3DashSelectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseEvent extends js.Object {
  /**
    * The prior value of d3.event, allowing custom events to retain a reference to the originating native event.
    */
  var sourceEvent: js.UndefOr[js.Any] = js.undefined
  /**
    * Event type
    */
  var `type`: java.lang.String
}

object BaseEvent {
  @scala.inline
  def apply(`type`: java.lang.String, sourceEvent: js.Any = null): BaseEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (sourceEvent != null) __obj.updateDynamic("sourceEvent")(sourceEvent)
    __obj.asInstanceOf[BaseEvent]
  }
}

