package typings.baidumapWebSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BusLine extends js.Object {
  var company: String = js.native
  var endTime: String = js.native
  var name: String = js.native
  var startTime: String = js.native
  def getBusStation(i: Double): BusStation = js.native
  def getNumBusStations(): String = js.native
  def getPath(): js.Array[Point] = js.native
  def getPolyline(): Polyline = js.native
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
  implicit class BusLineOps[Self <: BusLine] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCompany(value: String): Self = this.set("company", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndTime(value: String): Self = this.set("endTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetBusStation(value: Double => BusStation): Self = this.set("getBusStation", js.Any.fromFunction1(value))
    @scala.inline
    def setGetNumBusStations(value: () => String): Self = this.set("getNumBusStations", js.Any.fromFunction0(value))
    @scala.inline
    def setGetPath(value: () => js.Array[Point]): Self = this.set("getPath", js.Any.fromFunction0(value))
    @scala.inline
    def setGetPolyline(value: () => Polyline): Self = this.set("getPolyline", js.Any.fromFunction0(value))
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartTime(value: String): Self = this.set("startTime", value.asInstanceOf[js.Any])
  }
  
}

