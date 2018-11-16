package typings
package baidumapDashWebDashSdkLib.BMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Line extends js.Object {
  var title: java.lang.String = js.native
  var `type`: LineType = js.native
  def getDistance(): java.lang.String | scala.Double = js.native
  def getDistance(format: scala.Boolean): java.lang.String | scala.Double = js.native
  def getGetOffStop(): LocalResultPoi = js.native
  def getGetOnStop(): LocalResultPoi = js.native
  def getNumViaStops(): scala.Double = js.native
  def getPath(): js.Array[Point] = js.native
  def getPoints(): js.Array[Point] = js.native
  def getPolyline(): Polyline = js.native
}

