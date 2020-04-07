package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointerTouch extends js.Object {
  /**
    * Id of touch. Unique for each finger.
    */
  var pointerId: Double
  /**
    * Event type passed from DOM.
    */
  var `type`: js.Any
  /**
    * X coordinate of touch.
    */
  var x: Double
  /**
    * Y coordinate of touch.
    */
  var y: Double
}

object PointerTouch {
  @scala.inline
  def apply(pointerId: Double, `type`: js.Any, x: Double, y: Double): PointerTouch = {
    val __obj = js.Dynamic.literal(pointerId = pointerId.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointerTouch]
  }
}

