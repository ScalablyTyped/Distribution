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

