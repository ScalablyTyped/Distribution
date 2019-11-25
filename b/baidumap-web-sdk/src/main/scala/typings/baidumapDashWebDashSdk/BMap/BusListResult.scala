package typings.baidumapDashWebDashSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BusListResult extends js.Object {
  var city: String
  var keyword: String
  var moreResultsUrl: String
  def getBusListItem(i: Double): BusListItem
  def getNumBusList(): Double
}

object BusListResult {
  @scala.inline
  def apply(
    city: String,
    getBusListItem: Double => BusListItem,
    getNumBusList: () => Double,
    keyword: String,
    moreResultsUrl: String
  ): BusListResult = {
    val __obj = js.Dynamic.literal(city = city.asInstanceOf[js.Any], getBusListItem = js.Any.fromFunction1(getBusListItem), getNumBusList = js.Any.fromFunction0(getNumBusList), keyword = keyword.asInstanceOf[js.Any], moreResultsUrl = moreResultsUrl.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BusListResult]
  }
}

