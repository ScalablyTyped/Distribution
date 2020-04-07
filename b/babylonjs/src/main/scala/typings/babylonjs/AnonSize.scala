package typings.babylonjs

import typings.babylonjs.mathPlaneMod.Plane
import typings.babylonjs.mathVectorMod.Vector4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSize extends js.Object {
  var backUVs: js.UndefOr[Vector4] = js.undefined
  var frontUVs: js.UndefOr[Vector4] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var sideOrientation: js.UndefOr[Double] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var sourcePlane: js.UndefOr[Plane] = js.undefined
  var updatable: js.UndefOr[Boolean] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object AnonSize {
  @scala.inline
  def apply(
    backUVs: Vector4 = null,
    frontUVs: Vector4 = null,
    height: Int | Double = null,
    sideOrientation: Int | Double = null,
    size: Int | Double = null,
    sourcePlane: Plane = null,
    updatable: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null
  ): AnonSize = {
    val __obj = js.Dynamic.literal()
    if (backUVs != null) __obj.updateDynamic("backUVs")(backUVs.asInstanceOf[js.Any])
    if (frontUVs != null) __obj.updateDynamic("frontUVs")(frontUVs.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (sideOrientation != null) __obj.updateDynamic("sideOrientation")(sideOrientation.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (sourcePlane != null) __obj.updateDynamic("sourcePlane")(sourcePlane.asInstanceOf[js.Any])
    if (!js.isUndefined(updatable)) __obj.updateDynamic("updatable")(updatable.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSize]
  }
}

