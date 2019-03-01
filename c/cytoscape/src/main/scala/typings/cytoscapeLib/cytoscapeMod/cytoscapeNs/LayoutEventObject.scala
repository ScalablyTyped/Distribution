package typings
package cytoscapeLib.cytoscapeMod.cytoscapeNs

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
    layout: js.Any,
    namespace: java.lang.String,
    timeStamp: scala.Double,
    `type`: UserInputDeviceEventName | UserInputDeviceEventNameExt,
    target: js.Any = null
  ): LayoutEventObject = {
    val __obj = js.Dynamic.literal(`type` = `type`.asInstanceOf[js.Any])
    __obj.updateDynamic("cy")(cy)
    __obj.updateDynamic("layout")(layout)
    __obj.updateDynamic("namespace")(namespace)
    __obj.updateDynamic("timeStamp")(timeStamp)
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[LayoutEventObject]
  }
}

