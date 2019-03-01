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
    val __obj = js.Dynamic.literal(`type` = `type`.asInstanceOf[js.Any])
    __obj.updateDynamic("cy")(cy)
    __obj.updateDynamic("layout")(layout)
    __obj.updateDynamic("namespace")(namespace)
    __obj.updateDynamic("originalEvent")(originalEvent)
    __obj.updateDynamic("position")(position)
    __obj.updateDynamic("renderedPosition")(renderedPosition)
    __obj.updateDynamic("timeStamp")(timeStamp)
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[EventObject]
  }
}

