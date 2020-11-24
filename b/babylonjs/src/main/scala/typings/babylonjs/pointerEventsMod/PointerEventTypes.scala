package typings.babylonjs.pointerEventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Events/pointerEvents", "PointerEventTypes")
@js.native
class PointerEventTypes () extends js.Object
/* static members */
@JSImport("babylonjs/Events/pointerEvents", "PointerEventTypes")
@js.native
object PointerEventTypes extends js.Object {
  
  /**
    * The pointerdoubletap event is fired when a the object has been touched and released twice without drag.
    */
  val POINTERDOUBLETAP: Double = js.native
  
  /**
    * The pointerdown event is fired when a pointer becomes active. For mouse, it is fired when the device transitions from no buttons depressed to at least one button depressed. For touch, it is fired when physical contact is made with the digitizer. For pen, it is fired when the stylus makes physical contact with the digitizer.
    */
  val POINTERDOWN: Double = js.native
  
  /**
    * The pointermove event is fired when a pointer changes coordinates.
    */
  val POINTERMOVE: Double = js.native
  
  /**
    * The pointerpick event is fired when a mesh or sprite has been picked by the pointer.
    */
  val POINTERPICK: Double = js.native
  
  /**
    * The pointertap event is fired when a the object has been touched and released without drag.
    */
  val POINTERTAP: Double = js.native
  
  /**
    * The pointerup event is fired when a pointer is no longer active.
    */
  val POINTERUP: Double = js.native
  
  /**
    * The pointerwheel event is fired when a mouse wheel has been rotated.
    */
  val POINTERWHEEL: Double = js.native
}
