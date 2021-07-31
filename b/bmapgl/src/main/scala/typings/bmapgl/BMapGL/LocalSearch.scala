package typings.bmapgl.BMapGL

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocalSearch extends StObject {
  
  def clearResults(): Unit = js.native
  
  def disableAutoViewport(): Unit = js.native
  
  def disableFirstResultSelection(): Unit = js.native
  
  def enableAutoViewport(): Unit = js.native
  
  def enableFirstResultSelection(): Unit = js.native
  
  def getPageCapacity(): Double = js.native
  
  def getResults(): LocalResult | js.Array[LocalResult] = js.native
  
  def getStatus(): ServiceStatusCode = js.native
  
  def gotoPage(page: Double): Unit = js.native
  
  def search(keyword: String): Unit = js.native
  def search(keyword: String, option: LocalSearchSearchOptions): Unit = js.native
  def search(keyword: js.Array[String]): Unit = js.native
  def search(keyword: js.Array[String], option: LocalSearchSearchOptions): Unit = js.native
  
  def searchInBounds(keyword: String, bounds: Bounds): Unit = js.native
  def searchInBounds(keyword: String, bounds: Bounds, option: typings.bmapgl.anon.CustomData): Unit = js.native
  def searchInBounds(keyword: js.Array[String], bounds: Bounds): Unit = js.native
  def searchInBounds(keyword: js.Array[String], bounds: Bounds, option: typings.bmapgl.anon.CustomData): Unit = js.native
  
  def searchNearby(keyword: String, center: String, radius: Double): Unit = js.native
  def searchNearby(keyword: String, center: String, radius: Double, option: typings.bmapgl.anon.CustomData): Unit = js.native
  def searchNearby(keyword: String, center: LocalResultPoi, radius: Double): Unit = js.native
  def searchNearby(keyword: String, center: LocalResultPoi, radius: Double, option: typings.bmapgl.anon.CustomData): Unit = js.native
  def searchNearby(keyword: String, center: Point, radius: Double): Unit = js.native
  def searchNearby(keyword: String, center: Point, radius: Double, option: typings.bmapgl.anon.CustomData): Unit = js.native
  def searchNearby(keyword: js.Array[String], center: String, radius: Double): Unit = js.native
  def searchNearby(keyword: js.Array[String], center: String, radius: Double, option: typings.bmapgl.anon.CustomData): Unit = js.native
  def searchNearby(keyword: js.Array[String], center: LocalResultPoi, radius: Double): Unit = js.native
  def searchNearby(
    keyword: js.Array[String],
    center: LocalResultPoi,
    radius: Double,
    option: typings.bmapgl.anon.CustomData
  ): Unit = js.native
  def searchNearby(keyword: js.Array[String], center: Point, radius: Double): Unit = js.native
  def searchNearby(keyword: js.Array[String], center: Point, radius: Double, option: typings.bmapgl.anon.CustomData): Unit = js.native
  
  def setInfoHtmlSetCallback(callback: js.Function2[/* poi */ LocalResultPoi, /* html */ HTMLElement, Unit]): Unit = js.native
  
  def setLocation(location: String): Unit = js.native
  def setLocation(location: Map): Unit = js.native
  def setLocation(location: Point): Unit = js.native
  
  def setMarkersSetCallback(callback: js.Function1[/* pois */ js.Array[LocalResultPoi], Unit]): Unit = js.native
  
  def setPageCapacity(capacity: Double): Unit = js.native
  
  def setResultsHtmlSetCallback(callback: js.Function1[/* container */ HTMLElement, Unit]): Unit = js.native
  
  def setSearchCompleteCallback(callback: js.Function1[/* results */ LocalResult | js.Array[LocalResult], Unit]): Unit = js.native
}
