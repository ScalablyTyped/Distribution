package typings
package baidumapDashWebDashSdkLib.BMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BusLineSearchOptions extends js.Object {
  var onBusLineHtmlSet: js.UndefOr[js.Function1[/* container */ stdLib.HTMLElement, scala.Unit]] = js.undefined
  var onBusListHtmlSet: js.UndefOr[js.Function1[/* container */ stdLib.HTMLElement, scala.Unit]] = js.undefined
  var onGetBusLineComplete: js.UndefOr[js.Function1[/* rs */ BusLine, scala.Unit]] = js.undefined
  var onGetBusListComplete: js.UndefOr[js.Function1[/* rs */ BusListResult, scala.Unit]] = js.undefined
  var onMarkersSet: js.UndefOr[js.Function1[/* sts */ js.Array[Marker], scala.Unit]] = js.undefined
  var onPolylinesSet: js.UndefOr[js.Function1[/* ply */ Polyline, scala.Unit]] = js.undefined
  var renderOptions: js.UndefOr[RenderOptions] = js.undefined
}

object BusLineSearchOptions {
  @scala.inline
  def apply(
    onBusLineHtmlSet: js.Function1[/* container */ stdLib.HTMLElement, scala.Unit] = null,
    onBusListHtmlSet: js.Function1[/* container */ stdLib.HTMLElement, scala.Unit] = null,
    onGetBusLineComplete: js.Function1[/* rs */ BusLine, scala.Unit] = null,
    onGetBusListComplete: js.Function1[/* rs */ BusListResult, scala.Unit] = null,
    onMarkersSet: js.Function1[/* sts */ js.Array[Marker], scala.Unit] = null,
    onPolylinesSet: js.Function1[/* ply */ Polyline, scala.Unit] = null,
    renderOptions: RenderOptions = null
  ): BusLineSearchOptions = {
    val __obj = js.Dynamic.literal()
    if (onBusLineHtmlSet != null) __obj.updateDynamic("onBusLineHtmlSet")(onBusLineHtmlSet)
    if (onBusListHtmlSet != null) __obj.updateDynamic("onBusListHtmlSet")(onBusListHtmlSet)
    if (onGetBusLineComplete != null) __obj.updateDynamic("onGetBusLineComplete")(onGetBusLineComplete)
    if (onGetBusListComplete != null) __obj.updateDynamic("onGetBusListComplete")(onGetBusListComplete)
    if (onMarkersSet != null) __obj.updateDynamic("onMarkersSet")(onMarkersSet)
    if (onPolylinesSet != null) __obj.updateDynamic("onPolylinesSet")(onPolylinesSet)
    if (renderOptions != null) __obj.updateDynamic("renderOptions")(renderOptions)
    __obj.asInstanceOf[BusLineSearchOptions]
  }
}

