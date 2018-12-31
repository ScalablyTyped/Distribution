package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Base class of pointer info types.
  */
@JSImport("babylonjs", "PointerInfoBase")
@js.native
class PointerInfoBase protected ()
  extends babylonjsLib.BABYLONNs.PointerInfoBase {
  def this(/**
    * Defines the type of event (BABYLON.PointerEventTypes)
    */
  `type`: scala.Double, /**
    * Defines the related dom event
    */
  event: stdLib.MouseWheelEvent) = this()
  /**
    * Instantiates the base class of pointers info.
    * @param type Defines the type of event (BABYLON.PointerEventTypes)
    * @param event Defines the related dom event
    */
  def this(/**
    * Defines the type of event (BABYLON.PointerEventTypes)
    */
  `type`: scala.Double, /**
    * Defines the related dom event
    */
  event: stdLib.PointerEvent) = this()
}

