package typings.cheapDashRuler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object cheapDashRulerMod {
  type BBox = js.Tuple4[Double, Double, Double, Double]
  type Line = js.Array[Point]
  type Point = js.Tuple2[Double, Double]
  type Points = js.Array[Point]
  type Polygon = js.Array[js.Array[Point]]
}
