package typings
package c3Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Lines extends js.Object {
  /**
    * Show additional grid lines along x axis.
    * This option accepts array including object that has value, text, position and class. text, position and class are optional. For position, start, middle and end (default) are available.
    * If x axis is category axis, value can be category name. If x axis is timeseries axis, value can be date string, Date object and unixtime integer.
    */
  var lines: js.UndefOr[js.Array[c3Lib.c3Mod.LineOptions]] = js.undefined
  /**
    * Show grids along x axis.
    */
  var show: js.UndefOr[scala.Boolean] = js.undefined
}

