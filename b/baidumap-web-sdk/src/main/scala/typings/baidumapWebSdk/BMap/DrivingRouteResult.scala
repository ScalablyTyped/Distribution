package typings.baidumapWebSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrivingRouteResult extends js.Object {
  var city: String
  var moreResultsUrl: String
  var policy: DrivingPolicy
  var taxiFare: TaxiFare
  def getEnd(): LocalResultPoi
  def getNumPlans(): Double
  def getPlan(i: Double): RoutePlan
  def getStart(): LocalResultPoi
}

object DrivingRouteResult {
  @scala.inline
  def apply(
    city: String,
    getEnd: () => LocalResultPoi,
    getNumPlans: () => Double,
    getPlan: Double => RoutePlan,
    getStart: () => LocalResultPoi,
    moreResultsUrl: String,
    policy: DrivingPolicy,
    taxiFare: TaxiFare
  ): DrivingRouteResult = {
    val __obj = js.Dynamic.literal(city = city.asInstanceOf[js.Any], getEnd = js.Any.fromFunction0(getEnd), getNumPlans = js.Any.fromFunction0(getNumPlans), getPlan = js.Any.fromFunction1(getPlan), getStart = js.Any.fromFunction0(getStart), moreResultsUrl = moreResultsUrl.asInstanceOf[js.Any], policy = policy.asInstanceOf[js.Any], taxiFare = taxiFare.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DrivingRouteResult]
  }
}

