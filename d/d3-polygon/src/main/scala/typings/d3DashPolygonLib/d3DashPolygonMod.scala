package typings
package d3DashPolygonLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3-polygon", JSImport.Namespace)
@js.native
object d3DashPolygonMod extends js.Object {
  def polygonArea(polygon: js.Array[js.Tuple2[scala.Double, scala.Double]]): scala.Double = js.native
  def polygonCentroid(polygon: js.Array[js.Tuple2[scala.Double, scala.Double]]): js.Tuple2[scala.Double, scala.Double] = js.native
  def polygonContains(
    polygon: js.Array[js.Tuple2[scala.Double, scala.Double]],
    point: js.Tuple2[scala.Double, scala.Double]
  ): scala.Boolean = js.native
  def polygonHull(points: js.Array[js.Tuple2[scala.Double, scala.Double]]): (js.Array[js.Tuple2[scala.Double, scala.Double]]) | scala.Null = js.native
  def polygonLength(polygon: js.Array[js.Tuple2[scala.Double, scala.Double]]): scala.Double = js.native
}

