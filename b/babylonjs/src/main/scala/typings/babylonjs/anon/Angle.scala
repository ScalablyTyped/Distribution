package typings.babylonjs.anon

import typings.babylonjs.mathVectorMod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Angle extends js.Object {
  var angle: js.UndefOr[Double] = js.undefined
  var normal: js.UndefOr[Vector3] = js.undefined
  var position: js.UndefOr[Vector3] = js.undefined
  var size: js.UndefOr[Vector3] = js.undefined
}

object Angle {
  @scala.inline
  def apply(
    angle: js.UndefOr[Double] = js.undefined,
    normal: Vector3 = null,
    position: Vector3 = null,
    size: Vector3 = null
  ): Angle = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(angle)) __obj.updateDynamic("angle")(angle.get.asInstanceOf[js.Any])
    if (normal != null) __obj.updateDynamic("normal")(normal.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Angle]
  }
}

