package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * This class is used to store pointer related info for the onPrePointerObservable event.
     * Set the skipOnPointerObservable property to true if you want the engine to stop any process after this event is triggered, even not calling onPointerObservable
     */
@JSGlobal("BABYLON.PointerInfoPre")
@js.native
class PointerInfoPre protected () extends PointerInfoBase {
  /**
           * Instantiates a PointerInfoPre to store pointer related info to the onPrePointerObservable event.
           * @param type Defines the type of event (BABYLON.PointerEventTypes)
           * @param event Defines the related dom event
           * @param localX Defines the local x coordinates of the pointer when the event occured
           * @param localY Defines the local y coordinates of the pointer when the event occured
           */
  def this(`type`: scala.Double, event: stdLib.MouseWheelEvent, localX: scala.Double, localY: scala.Double) = this()
  /**
           * Instantiates a PointerInfoPre to store pointer related info to the onPrePointerObservable event.
           * @param type Defines the type of event (BABYLON.PointerEventTypes)
           * @param event Defines the related dom event
           * @param localX Defines the local x coordinates of the pointer when the event occured
           * @param localY Defines the local y coordinates of the pointer when the event occured
           */
  def this(`type`: scala.Double, event: stdLib.PointerEvent, localX: scala.Double, localY: scala.Double) = this()
  /**
           * Defines the local position of the pointer on the canvas.
           */
  var localPosition: Vector2 = js.native
  /**
           * Ray from a pointer if availible (eg. 6dof controller)
           */
  var ray: Nullable[Ray] = js.native
  /**
           * Defines whether the engine should skip the next OnPointerObservable associated to this pre.
           */
  var skipOnPointerObservable: scala.Boolean = js.native
}

