package typings.baidumapDashWebDashSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoutePlan extends js.Object {
  def getDistance(): String | Double = js.native
  def getDistance(format: Boolean): String | Double = js.native
  def getDragPois(): js.Array[LocalResultPoi] = js.native
  def getDuration(): String | Double = js.native
  def getDuration(format: Boolean): String | Double = js.native
  def getNumRoutes(): Double = js.native
  def getRoute(i: Double): Route = js.native
}

