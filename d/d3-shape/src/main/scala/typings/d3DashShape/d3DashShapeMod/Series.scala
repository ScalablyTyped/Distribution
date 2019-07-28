package typings.d3DashShape.d3DashShapeMod

import typings.std.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Series[Datum, Key] extends Array[SeriesPoint[Datum]] {
  /**
    * Index of the series in the series array returned by stack generator.
    */
  var index: Double = js.native
  /**
    * Key of the series.
    */
  var key: Key = js.native
}

