package typings.babylonjs.BABYLON

import typings.std.MouseWheelEvent
import typings.std.PointerEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.PointerInfoBase")
@js.native
class PointerInfoBase protected () extends js.Object {
  def this(
    /**
    * Defines the type of event (PointerEventTypes)
    */
  `type`: Double,
    /**
    * Defines the related dom event
    */
  event: MouseWheelEvent
  ) = this()
  /**
    * Instantiates the base class of pointers info.
    * @param type Defines the type of event (PointerEventTypes)
    * @param event Defines the related dom event
    */
  def this(
    /**
    * Defines the type of event (PointerEventTypes)
    */
  `type`: Double,
    /**
    * Defines the related dom event
    */
  event: PointerEvent
  ) = this()
  /**
    * Defines the related dom event
    */
  var event: PointerEvent | MouseWheelEvent = js.native
  /**
    * Defines the type of event (PointerEventTypes)
    */
  var `type`: Double = js.native
}

