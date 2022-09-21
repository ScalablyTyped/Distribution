package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.PointerEventTypes")
@js.native
open class PointerEventTypes ()
  extends StObject
     with typings.babylonjs.BABYLON.PointerEventTypes
/* static members */
object PointerEventTypes {
  
  /**
    * The pointerdoubletap event is fired when a the object has been touched and released twice without drag.
    */
  @JSGlobal("BABYLON.PointerEventTypes.POINTERDOUBLETAP")
  @js.native
  val POINTERDOUBLETAP: /* 64 */ Double = js.native
  
  /**
    * The pointerdown event is fired when a pointer becomes active. For mouse, it is fired when the device transitions from no buttons depressed to at least one button depressed. For touch, it is fired when physical contact is made with the digitizer. For pen, it is fired when the stylus makes physical contact with the digitizer.
    */
  @JSGlobal("BABYLON.PointerEventTypes.POINTERDOWN")
  @js.native
  val POINTERDOWN: /* 1 */ Double = js.native
  
  /**
    * The pointermove event is fired when a pointer changes coordinates.
    */
  @JSGlobal("BABYLON.PointerEventTypes.POINTERMOVE")
  @js.native
  val POINTERMOVE: /* 4 */ Double = js.native
  
  /**
    * The pointerpick event is fired when a mesh or sprite has been picked by the pointer.
    */
  @JSGlobal("BABYLON.PointerEventTypes.POINTERPICK")
  @js.native
  val POINTERPICK: /* 16 */ Double = js.native
  
  /**
    * The pointertap event is fired when a the object has been touched and released without drag.
    */
  @JSGlobal("BABYLON.PointerEventTypes.POINTERTAP")
  @js.native
  val POINTERTAP: /* 32 */ Double = js.native
  
  /**
    * The pointerup event is fired when a pointer is no longer active.
    */
  @JSGlobal("BABYLON.PointerEventTypes.POINTERUP")
  @js.native
  val POINTERUP: /* 2 */ Double = js.native
  
  /**
    * The pointerwheel event is fired when a mouse wheel has been rotated.
    */
  @JSGlobal("BABYLON.PointerEventTypes.POINTERWHEEL")
  @js.native
  val POINTERWHEEL: /* 8 */ Double = js.native
}
