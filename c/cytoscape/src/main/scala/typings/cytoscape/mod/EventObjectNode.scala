package typings.cytoscape.mod

import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.cytoscape.mod.AbstractEventObject because Already inherited
- typings.cytoscape.mod.LayoutEventObject because var conflicts: cy, namespace, target, timeStamp, `type`. Inlined layout */ @js.native
trait EventObjectNode extends InputEventObject {
  /**
    * layout : indicates the corresponding layout that triggered the event
    * (useful if running multiple layouts simultaneously)
    */
  var layout: js.Any = js.native
  @JSName("target")
  var target_EventObjectNode: NodeSingular = js.native
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
    val __obj = js.Dynamic.literal(cy = cy.asInstanceOf[js.Any], isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), isImmediatePropagationStopped = js.Any.fromFunction0(isImmediatePropagationStopped), isPropagationStopped = js.Any.fromFunction0(isPropagationStopped), layout = layout.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), renderedPosition = renderedPosition.asInstanceOf[js.Any], stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventObjectNode]
  }
  @scala.inline
  implicit class EventObjectNodeOps[Self <: EventObjectNode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLayout(value: js.Any): Self = this.set("layout", value.asInstanceOf[js.Any])
    @scala.inline
    def setTarget(value: NodeSingular): Self = this.set("target", value.asInstanceOf[js.Any])
  }
  
}

