package typings.cytoscape.cytoscapeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#events/event-object
  */
trait AbstractEventObject extends js.Object {
  /** a reference to the corresponding core Core */
  var cy: Core
  /** the event namespace string (e.g. "foo" for "foo.tap") */
  var namespace: String
  /** indicates the element or core that first caused the event */
  var target: js.UndefOr[js.Any] = js.undefined
  /** Unix epoch time of event in milliseconds */
  var timeStamp: Double
  /** the event type string (e.g. "tap") */
  var `type`: UserInputDeviceEventName | UserInputDeviceEventNameExt
}

object AbstractEventObject {
  @scala.inline
  def apply(
    cy: Core,
    namespace: String,
    timeStamp: Double,
    `type`: UserInputDeviceEventName | UserInputDeviceEventNameExt,
    target: js.Any = null
  ): AbstractEventObject = {
    val __obj = js.Dynamic.literal(cy = cy, namespace = namespace, timeStamp = timeStamp)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[AbstractEventObject]
  }
}

