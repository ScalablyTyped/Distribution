package typings.c3.c3Mod

import typings.c3.Anon_HeightNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubchartOptions extends js.Object {
  /**
    * Set callback for brush event.
    * Specified function receives the current zoomed x domain.
    */
  var onbrush: js.UndefOr[js.Function1[/* domain */ js.Any, Unit]] = js.undefined
  /**
    * Show sub chart on the bottom of the chart.
    */
  var show: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[Anon_HeightNumber] = js.undefined
}

object SubchartOptions {
  @scala.inline
  def apply(
    onbrush: /* domain */ js.Any => Unit = null,
    show: js.UndefOr[Boolean] = js.undefined,
    size: Anon_HeightNumber = null
  ): SubchartOptions = {
    val __obj = js.Dynamic.literal()
    if (onbrush != null) __obj.updateDynamic("onbrush")(js.Any.fromFunction1(onbrush))
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show)
    if (size != null) __obj.updateDynamic("size")(size)
    __obj.asInstanceOf[SubchartOptions]
  }
}

