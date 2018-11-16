package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * This type contains all the data related to a pointer event in Babylon.js.
     * The event member is an instance of PointerEvent for all types except PointerWheel and is of type MouseWheelEvent when type equals PointerWheel. The different event types can be found in the PointerEventTypes class.
     */
@JSGlobal("BABYLON.PointerInfo")
@js.native
class PointerInfo protected () extends PointerInfoBase {
  /**
           * Instantiates a PointerInfo to store pointer related info to the onPointerObservable event.
           * @param type Defines the type of event (BABYLON.PointerEventTypes)
           * @param event Defines the related dom event
           * @param pickInfo Defines the picking info associated to the info (if any)\
           */
  def this(`type`: scala.Double, event: stdLib.MouseWheelEvent, /**
           * Defines the picking info associated to the info (if any)\
           */
  pickInfo: Nullable[PickingInfo]) = this()
  /**
           * Instantiates a PointerInfo to store pointer related info to the onPointerObservable event.
           * @param type Defines the type of event (BABYLON.PointerEventTypes)
           * @param event Defines the related dom event
           * @param pickInfo Defines the picking info associated to the info (if any)\
           */
  def this(`type`: scala.Double, event: stdLib.PointerEvent, /**
           * Defines the picking info associated to the info (if any)\
           */
  pickInfo: Nullable[PickingInfo]) = this()
  /**
           * Defines the picking info associated to the info (if any)\
           */
  var pickInfo: Nullable[PickingInfo] = js.native
}

