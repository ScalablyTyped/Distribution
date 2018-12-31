package typings
package c3Lib.c3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait YTickConfiguration extends js.Object {
  /**
    * The number of y axis ticks to show.
    * The position of the ticks will be calculated precisely, so the values on the ticks will not be rounded nicely. In the case, axis.y.tick.format or axis.y.tick.values will be helpful.
    */
  var count: js.UndefOr[scala.Double] = js.undefined
  /**
    * Set formatter for y axis tick text.
    * This option accepts d3.format object as well as a function you define.
    */
  var format: js.UndefOr[js.Function1[/* x */ scala.Double, java.lang.String]] = js.undefined
  /**
    * Show or hide outer tick.
    */
  var outer: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Set the y values of ticks manually.
    */
  var values: js.UndefOr[js.Array[scala.Double]] = js.undefined
}

