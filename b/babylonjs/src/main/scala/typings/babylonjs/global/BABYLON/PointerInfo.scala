package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.IMouseEvent
import typings.babylonjs.BABYLON.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.PointerInfo")
@js.native
open class PointerInfo protected ()
  extends StObject
     with typings.babylonjs.BABYLON.PointerInfo {
  /**
    * Instantiates a PointerInfo to store pointer related info to the onPointerObservable event.
    * @param type Defines the type of event (PointerEventTypes)
    * @param event Defines the related dom event
    * @param pickInfo Defines the picking info associated to the info (if any)\
    */
  def this(
    `type`: Double,
    event: IMouseEvent,
    /**
    * Defines the picking info associated to the info (if any)\
    */
  pickInfo: Nullable[typings.babylonjs.BABYLON.PickingInfo]
  ) = this()
  
  /**
    * Defines the related dom event
    */
  /* CompleteClass */
  var event: IMouseEvent = js.native
  
  /**
    * Defines the picking info associated to the info (if any)\
    */
  /* CompleteClass */
  var pickInfo: Nullable[typings.babylonjs.BABYLON.PickingInfo] = js.native
  
  /**
    * Defines the type of event (PointerEventTypes)
    */
  /* CompleteClass */
  var `type`: Double = js.native
}
