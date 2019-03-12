package typings
package baidumapDashWebDashSdkLib.BMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BusLine extends js.Object {
  var company: java.lang.String
  var endTime: java.lang.String
  var name: java.lang.String
  var startTime: java.lang.String
  def getBusStation(i: scala.Double): BusStation
  def getNumBusStations(): java.lang.String
  def getPath(): js.Array[Point]
  def getPolyline(): Polyline
}

object BusLine {
  @scala.inline
  def apply(
    company: java.lang.String,
    endTime: java.lang.String,
    getBusStation: scala.Double => BusStation,
    getNumBusStations: () => java.lang.String,
    getPath: () => js.Array[Point],
    getPolyline: () => Polyline,
    name: java.lang.String,
    startTime: java.lang.String
  ): BusLine = {
    val __obj = js.Dynamic.literal(company = company, endTime = endTime, getBusStation = js.Any.fromFunction1(getBusStation), getNumBusStations = js.Any.fromFunction0(getNumBusStations), getPath = js.Any.fromFunction0(getPath), getPolyline = js.Any.fromFunction0(getPolyline), name = name, startTime = startTime)
  
    __obj.asInstanceOf[BusLine]
  }
}

