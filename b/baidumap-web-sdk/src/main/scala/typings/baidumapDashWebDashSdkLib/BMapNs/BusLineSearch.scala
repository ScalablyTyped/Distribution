package typings
package baidumapDashWebDashSdkLib.BMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BMap.BusLineSearch")
@js.native
class BusLineSearch protected () extends js.Object {
  def this(location: Map) = this()
  def this(location: Point) = this()
  def this(location: java.lang.String) = this()
  def this(location: Map, opts: BusLineSearchOptions) = this()
  def this(location: Point, opts: BusLineSearchOptions) = this()
  def this(location: java.lang.String, opts: BusLineSearchOptions) = this()
  def clearResults(): scala.Unit = js.native
  def disableAutoViewport(): scala.Unit = js.native
  def enableAutoViewport(): scala.Unit = js.native
  def getBusLine(busLstItem: BusListItem): scala.Unit = js.native
  def getBusList(keyword: java.lang.String): scala.Unit = js.native
  def getStatus(): ServiceStatusCode = js.native
  def setBusLineHtmlSetCallback(callback: js.Function1[/* container */ stdLib.HTMLElement, scala.Unit]): scala.Unit = js.native
  def setBusListHtmlSetCallback(callback: js.Function1[/* container */ stdLib.HTMLElement, scala.Unit]): scala.Unit = js.native
  def setGetBusLineCompleteCallback(callback: js.Function1[/* rs */ BusLine, scala.Unit]): scala.Unit = js.native
  def setGetBusListCompleteCallback(callback: js.Function1[/* rs */ BusListResult, scala.Unit]): scala.Unit = js.native
  def setLocation(location: Map): scala.Unit = js.native
  def setLocation(location: Point): scala.Unit = js.native
  def setLocation(location: java.lang.String): scala.Unit = js.native
  def setMarkersSetCallback(callback: js.Function1[/* markers */ js.Array[Marker], scala.Unit]): scala.Unit = js.native
  def setPolylinesSetCallback(callback: js.Function1[/* ply */ Polyline, scala.Unit]): scala.Unit = js.native
}

