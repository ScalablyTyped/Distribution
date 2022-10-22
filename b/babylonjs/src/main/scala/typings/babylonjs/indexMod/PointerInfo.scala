package typings.babylonjs.indexMod

import typings.babylonjs.eventsDeviceInputEventsMod.IMouseEvent
import typings.babylonjs.inputsSceneDotinputManagerMod.InputManager
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "PointerInfo")
@js.native
open class PointerInfo protected ()
  extends typings.babylonjs.eventsIndexMod.PointerInfo {
  /**
    * Instantiates a PointerInfo to store pointer related info to the onPointerObservable event.
    * @param type Defines the type of event (PointerEventTypes)
    * @param event Defines the related dom event
    * @param pickInfo Defines the picking info associated to the info (if any)
    * @param inputManager Defines the InputManager to use if there is no pickInfo
    */
  def this(
    `type`: Double,
    event: IMouseEvent,
    pickInfo: Nullable[typings.babylonjs.collisionsPickingInfoMod.PickingInfo]
  ) = this()
  def this(
    `type`: Double,
    event: IMouseEvent,
    pickInfo: Nullable[typings.babylonjs.collisionsPickingInfoMod.PickingInfo],
    inputManager: Nullable[InputManager]
  ) = this()
}
