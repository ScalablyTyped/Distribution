package typings.baidumapWebSdk.BMap

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrivingRouteOptions extends js.Object {
  var onInfoHtmlSet: js.UndefOr[js.Function2[/* poi */ LocalResultPoi, /* html */ HTMLElement, Unit]] = js.undefined
  var onMarkersSet: js.UndefOr[js.Function1[/* pois */ js.Array[LocalResultPoi], Unit]] = js.undefined
  var onPolylinesSet: js.UndefOr[js.Function1[/* routes */ js.Array[Route], Unit]] = js.undefined
  var onResultsHtmlSet: js.UndefOr[js.Function1[/* container */ HTMLElement, Unit]] = js.undefined
  var onSearchComplete: js.UndefOr[js.Function1[/* results */ DrivingRouteResult, Unit]] = js.undefined
  var policy: js.UndefOr[DrivingPolicy] = js.undefined
  var renderOptions: js.UndefOr[RenderOptions] = js.undefined
}

object DrivingRouteOptions {
  @scala.inline
  def apply(
    onInfoHtmlSet: (/* poi */ LocalResultPoi, /* html */ HTMLElement) => Unit = null,
    onMarkersSet: /* pois */ js.Array[LocalResultPoi] => Unit = null,
    onPolylinesSet: /* routes */ js.Array[Route] => Unit = null,
    onResultsHtmlSet: /* container */ HTMLElement => Unit = null,
    onSearchComplete: /* results */ DrivingRouteResult => Unit = null,
    policy: js.UndefOr[DrivingPolicy] = js.undefined,
    renderOptions: RenderOptions = null
  ): DrivingRouteOptions = {
    val __obj = js.Dynamic.literal()
    if (onInfoHtmlSet != null) __obj.updateDynamic("onInfoHtmlSet")(js.Any.fromFunction2(onInfoHtmlSet))
    if (onMarkersSet != null) __obj.updateDynamic("onMarkersSet")(js.Any.fromFunction1(onMarkersSet))
    if (onPolylinesSet != null) __obj.updateDynamic("onPolylinesSet")(js.Any.fromFunction1(onPolylinesSet))
    if (onResultsHtmlSet != null) __obj.updateDynamic("onResultsHtmlSet")(js.Any.fromFunction1(onResultsHtmlSet))
    if (onSearchComplete != null) __obj.updateDynamic("onSearchComplete")(js.Any.fromFunction1(onSearchComplete))
    if (!js.isUndefined(policy)) __obj.updateDynamic("policy")(policy.get.asInstanceOf[js.Any])
    if (renderOptions != null) __obj.updateDynamic("renderOptions")(renderOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrivingRouteOptions]
  }
}

