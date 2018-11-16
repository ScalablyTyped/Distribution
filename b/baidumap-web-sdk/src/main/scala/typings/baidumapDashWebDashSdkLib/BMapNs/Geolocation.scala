package typings
package baidumapDashWebDashSdkLib.BMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BMap.Geolocation")
@js.native
class Geolocation () extends js.Object {
  def getCurrentPosition(callback: js.Function1[/* result */ GeolocationResult, scala.Unit]): scala.Unit = js.native
  def getCurrentPosition(callback: js.Function1[/* result */ GeolocationResult, scala.Unit], opts: PositionOptions): scala.Unit = js.native
  def getStatus(): ServiceStatusCode = js.native
}

