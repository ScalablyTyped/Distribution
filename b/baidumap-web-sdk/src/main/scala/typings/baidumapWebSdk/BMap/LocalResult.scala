package typings.baidumapWebSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalResult extends js.Object {
  var bounds: Bounds
  var center: LocalResultPoi
  var city: String
  var keyword: String
  var moreResultsUrl: String
  var province: String
  var radius: Double
  var suggestions: js.Array[String]
  def getCityList(): js.Array[_]
  def getCurrentNumPois(): Double
  def getNumPages(): Double
  def getNumPois(): Double
  def getPageIndex(): Double
  def getPoi(i: Double): LocalResultPoi
}

object LocalResult {
  @scala.inline
  def apply(
    bounds: Bounds,
    center: LocalResultPoi,
    city: String,
    getCityList: () => js.Array[_],
    getCurrentNumPois: () => Double,
    getNumPages: () => Double,
    getNumPois: () => Double,
    getPageIndex: () => Double,
    getPoi: Double => LocalResultPoi,
    keyword: String,
    moreResultsUrl: String,
    province: String,
    radius: Double,
    suggestions: js.Array[String]
  ): LocalResult = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], center = center.asInstanceOf[js.Any], city = city.asInstanceOf[js.Any], getCityList = js.Any.fromFunction0(getCityList), getCurrentNumPois = js.Any.fromFunction0(getCurrentNumPois), getNumPages = js.Any.fromFunction0(getNumPages), getNumPois = js.Any.fromFunction0(getNumPois), getPageIndex = js.Any.fromFunction0(getPageIndex), getPoi = js.Any.fromFunction1(getPoi), keyword = keyword.asInstanceOf[js.Any], moreResultsUrl = moreResultsUrl.asInstanceOf[js.Any], province = province.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], suggestions = suggestions.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalResult]
  }
}

