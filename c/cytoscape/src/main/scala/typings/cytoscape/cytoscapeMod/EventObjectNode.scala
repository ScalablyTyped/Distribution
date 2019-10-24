package typings.cytoscape.cytoscapeMod

import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.cytoscape.cytoscapeMod.AbstractEventObject because Already inherited
- typings.cytoscape.cytoscapeMod.LayoutEventObject because var conflicts: cy, namespace, target, timeStamp, `type`. Inlined layout */ trait EventObjectNode extends InputEventObject {
  /**
    * layout : indicates the corresponding layout that triggered the event
    * (useful if running multiple layouts simultaneously)
    */
  var layout: js.Any
  @JSName("target")
  var target_EventObjectNode: NodeSingular
}

object EventObjectNode {
  @scala.inline
  def apply(
    cy: Core,
    isDefaultPrevented: () => Boolean,
    isImmediatePropagationStopped: () => Boolean,
    isPropagationStopped: () => Boolean,
    layout: js.Any,
    namespace: String,
    originalEvent: MouseEvent,
    position: Position,
    preventDefault: () => Unit,
    renderedPosition: Position,
    stopImmediatePropagation: () => Unit,
    stopPropagation: () => Unit,
    target: NodeSingular,
    timeStamp: Double,
    `type`: UserInputDeviceEventName | UserInputDeviceEventNameExt
  ): EventObjectNode = {
    val __obj = js.Dynamic.literal(cy = cy, isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), isImmediatePropagationStopped = js.Any.fromFunction0(isImmediatePropagationStopped), isPropagationStopped = js.Any.fromFunction0(isPropagationStopped), layout = layout, namespace = namespace, originalEvent = originalEvent, position = position, preventDefault = js.Any.fromFunction0(preventDefault), renderedPosition = renderedPosition, stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target, timeStamp = timeStamp)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventObjectNode]
  }
}

