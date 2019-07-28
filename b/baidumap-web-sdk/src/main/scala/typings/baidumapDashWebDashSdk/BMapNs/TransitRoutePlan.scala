package typings.baidumapDashWebDashSdk.BMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransitRoutePlan extends js.Object {
  def getDescription(includeHtml: Boolean): String = js.native
  def getDistance(): String | Double = js.native
  def getDistance(format: Boolean): String | Double = js.native
  def getDuration(): String | Double = js.native
  def getDuration(format: Boolean): String | Double = js.native
  def getLine(i: Double): Line = js.native
  def getNumLines(): Double = js.native
  def getNumRoutes(): Double = js.native
  def getRoute(i: Double): Route = js.native
}

