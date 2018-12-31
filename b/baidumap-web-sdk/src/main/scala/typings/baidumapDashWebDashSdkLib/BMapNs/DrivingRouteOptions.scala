package typings
package baidumapDashWebDashSdkLib.BMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrivingRouteOptions extends js.Object {
  var onInfoHtmlSet: js.UndefOr[
    js.Function2[/* poi */ LocalResultPoi, /* html */ stdLib.HTMLElement, scala.Unit]
  ] = js.undefined
  var onMarkersSet: js.UndefOr[js.Function1[/* pois */ js.Array[LocalResultPoi], scala.Unit]] = js.undefined
  var onPolylinesSet: js.UndefOr[js.Function1[/* routes */ js.Array[Route], scala.Unit]] = js.undefined
  var onResultsHtmlSet: js.UndefOr[js.Function1[/* container */ stdLib.HTMLElement, scala.Unit]] = js.undefined
  var onSearchComplete: js.UndefOr[js.Function1[/* results */ DrivingRouteResult, scala.Unit]] = js.undefined
  var policy: js.UndefOr[DrivingPolicy] = js.undefined
  var renderOptions: js.UndefOr[RenderOptions] = js.undefined
}

