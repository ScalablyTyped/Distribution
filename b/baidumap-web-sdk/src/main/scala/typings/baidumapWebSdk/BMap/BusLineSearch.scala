package typings.baidumapWebSdk.BMap

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BusLineSearch extends StObject {
  
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
