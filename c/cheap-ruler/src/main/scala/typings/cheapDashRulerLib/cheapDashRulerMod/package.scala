package typings
package cheapDashRulerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object cheapDashRulerMod {
  type BBox = js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double]
  type Line = js.Array[Point]
  type Point = js.Tuple2[scala.Double, scala.Double]
  type Points = js.Array[Point]
  type Polygon = js.Array[js.Array[Point]]
}
