package typings.cesium

import typings.cesium.cesiumMod.Geometry
import typings.cesium.cesiumMod.Matrix4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Geometry extends js.Object {
  var geometry: Geometry
  var length: js.UndefOr[Double] = js.undefined
  var modelMatrix: js.UndefOr[Matrix4] = js.undefined
}

object Anon_Geometry {
  @scala.inline
  def apply(geometry: Geometry, length: Int | Double = null, modelMatrix: Matrix4 = null): Anon_Geometry = {
    val __obj = js.Dynamic.literal(geometry = geometry)
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (modelMatrix != null) __obj.updateDynamic("modelMatrix")(modelMatrix)
    __obj.asInstanceOf[Anon_Geometry]
  }
}

