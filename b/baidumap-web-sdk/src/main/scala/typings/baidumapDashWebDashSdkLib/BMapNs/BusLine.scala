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
    getBusStation: js.Function1[scala.Double, BusStation],
    getNumBusStations: js.Function0[java.lang.String],
    getPath: js.Function0[js.Array[Point]],
    getPolyline: js.Function0[Polyline],
    name: java.lang.String,
    startTime: java.lang.String
  ): BusLine = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("company")(company)
    __obj.updateDynamic("endTime")(endTime)
    __obj.updateDynamic("getBusStation")(getBusStation)
    __obj.updateDynamic("getNumBusStations")(getNumBusStations)
    __obj.updateDynamic("getPath")(getPath)
    __obj.updateDynamic("getPolyline")(getPolyline)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("startTime")(startTime)
    __obj.asInstanceOf[BusLine]
  }
}

