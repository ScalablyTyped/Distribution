package typings.cesium.anon

import typings.cesium.mod.Matrix4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeometryLength extends js.Object {
  var geometry: typings.cesium.mod.Geometry
  var length: js.UndefOr[Double] = js.undefined
  var modelMatrix: js.UndefOr[Matrix4] = js.undefined
}

object GeometryLength {
  @scala.inline
  def apply(
    geometry: typings.cesium.mod.Geometry,
    length: js.UndefOr[Double] = js.undefined,
    modelMatrix: Matrix4 = null
  ): GeometryLength = {
    val __obj = js.Dynamic.literal(geometry = geometry.asInstanceOf[js.Any])
    if (!js.isUndefined(length)) __obj.updateDynamic("length")(length.get.asInstanceOf[js.Any])
    if (modelMatrix != null) __obj.updateDynamic("modelMatrix")(modelMatrix.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeometryLength]
  }
}

