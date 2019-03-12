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
    getEnd: () => LocalResultPoi,
    getNumPlans: () => scala.Double,
    getPlan: scala.Double => RoutePlan,
    getStart: () => LocalResultPoi
  ): WalkingRouteResult = {
    val __obj = js.Dynamic.literal(city = city, getEnd = js.Any.fromFunction0(getEnd), getNumPlans = js.Any.fromFunction0(getNumPlans), getPlan = js.Any.fromFunction1(getPlan), getStart = js.Any.fromFunction0(getStart))
  
    __obj.asInstanceOf[WalkingRouteResult]
  }
}

