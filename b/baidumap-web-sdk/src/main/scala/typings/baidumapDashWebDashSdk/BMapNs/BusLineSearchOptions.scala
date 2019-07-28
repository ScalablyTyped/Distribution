package typings.baidumapDashWebDashSdk.BMapNs

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BusLineSearchOptions extends js.Object {
  var onBusLineHtmlSet: js.UndefOr[js.Function1[/* container */ HTMLElement, Unit]] = js.undefined
  var onBusListHtmlSet: js.UndefOr[js.Function1[/* container */ HTMLElement, Unit]] = js.undefined
  var onGetBusLineComplete: js.UndefOr[js.Function1[/* rs */ BusLine, Unit]] = js.undefined
  var onGetBusListComplete: js.UndefOr[js.Function1[/* rs */ BusListResult, Unit]] = js.undefined
  var onMarkersSet: js.UndefOr[js.Function1[/* sts */ js.Array[Marker], Unit]] = js.undefined
  var onPolylinesSet: js.UndefOr[js.Function1[/* ply */ Polyline, Unit]] = js.undefined
  var renderOptions: js.UndefOr[RenderOptions] = js.undefined
}

object BusLineSearchOptions {
  @scala.inline
  def apply(
    onBusLineHtmlSet: /* container */ HTMLElement => Unit = null,
    onBusListHtmlSet: /* container */ HTMLElement => Unit = null,
    onGetBusLineComplete: /* rs */ BusLine => Unit = null,
    onGetBusListComplete: /* rs */ BusListResult => Unit = null,
    onMarkersSet: /* sts */ js.Array[Marker] => Unit = null,
    onPolylinesSet: /* ply */ Polyline => Unit = null,
    renderOptions: RenderOptions = null
  ): BusLineSearchOptions = {
    val __obj = js.Dynamic.literal()
    if (onBusLineHtmlSet != null) __obj.updateDynamic("onBusLineHtmlSet")(js.Any.fromFunction1(onBusLineHtmlSet))
    if (onBusListHtmlSet != null) __obj.updateDynamic("onBusListHtmlSet")(js.Any.fromFunction1(onBusListHtmlSet))
    if (onGetBusLineComplete != null) __obj.updateDynamic("onGetBusLineComplete")(js.Any.fromFunction1(onGetBusLineComplete))
    if (onGetBusListComplete != null) __obj.updateDynamic("onGetBusListComplete")(js.Any.fromFunction1(onGetBusListComplete))
    if (onMarkersSet != null) __obj.updateDynamic("onMarkersSet")(js.Any.fromFunction1(onMarkersSet))
    if (onPolylinesSet != null) __obj.updateDynamic("onPolylinesSet")(js.Any.fromFunction1(onPolylinesSet))
    if (renderOptions != null) __obj.updateDynamic("renderOptions")(renderOptions)
    __obj.asInstanceOf[BusLineSearchOptions]
  }
}

