package typings
package d3DashShapeLib.d3DashShapeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SeriesPoint[Datum]
  extends stdLib.Array[scala.Double] {
  /**
    * Corresponds to y0, the lower value (baseline).
    */
  var `0`: scala.Double = js.native
  /**
    * Corresponds to y1, the upper value (topline).
    */
  var `1`: scala.Double = js.native
  /**
    * The data element underlying the series point.
    */
  var data: Datum = js.native
}

