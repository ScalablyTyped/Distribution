package typings.d3Shape.mod

import typings.std.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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

