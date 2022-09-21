package typings.babylonjs.legacyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "PointerEventTypes")
@js.native
open class PointerEventTypes ()
  extends typings.babylonjs.indexMod.PointerEventTypes
/* static members */
object PointerEventTypes {
  
  /**
    * The pointerdoubletap event is fired when a the object has been touched and released twice without drag.
    */
  @JSImport("babylonjs/Legacy/legacy", "PointerEventTypes.POINTERDOUBLETAP")
  @js.native
  val POINTERDOUBLETAP: Double = js.native
  
  /**
    * The pointerdown event is fired when a pointer becomes active. For mouse, it is fired when the device transitions from no buttons depressed to at least one button depressed. For touch, it is fired when physical contact is made with the digitizer. For pen, it is fired when the stylus makes physical contact with the digitizer.
    */
  @JSImport("babylonjs/Legacy/legacy", "PointerEventTypes.POINTERDOWN")
  @js.native
  val POINTERDOWN: Double = js.native
  
  /**
    * The pointermove event is fired when a pointer changes coordinates.
    */
  @JSImport("babylonjs/Legacy/legacy", "PointerEventTypes.POINTERMOVE")
  @js.native
  val POINTERMOVE: Double = js.native
  
  /**
    * The pointerpick event is fired when a mesh or sprite has been picked by the pointer.
    */
  @JSImport("babylonjs/Legacy/legacy", "PointerEventTypes.POINTERPICK")
  @js.native
  val POINTERPICK: Double = js.native
  
  /**
    * The pointertap event is fired when a the object has been touched and released without drag.
    */
  @JSImport("babylonjs/Legacy/legacy", "PointerEventTypes.POINTERTAP")
  @js.native
  val POINTERTAP: Double = js.native
  
  /**
    * The pointerup event is fired when a pointer is no longer active.
    */
  @JSImport("babylonjs/Legacy/legacy", "PointerEventTypes.POINTERUP")
  @js.native
  val POINTERUP: Double = js.native
  
  /**
    * The pointerwheel event is fired when a mouse wheel has been rotated.
    */
  @JSImport("babylonjs/Legacy/legacy", "PointerEventTypes.POINTERWHEEL")
  @js.native
  val POINTERWHEEL: Double = js.native
}
