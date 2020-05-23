package typings.babylonjs.anon

import typings.babylonjs.mathVectorMod.Vector4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Flat extends js.Object {
  var backUVs: js.UndefOr[Vector4] = js.undefined
  var flat: js.UndefOr[Boolean] = js.undefined
  var frontUVs: js.UndefOr[Vector4] = js.undefined
  var radius: js.UndefOr[Double] = js.undefined
  var radiusX: js.UndefOr[Double] = js.undefined
  var radiusY: js.UndefOr[Double] = js.undefined
  var radiusZ: js.UndefOr[Double] = js.undefined
  var sideOrientation: js.UndefOr[Double] = js.undefined
  var subdivisions: js.UndefOr[Double] = js.undefined
}

object Flat {
  @scala.inline
  def apply(
    backUVs: Vector4 = null,
    flat: js.UndefOr[Boolean] = js.undefined,
    frontUVs: Vector4 = null,
    radius: js.UndefOr[Double] = js.undefined,
    radiusX: js.UndefOr[Double] = js.undefined,
    radiusY: js.UndefOr[Double] = js.undefined,
    radiusZ: js.UndefOr[Double] = js.undefined,
    sideOrientation: js.UndefOr[Double] = js.undefined,
    subdivisions: js.UndefOr[Double] = js.undefined
  ): Flat = {
    val __obj = js.Dynamic.literal()
    if (backUVs != null) __obj.updateDynamic("backUVs")(backUVs.asInstanceOf[js.Any])
    if (!js.isUndefined(flat)) __obj.updateDynamic("flat")(flat.get.asInstanceOf[js.Any])
    if (frontUVs != null) __obj.updateDynamic("frontUVs")(frontUVs.asInstanceOf[js.Any])
    if (!js.isUndefined(radius)) __obj.updateDynamic("radius")(radius.get.asInstanceOf[js.Any])
    if (!js.isUndefined(radiusX)) __obj.updateDynamic("radiusX")(radiusX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(radiusY)) __obj.updateDynamic("radiusY")(radiusY.get.asInstanceOf[js.Any])
    if (!js.isUndefined(radiusZ)) __obj.updateDynamic("radiusZ")(radiusZ.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sideOrientation)) __obj.updateDynamic("sideOrientation")(sideOrientation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(subdivisions)) __obj.updateDynamic("subdivisions")(subdivisions.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flat]
  }
}

