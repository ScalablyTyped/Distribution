package typings.baidumapWebSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BMap.PanoramaService")
@js.native
class PanoramaService () extends js.Object {
  def getPanoramaById(id: String, callback: js.Function1[/* data */ PanoramaData, Unit]): Unit = js.native
  def getPanoramaByLocation(point: Point): Unit = js.native
  def getPanoramaByLocation(point: Point, radius: Double): Unit = js.native
  def getPanoramaByLocation(point: Point, radius: Double, callback: js.Function1[/* data */ PanoramaData, Unit]): Unit = js.native
}

