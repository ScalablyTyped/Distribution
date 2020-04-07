package typings.babylonjs

import typings.babylonjs.mathVectorMod.Vector4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRadius extends js.Object {
  var arc: js.UndefOr[Double] = js.undefined
  var backUVs: js.UndefOr[Vector4] = js.undefined
  var frontUVs: js.UndefOr[Vector4] = js.undefined
  var radius: js.UndefOr[Double] = js.undefined
  var sideOrientation: js.UndefOr[Double] = js.undefined
  var tessellation: js.UndefOr[Double] = js.undefined
}

object AnonRadius {
  @scala.inline
  def apply(
    arc: Int | Double = null,
    backUVs: Vector4 = null,
    frontUVs: Vector4 = null,
    radius: Int | Double = null,
    sideOrientation: Int | Double = null,
    tessellation: Int | Double = null
  ): AnonRadius = {
    val __obj = js.Dynamic.literal()
    if (arc != null) __obj.updateDynamic("arc")(arc.asInstanceOf[js.Any])
    if (backUVs != null) __obj.updateDynamic("backUVs")(backUVs.asInstanceOf[js.Any])
    if (frontUVs != null) __obj.updateDynamic("frontUVs")(frontUVs.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (sideOrientation != null) __obj.updateDynamic("sideOrientation")(sideOrientation.asInstanceOf[js.Any])
    if (tessellation != null) __obj.updateDynamic("tessellation")(tessellation.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRadius]
  }
}

