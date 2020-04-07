package typings.babylonjs

import typings.babylonjs.mathVectorMod.Vector4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFlat extends js.Object {
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

object AnonFlat {
  @scala.inline
  def apply(
    backUVs: Vector4 = null,
    flat: js.UndefOr[Boolean] = js.undefined,
    frontUVs: Vector4 = null,
    radius: Int | Double = null,
    radiusX: Int | Double = null,
    radiusY: Int | Double = null,
    radiusZ: Int | Double = null,
    sideOrientation: Int | Double = null,
    subdivisions: Int | Double = null
  ): AnonFlat = {
    val __obj = js.Dynamic.literal()
    if (backUVs != null) __obj.updateDynamic("backUVs")(backUVs.asInstanceOf[js.Any])
    if (!js.isUndefined(flat)) __obj.updateDynamic("flat")(flat.asInstanceOf[js.Any])
    if (frontUVs != null) __obj.updateDynamic("frontUVs")(frontUVs.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (radiusX != null) __obj.updateDynamic("radiusX")(radiusX.asInstanceOf[js.Any])
    if (radiusY != null) __obj.updateDynamic("radiusY")(radiusY.asInstanceOf[js.Any])
    if (radiusZ != null) __obj.updateDynamic("radiusZ")(radiusZ.asInstanceOf[js.Any])
    if (sideOrientation != null) __obj.updateDynamic("sideOrientation")(sideOrientation.asInstanceOf[js.Any])
    if (subdivisions != null) __obj.updateDynamic("subdivisions")(subdivisions.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFlat]
  }
}

