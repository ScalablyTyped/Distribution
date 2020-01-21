package typings.baidumapWebSdk.BMap

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BMap.BusLineSearch")
@js.native
class BusLineSearch protected () extends js.Object {
  def this(location: String) = this()
  def this(location: Map) = this()
  def this(location: Point) = this()
  def this(location: String, opts: BusLineSearchOptions) = this()
  def this(location: Map, opts: BusLineSearchOptions) = this()
  def this(location: Point, opts: BusLineSearchOptions) = this()
  def clearResults(): Unit = js.native
  def disableAutoViewport(): Unit = js.native
  def enableAutoViewport(): Unit = js.native
  def getBusLine(busLstItem: BusListItem): Unit = js.native
  def getBusList(keyword: String): Unit = js.native
  def getStatus(): ServiceStatusCode = js.native
  def setBusLineHtmlSetCallback(callback: js.Function1[/* container */ HTMLElement, Unit]): Unit = js.native
  def setBusListHtmlSetCallback(callback: js.Function1[/* container */ HTMLElement, Unit]): Unit = js.native
  def setGetBusLineCompleteCallback(callback: js.Function1[/* rs */ BusLine, Unit]): Unit = js.native
  def setGetBusListCompleteCallback(callback: js.Function1[/* rs */ BusListResult, Unit]): Unit = js.native
  def setLocation(location: String): Unit = js.native
  def setLocation(location: Map): Unit = js.native
  def setLocation(location: Point): Unit = js.native
  def setMarkersSetCallback(callback: js.Function1[/* markers */ js.Array[Marker], Unit]): Unit = js.native
  def setPolylinesSetCallback(callback: js.Function1[/* ply */ Polyline, Unit]): Unit = js.native
}

