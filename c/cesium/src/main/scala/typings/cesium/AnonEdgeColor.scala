package typings.cesium

import typings.cesium.mod.ClippingPlane
import typings.cesium.mod.Color
import typings.cesium.mod.Matrix4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEdgeColor extends js.Object {
  var edgeColor: js.UndefOr[Color] = js.undefined
  var edgeWidth: js.UndefOr[Double] = js.undefined
  var enabled: js.UndefOr[Boolean] = js.undefined
  var modelMatrix: js.UndefOr[Matrix4] = js.undefined
  var planes: js.UndefOr[ClippingPlane] = js.undefined
  var unionClippingRegions: js.UndefOr[Boolean] = js.undefined
}

object AnonEdgeColor {
  @scala.inline
  def apply(
    edgeColor: Color = null,
    edgeWidth: Int | Double = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    modelMatrix: Matrix4 = null,
    planes: ClippingPlane = null,
    unionClippingRegions: js.UndefOr[Boolean] = js.undefined
  ): AnonEdgeColor = {
    val __obj = js.Dynamic.literal()
    if (edgeColor != null) __obj.updateDynamic("edgeColor")(edgeColor.asInstanceOf[js.Any])
    if (edgeWidth != null) __obj.updateDynamic("edgeWidth")(edgeWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (modelMatrix != null) __obj.updateDynamic("modelMatrix")(modelMatrix.asInstanceOf[js.Any])
    if (planes != null) __obj.updateDynamic("planes")(planes.asInstanceOf[js.Any])
    if (!js.isUndefined(unionClippingRegions)) __obj.updateDynamic("unionClippingRegions")(unionClippingRegions.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEdgeColor]
  }
}

