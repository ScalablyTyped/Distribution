package typings.babylonjs.anon

import typings.babylonjs.mathVectorMod.Vector4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Radius extends js.Object {
  var arc: js.UndefOr[Double] = js.undefined
  var backUVs: js.UndefOr[Vector4] = js.undefined
  var frontUVs: js.UndefOr[Vector4] = js.undefined
  var radius: js.UndefOr[Double] = js.undefined
  var sideOrientation: js.UndefOr[Double] = js.undefined
  var tessellation: js.UndefOr[Double] = js.undefined
}

object Radius {
  @scala.inline
  def apply(
    arc: js.UndefOr[Double] = js.undefined,
    backUVs: Vector4 = null,
    frontUVs: Vector4 = null,
    radius: js.UndefOr[Double] = js.undefined,
    sideOrientation: js.UndefOr[Double] = js.undefined,
    tessellation: js.UndefOr[Double] = js.undefined
  ): Radius = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(arc)) __obj.updateDynamic("arc")(arc.get.asInstanceOf[js.Any])
    if (backUVs != null) __obj.updateDynamic("backUVs")(backUVs.asInstanceOf[js.Any])
    if (frontUVs != null) __obj.updateDynamic("frontUVs")(frontUVs.asInstanceOf[js.Any])
    if (!js.isUndefined(radius)) __obj.updateDynamic("radius")(radius.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sideOrientation)) __obj.updateDynamic("sideOrientation")(sideOrientation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tessellation)) __obj.updateDynamic("tessellation")(tessellation.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Radius]
  }
}

