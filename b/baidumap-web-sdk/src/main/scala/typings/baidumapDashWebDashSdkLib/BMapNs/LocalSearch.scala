package typings
package baidumapDashWebDashSdkLib.BMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BMap.LocalSearch")
@js.native
class LocalSearch protected () extends js.Object {
  def this(location: Map) = this()
  def this(location: Point) = this()
  def this(location: java.lang.String) = this()
  def this(location: Map, opts: LocalSearchOptions) = this()
  def this(location: Point, opts: LocalSearchOptions) = this()
  def this(location: java.lang.String, opts: LocalSearchOptions) = this()
  def clearResults(): scala.Unit = js.native
  def disableAutoViewport(): scala.Unit = js.native
  def disableFirstResultSelection(): scala.Unit = js.native
  def enableAutoViewport(): scala.Unit = js.native
  def enableFirstResultSelection(): scala.Unit = js.native
  def getPageCapacity(): scala.Double = js.native
  def getResults(): LocalResult | js.Array[LocalResult] = js.native
  def getStatus(): ServiceStatusCode = js.native
  def gotoPage(page: scala.Double): scala.Unit = js.native
  def search(keyword: java.lang.String): scala.Unit = js.native
  def search(keyword: java.lang.String, option: LocalSearchSearchOptions): scala.Unit = js.native
  def search(keyword: js.Array[java.lang.String]): scala.Unit = js.native
  def search(keyword: js.Array[java.lang.String], option: LocalSearchSearchOptions): scala.Unit = js.native
  def searchInBounds(keyword: java.lang.String, bounds: Bounds): scala.Unit = js.native
  def searchInBounds(keyword: java.lang.String, bounds: Bounds, option: baidumapDashWebDashSdkLib.Anon_CustomData): scala.Unit = js.native
  def searchInBounds(keyword: js.Array[java.lang.String], bounds: Bounds): scala.Unit = js.native
  def searchInBounds(
    keyword: js.Array[java.lang.String],
    bounds: Bounds,
    option: baidumapDashWebDashSdkLib.Anon_CustomData
  ): scala.Unit = js.native
  def searchNearby(keyword: java.lang.String, center: LocalResultPoi, radius: scala.Double): scala.Unit = js.native
  def searchNearby(
    keyword: java.lang.String,
    center: LocalResultPoi,
    radius: scala.Double,
    option: baidumapDashWebDashSdkLib.Anon_CustomData
  ): scala.Unit = js.native
  def searchNearby(keyword: java.lang.String, center: Point, radius: scala.Double): scala.Unit = js.native
  def searchNearby(
    keyword: java.lang.String,
    center: Point,
    radius: scala.Double,
    option: baidumapDashWebDashSdkLib.Anon_CustomData
  ): scala.Unit = js.native
  def searchNearby(keyword: java.lang.String, center: java.lang.String, radius: scala.Double): scala.Unit = js.native
  def searchNearby(
    keyword: java.lang.String,
    center: java.lang.String,
    radius: scala.Double,
    option: baidumapDashWebDashSdkLib.Anon_CustomData
  ): scala.Unit = js.native
  def searchNearby(keyword: js.Array[java.lang.String], center: LocalResultPoi, radius: scala.Double): scala.Unit = js.native
  def searchNearby(
    keyword: js.Array[java.lang.String],
    center: LocalResultPoi,
    radius: scala.Double,
    option: baidumapDashWebDashSdkLib.Anon_CustomData
  ): scala.Unit = js.native
  def searchNearby(keyword: js.Array[java.lang.String], center: Point, radius: scala.Double): scala.Unit = js.native
  def searchNearby(
    keyword: js.Array[java.lang.String],
    center: Point,
    radius: scala.Double,
    option: baidumapDashWebDashSdkLib.Anon_CustomData
  ): scala.Unit = js.native
  def searchNearby(keyword: js.Array[java.lang.String], center: java.lang.String, radius: scala.Double): scala.Unit = js.native
  def searchNearby(
    keyword: js.Array[java.lang.String],
    center: java.lang.String,
    radius: scala.Double,
    option: baidumapDashWebDashSdkLib.Anon_CustomData
  ): scala.Unit = js.native
  def setInfoHtmlSetCallback(callback: js.Function2[/* poi */ LocalResultPoi, /* html */ stdLib.HTMLElement, scala.Unit]): scala.Unit = js.native
  def setLocation(location: Map): scala.Unit = js.native
  def setLocation(location: Point): scala.Unit = js.native
  def setLocation(location: java.lang.String): scala.Unit = js.native
  def setMarkersSetCallback(callback: js.Function1[/* pois */ js.Array[LocalResultPoi], scala.Unit]): scala.Unit = js.native
  def setPageCapacity(capacity: scala.Double): scala.Unit = js.native
  def setResultsHtmlSetCallback(callback: js.Function1[/* container */ stdLib.HTMLElement, scala.Unit]): scala.Unit = js.native
  def setSearchCompleteCallback(callback: js.Function1[/* results */ LocalResult | js.Array[LocalResult], scala.Unit]): scala.Unit = js.native
}

