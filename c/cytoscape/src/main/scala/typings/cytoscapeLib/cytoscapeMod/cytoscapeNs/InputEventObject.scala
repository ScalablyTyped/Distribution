package typings
package cytoscapeLib.cytoscapeMod.cytoscapeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputEventObject extends AbstractEventObject {
  /** originalEvent : the original user input device event object */
  var originalEvent: EventObject
  /** position : indicates the model position of the event */
  var position: Position
  /** renderedPosition : indicates the rendered position of the event */
  var renderedPosition: Position
}

object InputEventObject {
  @scala.inline
  def apply(
    cy: Core,
    namespace: java.lang.String,
    originalEvent: EventObject,
    position: Position,
    renderedPosition: Position,
    timeStamp: scala.Double,
    `type`: UserInputDeviceEventName | UserInputDeviceEventNameExt,
    target: js.Any = null
  ): InputEventObject = {
    val __obj = js.Dynamic.literal(`type` = `type`.asInstanceOf[js.Any])
    __obj.updateDynamic("cy")(cy)
    __obj.updateDynamic("namespace")(namespace)
    __obj.updateDynamic("originalEvent")(originalEvent)
    __obj.updateDynamic("position")(position)
    __obj.updateDynamic("renderedPosition")(renderedPosition)
    __obj.updateDynamic("timeStamp")(timeStamp)
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[InputEventObject]
  }
}

