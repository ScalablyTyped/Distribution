package typings
package baidumapDashWebDashSdkLib.BMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BMap.PanoramaService")
@js.native
class PanoramaService () extends js.Object {
  def getPanoramaById(id: java.lang.String, callback: js.Function1[/* data */ PanoramaData, scala.Unit]): scala.Unit = js.native
  def getPanoramaByLocation(point: Point): scala.Unit = js.native
  def getPanoramaByLocation(point: Point, radius: scala.Double): scala.Unit = js.native
  def getPanoramaByLocation(point: Point, radius: scala.Double, callback: js.Function1[/* data */ PanoramaData, scala.Unit]): scala.Unit = js.native
}

