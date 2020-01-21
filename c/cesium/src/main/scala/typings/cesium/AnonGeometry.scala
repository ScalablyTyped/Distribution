package typings.cesium

import typings.cesium.mod.Geometry
import typings.cesium.mod.Matrix4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGeometry extends js.Object {
  var geometry: Geometry
  var length: js.UndefOr[Double] = js.undefined
  var modelMatrix: js.UndefOr[Matrix4] = js.undefined
}

object AnonGeometry {
  @scala.inline
  def apply(geometry: Geometry, length: Int | Double = null, modelMatrix: Matrix4 = null): AnonGeometry = {
    val __obj = js.Dynamic.literal(geometry = geometry.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (modelMatrix != null) __obj.updateDynamic("modelMatrix")(modelMatrix.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGeometry]
  }
}

