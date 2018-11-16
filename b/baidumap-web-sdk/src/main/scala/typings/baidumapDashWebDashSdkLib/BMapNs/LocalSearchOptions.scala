package typings
package baidumapDashWebDashSdkLib.BMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait LocalSearchOptions extends js.Object {
  var onInfoHtmlSet: js.UndefOr[
    js.Function2[/* poi */ LocalResultPoi, /* html */ stdLib.HTMLElement, scala.Unit]
  ] = js.undefined
  var onMarkersSet: js.UndefOr[js.Function1[/* pois */ js.Array[LocalResultPoi], scala.Unit]] = js.undefined
  var onResultsHtmlSet: js.UndefOr[js.Function1[/* container */ stdLib.HTMLElement, scala.Unit]] = js.undefined
  var onSearchComplete: js.UndefOr[js.Function1[/* results */ js.Array[LocalResult], scala.Unit]] = js.undefined
  var pageCapacity: js.UndefOr[scala.Double] = js.undefined
  var renderOptions: js.UndefOr[RenderOptions] = js.undefined
}

