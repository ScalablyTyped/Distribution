package typings
package baidumapDashWebDashSdkLib.BMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Route extends js.Object {
  def getDistance(): java.lang.String | scala.Double = js.native
  def getDistance(format: scala.Boolean): java.lang.String | scala.Double = js.native
  def getIndex(): scala.Double = js.native
  def getNumRoutes(): scala.Double = js.native
  def getPath(): js.Array[Point] = js.native
  def getPoints(): js.Array[Point] = js.native
  def getPolyline(): Polyline = js.native
  def getRouteType(): RouteType = js.native
  def getStep(i: scala.Double): Step = js.native
}

