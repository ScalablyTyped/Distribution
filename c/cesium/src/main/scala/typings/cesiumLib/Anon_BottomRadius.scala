package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BottomRadius extends js.Object {
  var bottomRadius: scala.Double
  var length: scala.Double
  var slices: js.UndefOr[scala.Double] = js.undefined
  var topRadius: scala.Double
  var vertexFormat: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.VertexFormat] = js.undefined
}

object Anon_BottomRadius {
  @scala.inline
  def apply(
    bottomRadius: scala.Double,
    length: scala.Double,
    topRadius: scala.Double,
    slices: scala.Int | scala.Double = null,
    vertexFormat: cesiumLib.cesiumMod.CesiumNs.VertexFormat = null
  ): Anon_BottomRadius = {
    val __obj = js.Dynamic.literal(bottomRadius = bottomRadius, length = length, topRadius = topRadius)
    if (slices != null) __obj.updateDynamic("slices")(slices.asInstanceOf[js.Any])
    if (vertexFormat != null) __obj.updateDynamic("vertexFormat")(vertexFormat)
    __obj.asInstanceOf[Anon_BottomRadius]
  }
}

