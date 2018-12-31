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

