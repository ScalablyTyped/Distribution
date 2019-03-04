package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MaximumCorner extends js.Object {
  var maximumCorner: cesiumLib.cesiumMod.CesiumNs.Cartesian3
  var minimumCorner: cesiumLib.cesiumMod.CesiumNs.Cartesian3
  var vertexFormat: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.VertexFormat] = js.undefined
}

object Anon_MaximumCorner {
  @scala.inline
  def apply(
    maximumCorner: cesiumLib.cesiumMod.CesiumNs.Cartesian3,
    minimumCorner: cesiumLib.cesiumMod.CesiumNs.Cartesian3,
    vertexFormat: cesiumLib.cesiumMod.CesiumNs.VertexFormat = null
  ): Anon_MaximumCorner = {
    val __obj = js.Dynamic.literal(maximumCorner = maximumCorner, minimumCorner = minimumCorner)
    if (vertexFormat != null) __obj.updateDynamic("vertexFormat")(vertexFormat)
    __obj.asInstanceOf[Anon_MaximumCorner]
  }
}

