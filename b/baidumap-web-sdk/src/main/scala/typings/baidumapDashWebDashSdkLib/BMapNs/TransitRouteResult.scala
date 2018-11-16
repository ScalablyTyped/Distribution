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

