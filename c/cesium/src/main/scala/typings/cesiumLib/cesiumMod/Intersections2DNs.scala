package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "Intersections2D")
@js.native
object Intersections2DNs extends js.Object {
  def clipTriangleAtAxisAlignedThreshold(
    threshold: scala.Double,
    keepAbove: scala.Boolean,
    u0: scala.Double,
    u1: scala.Double,
    u2: scala.Double
  ): js.Array[scala.Double] = js.native
  def clipTriangleAtAxisAlignedThreshold(
    threshold: scala.Double,
    keepAbove: scala.Boolean,
    u0: scala.Double,
    u1: scala.Double,
    u2: scala.Double,
    result: js.Array[scala.Double]
  ): js.Array[scala.Double] = js.native
  def computeBarycentricCoordinates(
    x: scala.Double,
    y: scala.Double,
    x1: scala.Double,
    y1: scala.Double,
    x2: scala.Double,
    y2: scala.Double,
    x3: scala.Double,
    y3: scala.Double
  ): cesiumLib.cesiumMod.CesiumNs.Cartesian3 = js.native
  def computeBarycentricCoordinates(
    x: scala.Double,
    y: scala.Double,
    x1: scala.Double,
    y1: scala.Double,
    x2: scala.Double,
    y2: scala.Double,
    x3: scala.Double,
    y3: scala.Double,
    result: cesiumLib.cesiumMod.CesiumNs.Cartesian3
  ): cesiumLib.cesiumMod.CesiumNs.Cartesian3 = js.native
}

