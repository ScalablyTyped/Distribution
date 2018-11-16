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

