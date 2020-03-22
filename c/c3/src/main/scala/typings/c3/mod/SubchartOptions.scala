package typings.c3.mod

import typings.c3.AnonHeightNumber
import typings.c3.AnonXAnonShowBoolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubchartOptions extends js.Object {
  var axis: js.UndefOr[AnonXAnonShowBoolean] = js.undefined
  /**
    * Set callback for brush event.
    * Specified function receives the current zoomed x domain.
    */
  var onbrush: js.UndefOr[js.ThisFunction1[/* this */ ChartAPI, /* domain */ Domain, Unit]] = js.undefined
  /**
    * Show sub chart on the bottom of the chart.
    * Defaults to `false`.
    */
  var show: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[AnonHeightNumber] = js.undefined
}

object SubchartOptions {
  @scala.inline
  def apply(
    axis: AnonXAnonShowBoolean = null,
    onbrush: js.ThisFunction1[/* this */ ChartAPI, /* domain */ Domain, Unit] = null,
    show: js.UndefOr[Boolean] = js.undefined,
    size: AnonHeightNumber = null
  ): SubchartOptions = {
    val __obj = js.Dynamic.literal()
    if (axis != null) __obj.updateDynamic("axis")(axis.asInstanceOf[js.Any])
    if (onbrush != null) __obj.updateDynamic("onbrush")(onbrush.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubchartOptions]
  }
}

