package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Gather the list of pointer event types as constants.
     */
@JSGlobal("BABYLON.PointerEventTypes")
@js.native
class PointerEventTypes () extends js.Object

/**
     * Gather the list of pointer event types as constants.
     */
@JSGlobal("BABYLON.PointerEventTypes")
@js.native
object PointerEventTypes extends js.Object {
  /**
           * The pointerdoubletap event is fired when a the object has been touched and released twice without drag.
           */
  val POINTERDOUBLETAP: scala.Double = js.native
  /**
           * The pointerdown event is fired when a pointer becomes active. For mouse, it is fired when the device transitions from no buttons depressed to at least one button depressed. For touch, it is fired when physical contact is made with the digitizer. For pen, it is fired when the stylus makes physical contact with the digitizer.
           */
  val POINTERDOWN: scala.Double = js.native
  /**
           * The pointermove event is fired when a pointer changes coordinates.
           */
  val POINTERMOVE: scala.Double = js.native
  /**
           * The pointerpick event is fired when a mesh or sprite has been picked by the pointer.
           */
  val POINTERPICK: scala.Double = js.native
  /**
           * The pointertap event is fired when a the object has been touched and released without drag.
           */
  val POINTERTAP: scala.Double = js.native
  /**
           * The pointerup event is fired when a pointer is no longer active.
           */
  val POINTERUP: scala.Double = js.native
  /**
           * The pointerwheel event is fired when a mouse wheel has been rotated.
           */
  val POINTERWHEEL: scala.Double = js.native
}

