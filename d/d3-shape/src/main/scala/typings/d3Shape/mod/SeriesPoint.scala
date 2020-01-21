package typings.d3Shape.mod

import typings.std.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SeriesPoint[Datum] extends Array[Double] {
  /**
    * Corresponds to y0, the lower value (baseline).
    */
  var `0`: Double = js.native
  /**
    * Corresponds to y1, the upper value (topline).
    */
  var `1`: Double = js.native
  /**
    * The data element underlying the series point.
    */
  var data: Datum = js.native
}

