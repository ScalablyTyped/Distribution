package typings.d3Polygon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("d3-polygon", "polygonArea")
  @js.native
  def polygonArea(polygon: js.Array[js.Tuple2[Double, Double]]): Double = js.native
  
  @JSImport("d3-polygon", "polygonCentroid")
  @js.native
  def polygonCentroid(polygon: js.Array[js.Tuple2[Double, Double]]): js.Tuple2[Double, Double] = js.native
  
  @JSImport("d3-polygon", "polygonContains")
  @js.native
  def polygonContains(polygon: js.Array[js.Tuple2[Double, Double]], point: js.Tuple2[Double, Double]): Boolean = js.native
  
  @JSImport("d3-polygon", "polygonHull")
  @js.native
  def polygonHull(points: js.Array[js.Tuple2[Double, Double]]): (js.Array[js.Tuple2[Double, Double]]) | Null = js.native
  
  @JSImport("d3-polygon", "polygonLength")
  @js.native
  def polygonLength(polygon: js.Array[js.Tuple2[Double, Double]]): Double = js.native
}
