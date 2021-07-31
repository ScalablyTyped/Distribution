package typings.d3Polygon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("d3-polygon", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def polygonArea(polygon: js.Array[js.Tuple2[Double, Double]]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("polygonArea")(polygon.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def polygonCentroid(polygon: js.Array[js.Tuple2[Double, Double]]): js.Tuple2[Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("polygonCentroid")(polygon.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[Double, Double]]
  
  @scala.inline
  def polygonContains(polygon: js.Array[js.Tuple2[Double, Double]], point: js.Tuple2[Double, Double]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("polygonContains")(polygon.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def polygonHull(points: js.Array[js.Tuple2[Double, Double]]): (js.Array[js.Tuple2[Double, Double]]) | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("polygonHull")(points.asInstanceOf[js.Any]).asInstanceOf[(js.Array[js.Tuple2[Double, Double]]) | Null]
  
  @scala.inline
  def polygonLength(polygon: js.Array[js.Tuple2[Double, Double]]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("polygonLength")(polygon.asInstanceOf[js.Any]).asInstanceOf[Double]
}
