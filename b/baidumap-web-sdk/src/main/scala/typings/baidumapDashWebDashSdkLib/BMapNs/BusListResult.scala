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

object BusListResult {
  @scala.inline
  def apply(
    city: java.lang.String,
    getBusListItem: js.Function1[scala.Double, BusListItem],
    getNumBusList: js.Function0[scala.Double],
    keyword: java.lang.String,
    moreResultsUrl: java.lang.String
  ): BusListResult = {
    val __obj = js.Dynamic.literal(city = city, getBusListItem = getBusListItem, getNumBusList = getNumBusList, keyword = keyword, moreResultsUrl = moreResultsUrl)
  
    __obj.asInstanceOf[BusListResult]
  }
}

