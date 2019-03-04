package typings
package baidumapDashWebDashSdkLib.BMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalResult extends js.Object {
  var bounds: Bounds
  var center: LocalResultPoi
  var city: java.lang.String
  var keyword: java.lang.String
  var moreResultsUrl: java.lang.String
  var province: java.lang.String
  var radius: scala.Double
  var suggestions: js.Array[java.lang.String]
  def getCityList(): js.Array[_]
  def getCurrentNumPois(): scala.Double
  def getNumPages(): scala.Double
  def getNumPois(): scala.Double
  def getPageIndex(): scala.Double
  def getPoi(i: scala.Double): LocalResultPoi
}

object LocalResult {
  @scala.inline
  def apply(
    bounds: Bounds,
    center: LocalResultPoi,
    city: java.lang.String,
    getCityList: js.Function0[js.Array[_]],
    getCurrentNumPois: js.Function0[scala.Double],
    getNumPages: js.Function0[scala.Double],
    getNumPois: js.Function0[scala.Double],
    getPageIndex: js.Function0[scala.Double],
    getPoi: js.Function1[scala.Double, LocalResultPoi],
    keyword: java.lang.String,
    moreResultsUrl: java.lang.String,
    province: java.lang.String,
    radius: scala.Double,
    suggestions: js.Array[java.lang.String]
  ): LocalResult = {
    val __obj = js.Dynamic.literal(bounds = bounds, center = center, city = city, getCityList = getCityList, getCurrentNumPois = getCurrentNumPois, getNumPages = getNumPages, getNumPois = getNumPois, getPageIndex = getPageIndex, getPoi = getPoi, keyword = keyword, moreResultsUrl = moreResultsUrl, province = province, radius = radius, suggestions = suggestions)
  
    __obj.asInstanceOf[LocalResult]
  }
}

