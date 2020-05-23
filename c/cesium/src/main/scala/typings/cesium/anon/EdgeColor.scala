package typings.cesium.anon

import typings.cesium.mod.ClippingPlane
import typings.cesium.mod.Matrix4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EdgeColor extends js.Object {
  var edgeColor: js.UndefOr[typings.cesium.mod.Color] = js.undefined
  var edgeWidth: js.UndefOr[Double] = js.undefined
  var enabled: js.UndefOr[Boolean] = js.undefined
  var modelMatrix: js.UndefOr[Matrix4] = js.undefined
  var planes: js.UndefOr[js.Array[ClippingPlane]] = js.undefined
  var unionClippingRegions: js.UndefOr[Boolean] = js.undefined
}

object EdgeColor {
  @scala.inline
  def apply(
    edgeColor: typings.cesium.mod.Color = null,
    edgeWidth: js.UndefOr[Double] = js.undefined,
    enabled: js.UndefOr[Boolean] = js.undefined,
    modelMatrix: Matrix4 = null,
    planes: js.Array[ClippingPlane] = null,
    unionClippingRegions: js.UndefOr[Boolean] = js.undefined
  ): EdgeColor = {
    val __obj = js.Dynamic.literal()
    if (edgeColor != null) __obj.updateDynamic("edgeColor")(edgeColor.asInstanceOf[js.Any])
    if (!js.isUndefined(edgeWidth)) __obj.updateDynamic("edgeWidth")(edgeWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (modelMatrix != null) __obj.updateDynamic("modelMatrix")(modelMatrix.asInstanceOf[js.Any])
    if (planes != null) __obj.updateDynamic("planes")(planes.asInstanceOf[js.Any])
    if (!js.isUndefined(unionClippingRegions)) __obj.updateDynamic("unionClippingRegions")(unionClippingRegions.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[EdgeColor]
  }
}

