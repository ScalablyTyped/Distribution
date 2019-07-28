package typings.c3

import typings.c3.c3Mod.LineOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Lines extends js.Object {
  /**
    * Show additional grid lines along y axis.
    * This option accepts array including object that has value, text, position and class.
    */
  var lines: js.UndefOr[js.Array[LineOptions]] = js.undefined
  /**
    * Show grids along y axis.
    */
  var show: js.UndefOr[Boolean] = js.undefined
}

object Anon_Lines {
  @scala.inline
  def apply(lines: js.Array[LineOptions] = null, show: js.UndefOr[Boolean] = js.undefined): Anon_Lines = {
    val __obj = js.Dynamic.literal()
    if (lines != null) __obj.updateDynamic("lines")(lines)
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show)
    __obj.asInstanceOf[Anon_Lines]
  }
}

