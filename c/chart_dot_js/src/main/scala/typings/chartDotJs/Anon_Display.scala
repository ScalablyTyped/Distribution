package typings.chartDotJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Display extends js.Object {
  var display: js.UndefOr[Boolean] = js.undefined
}

object Anon_Display {
  @scala.inline
  def apply(display: js.UndefOr[Boolean] = js.undefined): Anon_Display = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(display)) __obj.updateDynamic("display")(display)
    __obj.asInstanceOf[Anon_Display]
  }
}

