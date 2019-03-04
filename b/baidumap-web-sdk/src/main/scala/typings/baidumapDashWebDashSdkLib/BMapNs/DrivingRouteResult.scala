package typings
package baidumapDashWebDashSdkLib.BMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrivingRouteResult extends js.Object {
  var city: java.lang.String
  var moreResultsUrl: java.lang.String
  var policy: DrivingPolicy
  var taxiFare: TaxiFare
  def getEnd(): LocalResultPoi
  def getNumPlans(): scala.Double
  def getPlan(i: scala.Double): RoutePlan
  def getStart(): LocalResultPoi
}

object DrivingRouteResult {
  @scala.inline
  def apply(
    city: java.lang.String,
    getEnd: js.Function0[LocalResultPoi],
    getNumPlans: js.Function0[scala.Double],
    getPlan: js.Function1[scala.Double, RoutePlan],
    getStart: js.Function0[LocalResultPoi],
    moreResultsUrl: java.lang.String,
    policy: DrivingPolicy,
    taxiFare: TaxiFare
  ): DrivingRouteResult = {
    val __obj = js.Dynamic.literal(city = city, getEnd = getEnd, getNumPlans = getNumPlans, getPlan = getPlan, getStart = getStart, moreResultsUrl = moreResultsUrl, policy = policy, taxiFare = taxiFare)
  
    __obj.asInstanceOf[DrivingRouteResult]
  }
}

