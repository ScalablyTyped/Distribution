package typings.c3.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShowHideOptions extends js.Object {
  /** Controls whether the legend will be shown or hidden along with the data. */
  var withLegend: js.UndefOr[Boolean] = js.undefined
}

object ShowHideOptions {
  @scala.inline
  def apply(withLegend: js.UndefOr[Boolean] = js.undefined): ShowHideOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(withLegend)) __obj.updateDynamic("withLegend")(withLegend.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShowHideOptions]
  }
}

