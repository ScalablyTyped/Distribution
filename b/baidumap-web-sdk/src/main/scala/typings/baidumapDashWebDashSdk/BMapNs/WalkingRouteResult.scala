package typings.baidumapDashWebDashSdk.BMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WalkingRouteResult extends js.Object {
  var city: String
  def getEnd(): LocalResultPoi
  def getNumPlans(): Double
  def getPlan(i: Double): RoutePlan
  def getStart(): LocalResultPoi
}

object WalkingRouteResult {
  @scala.inline
  def apply(
    city: String,
    getEnd: () => LocalResultPoi,
    getNumPlans: () => Double,
    getPlan: Double => RoutePlan,
    getStart: () => LocalResultPoi
  ): WalkingRouteResult = {
    val __obj = js.Dynamic.literal(city = city, getEnd = js.Any.fromFunction0(getEnd), getNumPlans = js.Any.fromFunction0(getNumPlans), getPlan = js.Any.fromFunction1(getPlan), getStart = js.Any.fromFunction0(getStart))
  
    __obj.asInstanceOf[WalkingRouteResult]
  }
}

