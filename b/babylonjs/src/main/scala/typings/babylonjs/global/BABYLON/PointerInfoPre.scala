package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Nullable
import typings.std.MouseWheelEvent
import typings.std.PointerEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.PointerInfoPre")
@js.native
class PointerInfoPre protected ()
  extends StObject
     with typings.babylonjs.BABYLON.PointerInfoPre {
  def this(`type`: Double, event: MouseWheelEvent, localX: Double, localY: Double) = this()
  /**
    * Instantiates a PointerInfoPre to store pointer related info to the onPrePointerObservable event.
    * @param type Defines the type of event (PointerEventTypes)
    * @param event Defines the related dom event
    * @param localX Defines the local x coordinates of the pointer when the event occured
    * @param localY Defines the local y coordinates of the pointer when the event occured
    */
  def this(`type`: Double, event: PointerEvent, localX: Double, localY: Double) = this()
  
  /**
    * Defines the related dom event
    */
  /* CompleteClass */
  var event: PointerEvent | MouseWheelEvent = js.native
  
  /**
    * Defines the local position of the pointer on the canvas.
    */
  /* CompleteClass */
  var localPosition: typings.babylonjs.BABYLON.Vector2 = js.native
  
  /**
    * Ray from a pointer if availible (eg. 6dof controller)
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
