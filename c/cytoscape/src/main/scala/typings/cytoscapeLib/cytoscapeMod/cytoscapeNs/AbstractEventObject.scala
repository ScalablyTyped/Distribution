package typings
package cytoscapeLib.cytoscapeMod.cytoscapeNs

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
  var namespace: java.lang.String
  /** indicates the element or core that first caused the event */
  var target: js.UndefOr[js.Any] = js.undefined
  /** Unix epoch time of event in milliseconds */
  var timeStamp: scala.Double
  /** the event type string (e.g. "tap") */
  var `type`: UserInputDeviceEventName | UserInputDeviceEventNameExt
}

object AbstractEventObject {
  @scala.inline
  def apply(
    cy: Core,
    namespace: java.lang.String,
    timeStamp: scala.Double,
    `type`: UserInputDeviceEventName | UserInputDeviceEventNameExt,
    target: js.Any = null
  ): AbstractEventObject = {
    val __obj = js.Dynamic.literal(`type` = `type`.asInstanceOf[js.Any])
    __obj.updateDynamic("cy")(cy)
    __obj.updateDynamic("namespace")(namespace)
    __obj.updateDynamic("timeStamp")(timeStamp)
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[AbstractEventObject]
  }
}

