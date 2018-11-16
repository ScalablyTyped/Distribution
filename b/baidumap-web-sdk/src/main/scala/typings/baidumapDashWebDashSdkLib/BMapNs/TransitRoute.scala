package typings
package baidumapDashWebDashSdkLib.BMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BMap.TransitRoute")
@js.native
class TransitRoute protected () extends js.Object {
  def this(location: Map) = this()
  def this(location: Point) = this()
  def this(location: java.lang.String) = this()
  def this(location: Map, opts: TransitRouteOptions) = this()
  def this(location: Point, opts: TransitRouteOptions) = this()
  def this(location: java.lang.String, opts: TransitRouteOptions) = this()
  def clearResults(): scala.Unit = js.native
  def disableAutoViewport(): scala.Unit = js.native
  def enableAutoViewport(): scala.Unit = js.native
  def getResults(): TransitRouteResult = js.native
  def getStatus(): ServiceStatusCode = js.native
  def search(start: LocalResultPoi, end: LocalResultPoi): scala.Unit = js.native
  def search(start: LocalResultPoi, end: Point): scala.Unit = js.native
  def search(start: LocalResultPoi, end: java.lang.String): scala.Unit = js.native
  def search(start: Point, end: LocalResultPoi): scala.Unit = js.native
  def search(start: Point, end: Point): scala.Unit = js.native
  def search(start: Point, end: java.lang.String): scala.Unit = js.native
  def search(start: java.lang.String, end: LocalResultPoi): scala.Unit = js.native
  def search(start: java.lang.String, end: Point): scala.Unit = js.native
  def search(start: java.lang.String, end: java.lang.String): scala.Unit = js.native
  def setInfoHtmlSetCallback(callback: js.Function2[/* poi */ LocalResultPoi, /* html */ stdLib.HTMLElement, scala.Unit]): scala.Unit = js.native
  def setLocation(location: Map): scala.Unit = js.native
  def setLocation(location: Point): scala.Unit = js.native
  def setLocation(location: java.lang.String): scala.Unit = js.native
  def setMarkersSetCallback(callback: js.Function1[/* pois */ js.Array[LocalResultPoi], scala.Unit]): scala.Unit = js.native
  def setPageCapacity(capacity: scala.Double): scala.Unit = js.native
  def setPolicy(policy: TransitPolicy): scala.Unit = js.native
  def setPolylinesSetCallback(callback: js.Function2[/* lines */ js.Array[Line], /* routes */ js.Array[Route], scala.Unit]): scala.Unit = js.native
  def setResultsHtmlSetCallback(callback: js.Function1[/* container */ stdLib.HTMLElement, scala.Unit]): scala.Unit = js.native
  def setSearchCompleteCallback(callback: js.Function1[/* results */ TransitRouteResult, scala.Unit]): scala.Unit = js.native
}

