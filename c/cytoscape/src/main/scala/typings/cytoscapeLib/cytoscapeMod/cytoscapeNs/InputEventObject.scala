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
    val __obj = js.Dynamic.literal(cy = cy, namespace = namespace, originalEvent = originalEvent, position = position, renderedPosition = renderedPosition, timeStamp = timeStamp)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[InputEventObject]
  }
}

