package typings.babylonjs.BABYLON

import typings.std.MouseWheelEvent
import typings.std.PointerEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointerInfoBase extends js.Object {
  /**
    * Defines the related dom event
    */
  var event: PointerEvent | MouseWheelEvent
  /**
    * Defines the type of event (PointerEventTypes)
    */
  var `type`: Double
}

object PointerInfoBase {
  @scala.inline
  def apply(event: PointerEvent | MouseWheelEvent, `type`: Double): PointerInfoBase = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointerInfoBase]
  }
}

