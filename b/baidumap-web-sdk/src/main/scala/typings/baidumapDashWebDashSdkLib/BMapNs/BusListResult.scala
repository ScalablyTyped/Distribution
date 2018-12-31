package typings
package baidumapDashWebDashSdkLib.BMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BusListResult extends js.Object {
  var city: java.lang.String
  var keyword: java.lang.String
  var moreResultsUrl: java.lang.String
  def getBusListItem(i: scala.Double): BusListItem
  def getNumBusList(): scala.Double
}

