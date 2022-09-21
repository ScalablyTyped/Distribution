package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.IMouseEvent
import typings.babylonjs.BABYLON.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.PointerInfoPre")
@js.native
open class PointerInfoPre protected ()
  extends StObject
     with typings.babylonjs.BABYLON.PointerInfoPre {
  /**
    * Instantiates a PointerInfoPre to store pointer related info to the onPrePointerObservable event.
    * @param type Defines the type of event (PointerEventTypes)
    * @param event Defines the related dom event
    * @param localX Defines the local x coordinates of the pointer when the event occured
    * @param localY Defines the local y coordinates of the pointer when the event occured
    */
  def this(`type`: Double, event: IMouseEvent, localX: Double, localY: Double) = this()
  
  /**
    * Defines the related dom event
    */
  /* CompleteClass */
  var event: IMouseEvent = js.native
  
  /**
    * Defines the local position of the pointer on the canvas.
    */
  /* CompleteClass */
  var localPosition: typings.babylonjs.BABYLON.Vector2 = js.native
  
  /**
    * Defines picking info coming from a near interaction (proximity instead of ray-based picking)
    */
  /* CompleteClass */
  var nearInteractionPickingInfo: Nullable[typings.babylonjs.BABYLON.PickingInfo] = js.native
  
  /**
    * Ray from a pointer if available (eg. 6dof controller)
    */
  /* CompleteClass */
  var ray: Nullable[typings.babylonjs.BABYLON.Ray] = js.native
  
  /**
    * Defines whether the engine should skip the next OnPointerObservable associated to this pre.
    */
  /* CompleteClass */
  var skipOnPointerObservable: Boolean = js.native
  
  /**
    * Defines the type of event (PointerEventTypes)
    */
  /* CompleteClass */
  var `type`: Double = js.native
}
