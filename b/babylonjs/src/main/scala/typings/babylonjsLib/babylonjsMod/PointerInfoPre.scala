package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This class is used to store pointer related info for the onPrePointerObservable event.
  * Set the skipOnPointerObservable property to true if you want the engine to stop any process after this event is triggered, even not calling onPointerObservable
  */
@JSImport("babylonjs", "PointerInfoPre")
@js.native
class PointerInfoPre protected ()
  extends babylonjsLib.BABYLONNs.PointerInfoPre {
  def this(`type`: scala.Double, event: stdLib.MouseWheelEvent, localX: scala.Double, localY: scala.Double) = this()
  /**
    * Instantiates a PointerInfoPre to store pointer related info to the onPrePointerObservable event.
    * @param type Defines the type of event (BABYLON.PointerEventTypes)
    * @param event Defines the related dom event
    * @param localX Defines the local x coordinates of the pointer when the event occured
    * @param localY Defines the local y coordinates of the pointer when the event occured
    */
  def this(`type`: scala.Double, event: stdLib.PointerEvent, localX: scala.Double, localY: scala.Double) = this()
}

