package typings.babylonjs.anon

import typings.babylonjs.mathVectorMod.Vector4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Thickness extends js.Object {
  var backUVs: js.UndefOr[Vector4] = js.undefined
  var diameter: js.UndefOr[Double] = js.undefined
  var frontUVs: js.UndefOr[Vector4] = js.undefined
  var sideOrientation: js.UndefOr[Double] = js.undefined
  var tessellation: js.UndefOr[Double] = js.undefined
  var thickness: js.UndefOr[Double] = js.undefined
  var updatable: js.UndefOr[Boolean] = js.undefined
}

object Thickness {
  @scala.inline
  def apply(
    backUVs: Vector4 = null,
    diameter: js.UndefOr[Double] = js.undefined,
    frontUVs: Vector4 = null,
    sideOrientation: js.UndefOr[Double] = js.undefined,
    tessellation: js.UndefOr[Double] = js.undefined,
    thickness: js.UndefOr[Double] = js.undefined,
    updatable: js.UndefOr[Boolean] = js.undefined
  ): Thickness = {
    val __obj = js.Dynamic.literal()
    if (backUVs != null) __obj.updateDynamic("backUVs")(backUVs.asInstanceOf[js.Any])
    if (!js.isUndefined(diameter)) __obj.updateDynamic("diameter")(diameter.get.asInstanceOf[js.Any])
    if (frontUVs != null) __obj.updateDynamic("frontUVs")(frontUVs.asInstanceOf[js.Any])
    if (!js.isUndefined(sideOrientation)) __obj.updateDynamic("sideOrientation")(sideOrientation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tessellation)) __obj.updateDynamic("tessellation")(tessellation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(thickness)) __obj.updateDynamic("thickness")(thickness.get.asInstanceOf[js.Any])
    if (!js.isUndefined(updatable)) __obj.updateDynamic("updatable")(updatable.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Thickness]
  }
}

