package typings
package c3Lib.c3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubchartOptions extends js.Object {
  /**
    * Set callback for brush event.
    * Specified function receives the current zoomed x domain.
    */
  var onbrush: js.UndefOr[js.Function1[/* domain */ js.Any, scala.Unit]] = js.undefined
  /**
    * Show sub chart on the bottom of the chart.
    */
  var show: js.UndefOr[scala.Boolean] = js.undefined
  var size: js.UndefOr[c3Lib.Anon_HeightNumber] = js.undefined
}

object SubchartOptions {
  @scala.inline
  def apply(
    onbrush: js.Function1[/* domain */ js.Any, scala.Unit] = null,
    show: js.UndefOr[scala.Boolean] = js.undefined,
    size: c3Lib.Anon_HeightNumber = null
  ): SubchartOptions = {
    val __obj = js.Dynamic.literal()
    if (onbrush != null) __obj.updateDynamic("onbrush")(onbrush)
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show)
    if (size != null) __obj.updateDynamic("size")(size)
    __obj.asInstanceOf[SubchartOptions]
  }
}

