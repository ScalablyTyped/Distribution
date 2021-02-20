package typings.babylonjs.legacyMod

import typings.babylonjs.typesMod.Nullable
import typings.std.MouseWheelEvent
import typings.std.PointerEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "PointerInfo")
@js.native
class PointerInfo protected ()
  extends typings.babylonjs.indexMod.PointerInfo {
  def this(
    `type`: Double,
    event: MouseWheelEvent,
    /**
    * Defines the picking info associated to the info (if any)\
    */
  pickInfo: Nullable[typings.babylonjs.pickingInfoMod.PickingInfo]
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
  pickInfo: Nullable[typings.babylonjs.pickingInfoMod.PickingInfo]
  ) = this()
}
