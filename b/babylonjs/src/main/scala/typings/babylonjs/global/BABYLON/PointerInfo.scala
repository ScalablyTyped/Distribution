package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Nullable
import typings.std.MouseWheelEvent
import typings.std.PointerEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.PointerInfo")
@js.native
class PointerInfo protected ()
  extends typings.babylonjs.BABYLON.PointerInfo {
  def this(
    `type`: Double,
    event: MouseWheelEvent,
    /**
    * Defines the picking info associated to the info (if any)\
    */
  pickInfo: Nullable[typings.babylonjs.BABYLON.PickingInfo]
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
  pickInfo: Nullable[typings.babylonjs.BABYLON.PickingInfo]
  ) = this()
  /**
    * Defines the related dom event
    */
  /* CompleteClass */
  override var event: PointerEvent | MouseWheelEvent = js.native
  /**
    * Defines the picking info associated to the info (if any)\
    */
  /* CompleteClass */
  override var pickInfo: Nullable[typings.babylonjs.BABYLON.PickingInfo] = js.native
  /**
    * Defines the type of event (PointerEventTypes)
    */
  /* CompleteClass */
  override var `type`: Double = js.native
}

