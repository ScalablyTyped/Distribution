package typings.baidumapDashWebDashSdk.BMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BusLine extends js.Object {
  var company: String
  var endTime: String
  var name: String
  var startTime: String
  def getBusStation(i: Double): BusStation
  def getNumBusStations(): String
  def getPath(): js.Array[Point]
  def getPolyline(): Polyline
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
    val __obj = js.Dynamic.literal(company = company, endTime = endTime, getBusStation = js.Any.fromFunction1(getBusStation), getNumBusStations = js.Any.fromFunction0(getNumBusStations), getPath = js.Any.fromFunction0(getPath), getPolyline = js.Any.fromFunction0(getPolyline), name = name, startTime = startTime)
  
    __obj.asInstanceOf[BusLine]
  }
}

