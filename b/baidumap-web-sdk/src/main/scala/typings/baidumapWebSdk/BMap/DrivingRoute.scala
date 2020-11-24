package typings.baidumapWebSdk.BMap

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DrivingRoute extends js.Object {
  
  def clearResults(): Unit = js.native
  
  def disableAutoViewport(): Unit = js.native
  
  def enableAutoViewport(): Unit = js.native
  
  def getResults(): DrivingRouteResult = js.native
  
  def getStatus(): ServiceStatusCode = js.native
  
  def search(start: String, end: String): Unit = js.native
  def search(start: String, end: LocalResultPoi): Unit = js.native
  def search(start: String, end: Point): Unit = js.native
  def search(start: LocalResultPoi, end: String): Unit = js.native
  def search(start: LocalResultPoi, end: LocalResultPoi): Unit = js.native
  def search(start: LocalResultPoi, end: Point): Unit = js.native
  def search(start: Point, end: String): Unit = js.native
  def search(start: Point, end: LocalResultPoi): Unit = js.native
  def search(start: Point, end: Point): Unit = js.native
  
  def setInfoHtmlSetCallback(callback: js.Function2[/* poi */ LocalResultPoi, /* html */ HTMLElement, Unit]): Unit = js.native
  
  def setLocation(location: String): Unit = js.native
  def setLocation(location: Map): Unit = js.native
  def setLocation(location: Point): Unit = js.native
  
  def setMarkersSetCallback(callback: js.Function1[/* pois */ js.Array[LocalResultPoi], Unit]): Unit = js.native
  
  def setPolicy(policy: DrivingPolicy): Unit = js.native
  
  def setPolylinesSetCallback(callback: js.Function1[/* routes */ js.Array[Route], Unit]): Unit = js.native
  
  def setResultsHtmlSetCallback(callback: js.Function1[/* container */ HTMLElement, Unit]): Unit = js.native
  
  def setSearchCompleteCallback(callback: js.Function1[/* results */ DrivingRouteResult, Unit]): Unit = js.native
}
