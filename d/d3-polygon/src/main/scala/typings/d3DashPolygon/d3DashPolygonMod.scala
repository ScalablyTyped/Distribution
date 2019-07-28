package typings.d3DashPolygon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3-polygon", JSImport.Namespace)
@js.native
object d3DashPolygonMod extends js.Object {
  def polygonArea(polygon: js.Array[js.Tuple2[Double, Double]]): Double = js.native
  def polygonCentroid(polygon: js.Array[js.Tuple2[Double, Double]]): js.Tuple2[Double, Double] = js.native
  def polygonContains(polygon: js.Array[js.Tuple2[Double, Double]], point: js.Tuple2[Double, Double]): Boolean = js.native
  def polygonHull(points: js.Array[js.Tuple2[Double, Double]]): (js.Array[js.Tuple2[Double, Double]]) | Null = js.native
  def polygonLength(polygon: js.Array[js.Tuple2[Double, Double]]): Double = js.native
}

