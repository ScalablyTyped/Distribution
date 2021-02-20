package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Intersections2D {
  
  @JSImport("cesium", "Intersections2D.clipTriangleAtAxisAlignedThreshold")
  @js.native
  def clipTriangleAtAxisAlignedThreshold(threshold: Double, keepAbove: Boolean, u0: Double, u1: Double, u2: Double): js.Array[Double] = js.native
  @JSImport("cesium", "Intersections2D.clipTriangleAtAxisAlignedThreshold")
  @js.native
  def clipTriangleAtAxisAlignedThreshold(
    threshold: Double,
    keepAbove: Boolean,
    u0: Double,
    u1: Double,
    u2: Double,
    result: js.Array[Double]
  ): js.Array[Double] = js.native
  
  @JSImport("cesium", "Intersections2D.computeBarycentricCoordinates")
  @js.native
  def computeBarycentricCoordinates(x: Double, y: Double, x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double): Cartesian3 = js.native
  @JSImport("cesium", "Intersections2D.computeBarycentricCoordinates")
  @js.native
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
