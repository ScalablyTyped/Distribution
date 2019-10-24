package typings.cytoscape.cytoscapeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayoutEventObject extends AbstractEventObject {
  /**
    * layout : indicates the corresponding layout that triggered the event
    * (useful if running multiple layouts simultaneously)
    */
  var layout: js.Any
}

object LayoutEventObject {
  @scala.inline
  def apply(
    cy: Core,
    isDefaultPrevented: () => Boolean,
    isImmediatePropagationStopped: () => Boolean,
    isPropagationStopped: () => Boolean,
    layout: js.Any,
    namespace: String,
    preventDefault: () => Unit,
    stopImmediatePropagation: () => Unit,
    stopPropagation: () => Unit,
    target: js.Any,
    timeStamp: Double,
    `type`: UserInputDeviceEventName | UserInputDeviceEventNameExt
  ): LayoutEventObject = {
    val __obj = js.Dynamic.literal(cy = cy, isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), isImmediatePropagationStopped = js.Any.fromFunction0(isImmediatePropagationStopped), isPropagationStopped = js.Any.fromFunction0(isPropagationStopped), layout = layout, namespace = namespace, preventDefault = js.Any.fromFunction0(preventDefault), stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target, timeStamp = timeStamp)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutEventObject]
  }
}

