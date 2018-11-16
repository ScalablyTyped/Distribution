package typings
package baidumapDashWebDashSdkLib.BMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransitRoutePlan extends js.Object {
  def getDescription(includeHtml: scala.Boolean): java.lang.String = js.native
  def getDistance(): java.lang.String | scala.Double = js.native
  def getDistance(format: scala.Boolean): java.lang.String | scala.Double = js.native
  def getDuration(): java.lang.String | scala.Double = js.native
  def getDuration(format: scala.Boolean): java.lang.String | scala.Double = js.native
  def getLine(i: scala.Double): Line = js.native
  def getNumLines(): scala.Double = js.native
  def getNumRoutes(): scala.Double = js.native
  def getRoute(i: scala.Double): Route = js.native
}

