package typings.baidumapWebSdk.BMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BusLine extends StObject {
  
  var company: String
  
  var endTime: String
  
  def getBusStation(i: Double): BusStation
  
  def getNumBusStations(): String
  
  def getPath(): js.Array[Point]
  
  def getPolyline(): Polyline
  
  var name: String
  
  var startTime: String
}
object BusLine {
  
  @scala.inline
  def apply(
    company: String,
    endTime: String,
    getBusStation: Double => BusStation,
    getNumBusStations: () => String,
    getPath: () => js.Array[Point],
    getPolyline: () => Polyline,
    name: String,
    startTime: String
  ): BusLine = {
    val __obj = js.Dynamic.literal(company = company.asInstanceOf[js.Any], endTime = endTime.asInstanceOf[js.Any], getBusStation = js.Any.fromFunction1(getBusStation), getNumBusStations = js.Any.fromFunction0(getNumBusStations), getPath = js.Any.fromFunction0(getPath), getPolyline = js.Any.fromFunction0(getPolyline), name = name.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[BusLine]
  }
  
  @scala.inline
  implicit class BusLineMutableBuilder[Self <: BusLine] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompany(value: String): Self = StObject.set(x, "company", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetBusStation(value: Double => BusStation): Self = StObject.set(x, "getBusStation", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetNumBusStations(value: () => String): Self = StObject.set(x, "getNumBusStations", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPath(value: () => js.Array[Point]): Self = StObject.set(x, "getPath", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPolyline(value: () => Polyline): Self = StObject.set(x, "getPolyline", js.Any.fromFunction0(value))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
  }
}
