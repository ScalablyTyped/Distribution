package typings
package baidumapDashWebDashSdkLib.BMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitRouteResult extends js.Object {
  var city: java.lang.String
  var moreResultsUrl: java.lang.String
  var policy: TransitPolicy
  def getEnd(): LocalResultPoi
  def getNumPlans(): scala.Double
  def getPlan(i: scala.Double): TransitRoutePlan
  def getStart(): LocalResultPoi
}

object TransitRouteResult {
  @scala.inline
  def apply(
    city: java.lang.String,
    getEnd: () => LocalResultPoi,
    getNumPlans: () => scala.Double,
    getPlan: scala.Double => TransitRoutePlan,
    getStart: () => LocalResultPoi,
    moreResultsUrl: java.lang.String,
    policy: TransitPolicy
  ): TransitRouteResult = {
    val __obj = js.Dynamic.literal(city = city, getEnd = js.Any.fromFunction0(getEnd), getNumPlans = js.Any.fromFunction0(getNumPlans), getPlan = js.Any.fromFunction1(getPlan), getStart = js.Any.fromFunction0(getStart), moreResultsUrl = moreResultsUrl, policy = policy)
  
    __obj.asInstanceOf[TransitRouteResult]
  }
}

