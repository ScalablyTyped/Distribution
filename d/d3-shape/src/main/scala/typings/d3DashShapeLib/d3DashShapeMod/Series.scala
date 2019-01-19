package typings
package d3DashShapeLib.d3DashShapeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Series[Datum, Key]
  extends stdLib.Array[SeriesPoint[Datum]] {
  /**
    * Index of the series in the series array returned by stack generator.
    */
  var index: scala.Double = js.native
  /**
    * Key of the series.
    */
  var key: Key = js.native
}

