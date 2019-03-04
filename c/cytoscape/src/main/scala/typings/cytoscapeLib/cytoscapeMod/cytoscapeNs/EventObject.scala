package typings
package cytoscapeLib.cytoscapeMod.cytoscapeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Events passed to handler callbacks are similar to
  * jQuery event objects in that they wrap native event objects,
  * mimicking their API.
  *
  * http://js.cytoscape.org/#events
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- cytoscapeLib.cytoscapeMod.cytoscapeNs.LayoutEventObject because var conflicts: cy, namespace, target, timeStamp, `type`. Inlined layout */ trait EventObject extends InputEventObject {
  /**
    * layout : indicates the corresponding layout that triggered the event
    * (useful if running multiple layouts simultaneously)
    */
  var layout: js.Any
}

object EventObject {
  @scala.inline
  def apply(
    cy: Core,
    layout: js.Any,
    namespace: java.lang.String,
    originalEvent: EventObject,
    position: Position,
    renderedPosition: Position,
    timeStamp: scala.Double,
    `type`: UserInputDeviceEventName | UserInputDeviceEventNameExt,
    target: js.Any = null
  ): EventObject = {
    val __obj = js.Dynamic.literal(cy = cy, layout = layout, namespace = namespace, originalEvent = originalEvent, position = position, renderedPosition = renderedPosition, timeStamp = timeStamp)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[EventObject]
  }
}

