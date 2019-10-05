package typings.baidumapDashWebDashSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BMap.Geolocation")
@js.native
class Geolocation () extends js.Object {
  def getCurrentPosition(callback: js.Function1[/* result */ GeolocationResult, Unit]): Unit = js.native
  def getCurrentPosition(callback: js.Function1[/* result */ GeolocationResult, Unit], opts: PositionOptions): Unit = js.native
  def getStatus(): ServiceStatusCode = js.native
}

