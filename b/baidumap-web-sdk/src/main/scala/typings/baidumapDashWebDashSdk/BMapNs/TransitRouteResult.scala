package typings.baidumapDashWebDashSdk.BMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitRouteResult extends js.Object {
  var city: String
  var moreResultsUrl: String
  var policy: TransitPolicy
  def getEnd(): LocalResultPoi
  def getNumPlans(): Double
  def getPlan(i: Double): TransitRoutePlan
  def getStart(): LocalResultPoi
}

object TransitRouteResult {
  @scala.inline
  def apply(
    city: String,
    getEnd: () => LocalResultPoi,
    getNumPlans: () => Double,
    getPlan: Double => TransitRoutePlan,
    getStart: () => LocalResultPoi,
    moreResultsUrl: String,
    policy: TransitPolicy
  ): TransitRouteResult = {
    val __obj = js.Dynamic.literal(city = city, getEnd = js.Any.fromFunction0(getEnd), getNumPlans = js.Any.fromFunction0(getNumPlans), getPlan = js.Any.fromFunction1(getPlan), getStart = js.Any.fromFunction0(getStart), moreResultsUrl = moreResultsUrl, policy = policy)
  
    __obj.asInstanceOf[TransitRouteResult]
  }
}

