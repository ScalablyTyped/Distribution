package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Geometry extends js.Object {
  var geometry: cesiumLib.cesiumMod.Geometry
  var length: js.UndefOr[scala.Double] = js.undefined
  var modelMatrix: js.UndefOr[cesiumLib.cesiumMod.Matrix4] = js.undefined
}

object Anon_Geometry {
  @scala.inline
  def apply(
    geometry: cesiumLib.cesiumMod.Geometry,
    length: scala.Int | scala.Double = null,
    modelMatrix: cesiumLib.cesiumMod.Matrix4 = null
  ): Anon_Geometry = {
    val __obj = js.Dynamic.literal(geometry = geometry)
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (modelMatrix != null) __obj.updateDynamic("modelMatrix")(modelMatrix)
    __obj.asInstanceOf[Anon_Geometry]
  }
}

