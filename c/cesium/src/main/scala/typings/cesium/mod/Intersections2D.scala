package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Intersections2D {
  
  @JSImport("cesium", "Intersections2D")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def clipTriangleAtAxisAlignedThreshold(threshold: Double, keepAbove: Boolean, u0: Double, u1: Double, u2: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("clipTriangleAtAxisAlignedThreshold")(threshold.asInstanceOf[js.Any], keepAbove.asInstanceOf[js.Any], u0.asInstanceOf[js.Any], u1.asInstanceOf[js.Any], u2.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  @scala.inline
  def clipTriangleAtAxisAlignedThreshold(
    threshold: Double,
    keepAbove: Boolean,
    u0: Double,
    u1: Double,
    u2: Double,
    result: js.Array[Double]
  ): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("clipTriangleAtAxisAlignedThreshold")(threshold.asInstanceOf[js.Any], keepAbove.asInstanceOf[js.Any], u0.asInstanceOf[js.Any], u1.asInstanceOf[js.Any], u2.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  @scala.inline
  def computeBarycentricCoordinates(x: Double, y: Double, x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("computeBarycentricCoordinates")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any], x3.asInstanceOf[js.Any], y3.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
  @scala.inline
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
  ): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("computeBarycentricCoordinates")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any], x3.asInstanceOf[js.Any], y3.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
}
