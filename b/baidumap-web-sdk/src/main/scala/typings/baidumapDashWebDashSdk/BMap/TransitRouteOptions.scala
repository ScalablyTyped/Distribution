package typings.baidumapDashWebDashSdk.BMap

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitRouteOptions extends js.Object {
  var onInfoHtmlSet: js.UndefOr[js.Function2[/* poi */ LocalResultPoi, /* html */ HTMLElement, Unit]] = js.undefined
  var onMarkersSet: js.UndefOr[
    js.Function2[/* pois */ js.Array[LocalResultPoi], /* transfers */ js.Array[LocalResultPoi], Unit]
  ] = js.undefined
  var onPolylinesSet: js.UndefOr[js.Function1[/* lines */ js.Array[Line], Unit]] = js.undefined
  var onResultsHtmlSet: js.UndefOr[js.Function1[/* container */ HTMLElement, Unit]] = js.undefined
  var onSearchComplete: js.UndefOr[js.Function1[/* result */ TransitRouteResult, Unit]] = js.undefined
  var pageCapacity: js.UndefOr[Double] = js.undefined
  var policy: js.UndefOr[TransitPolicy] = js.undefined
  var renderOptions: js.UndefOr[RenderOptions] = js.undefined
}

object TransitRouteOptions {
  @scala.inline
  def apply(
    onInfoHtmlSet: (/* poi */ LocalResultPoi, /* html */ HTMLElement) => Unit = null,
    onMarkersSet: (/* pois */ js.Array[LocalResultPoi], /* transfers */ js.Array[LocalResultPoi]) => Unit = null,
    onPolylinesSet: /* lines */ js.Array[Line] => Unit = null,
    onResultsHtmlSet: /* container */ HTMLElement => Unit = null,
    onSearchComplete: /* result */ TransitRouteResult => Unit = null,
    pageCapacity: Int | Double = null,
    policy: Int | Double = null,
    renderOptions: RenderOptions = null
  ): TransitRouteOptions = {
    val __obj = js.Dynamic.literal()
    if (onInfoHtmlSet != null) __obj.updateDynamic("onInfoHtmlSet")(js.Any.fromFunction2(onInfoHtmlSet))
    if (onMarkersSet != null) __obj.updateDynamic("onMarkersSet")(js.Any.fromFunction2(onMarkersSet))
    if (onPolylinesSet != null) __obj.updateDynamic("onPolylinesSet")(js.Any.fromFunction1(onPolylinesSet))
    if (onResultsHtmlSet != null) __obj.updateDynamic("onResultsHtmlSet")(js.Any.fromFunction1(onResultsHtmlSet))
    if (onSearchComplete != null) __obj.updateDynamic("onSearchComplete")(js.Any.fromFunction1(onSearchComplete))
    if (pageCapacity != null) __obj.updateDynamic("pageCapacity")(pageCapacity.asInstanceOf[js.Any])
    if (policy != null) __obj.updateDynamic("policy")(policy.asInstanceOf[js.Any])
    if (renderOptions != null) __obj.updateDynamic("renderOptions")(renderOptions)
    __obj.asInstanceOf[TransitRouteOptions]
  }
}

