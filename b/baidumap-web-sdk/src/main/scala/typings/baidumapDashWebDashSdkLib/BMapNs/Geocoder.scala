package typings
package baidumapDashWebDashSdkLib.BMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BMap.Geocoder")
@js.native
class Geocoder () extends js.Object {
  def getLocation(point: Point, callback: js.Function1[/* result */ GeocoderResult, scala.Unit]): scala.Unit = js.native
  def getLocation(
    point: Point,
    callback: js.Function1[/* result */ GeocoderResult, scala.Unit],
    opts: LocationOptions
  ): scala.Unit = js.native
  def getPoint(
    address: java.lang.String,
    callback: js.Function1[/* point */ Point, scala.Unit],
    city: java.lang.String
  ): scala.Unit = js.native
}

