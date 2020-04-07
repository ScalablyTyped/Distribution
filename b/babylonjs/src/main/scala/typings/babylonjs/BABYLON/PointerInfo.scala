package typings.babylonjs.BABYLON

import typings.std.MouseWheelEvent
import typings.std.PointerEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.PointerInfo")
@js.native
class PointerInfo protected () extends PointerInfoBase {
  def this(
    `type`: Double,
    event: MouseWheelEvent,
    /**
    * Defines the picking info associated to the info (if any)\
    */
  pickInfo: Nullable[PickingInfo]
  ) = this()
  /**
    * Instantiates a PointerInfo to store pointer related info to the onPointerObservable event.
    * @param type Defines the type of event (PointerEventTypes)
    * @param event Defines the related dom event
    * @param pickInfo Defines the picking info associated to the info (if any)\
    */
  def this(
    `type`: Double,
    event: PointerEvent,
    /**
    * Defines the picking info associated to the info (if any)\
    */
  pickInfo: Nullable[PickingInfo]
  ) = this()
  /**
    * Defines the picking info associated to the info (if any)\
    */
  var pickInfo: Nullable[PickingInfo] = js.native
}

