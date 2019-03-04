package typings
package baidumapDashWebDashSdkLib.BMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WalkingRouteResult extends js.Object {
  var city: java.lang.String
  def getEnd(): LocalResultPoi
  def getNumPlans(): scala.Double
  def getPlan(i: scala.Double): RoutePlan
  def getStart(): LocalResultPoi
}

object WalkingRouteResult {
  @scala.inline
  def apply(
    city: java.lang.String,
    getEnd: js.Function0[LocalResultPoi],
    getNumPlans: js.Function0[scala.Double],
    getPlan: js.Function1[scala.Double, RoutePlan],
    getStart: js.Function0[LocalResultPoi]
  ): WalkingRouteResult = {
    val __obj = js.Dynamic.literal(city = city, getEnd = getEnd, getNumPlans = getNumPlans, getPlan = getPlan, getStart = getStart)
  
    __obj.asInstanceOf[WalkingRouteResult]
  }
}

