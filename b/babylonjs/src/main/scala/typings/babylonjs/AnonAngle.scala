package typings.babylonjs

import typings.babylonjs.mathVectorMod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAngle extends js.Object {
  var angle: js.UndefOr[Double] = js.undefined
  var normal: js.UndefOr[Vector3] = js.undefined
  var position: js.UndefOr[Vector3] = js.undefined
  var size: js.UndefOr[Vector3] = js.undefined
}

object AnonAngle {
  @scala.inline
  def apply(angle: Int | Double = null, normal: Vector3 = null, position: Vector3 = null, size: Vector3 = null): AnonAngle = {
    val __obj = js.Dynamic.literal()
    if (angle != null) __obj.updateDynamic("angle")(angle.asInstanceOf[js.Any])
    if (normal != null) __obj.updateDynamic("normal")(normal.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAngle]
  }
}

