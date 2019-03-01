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
    getEnd: js.Function0[LocalResultPoi],
    getNumPlans: js.Function0[scala.Double],
    getPlan: js.Function1[scala.Double, TransitRoutePlan],
    getStart: js.Function0[LocalResultPoi],
    moreResultsUrl: java.lang.String,
    policy: TransitPolicy
  ): TransitRouteResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("city")(city)
    __obj.updateDynamic("getEnd")(getEnd)
    __obj.updateDynamic("getNumPlans")(getNumPlans)
    __obj.updateDynamic("getPlan")(getPlan)
    __obj.updateDynamic("getStart")(getStart)
    __obj.updateDynamic("moreResultsUrl")(moreResultsUrl)
    __obj.updateDynamic("policy")(policy)
    __obj.asInstanceOf[TransitRouteResult]
  }
}

