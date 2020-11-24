package typings.cesium.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "Intersections2D")
@js.native
object Intersections2D extends js.Object {
  
  def clipTriangleAtAxisAlignedThreshold(threshold: Double, keepAbove: Boolean, u0: Double, u1: Double, u2: Double): js.Array[Double] = js.native
  def clipTriangleAtAxisAlignedThreshold(
    threshold: Double,
    keepAbove: Boolean,
    u0: Double,
    u1: Double,
    u2: Double,
    result: js.Array[Double]
  ): js.Array[Double] = js.native
  
  def computeBarycentricCoordinates(x: Double, y: Double, x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double): Cartesian3 = js.native
  def computeBarycentricCoordinates(
    x: Double,
    y: Double,
    x1: Double,
    y1: Double,
    x2: Double,
    y2: Double,
    x3: Double,
    y3: Double,
    result: Cartesian3
  ): Cartesian3 = js.native
}
