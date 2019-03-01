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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bounds")(bounds)
    __obj.updateDynamic("center")(center)
    __obj.updateDynamic("city")(city)
    __obj.updateDynamic("getCityList")(getCityList)
    __obj.updateDynamic("getCurrentNumPois")(getCurrentNumPois)
    __obj.updateDynamic("getNumPages")(getNumPages)
    __obj.updateDynamic("getNumPois")(getNumPois)
    __obj.updateDynamic("getPageIndex")(getPageIndex)
    __obj.updateDynamic("getPoi")(getPoi)
    __obj.updateDynamic("keyword")(keyword)
    __obj.updateDynamic("moreResultsUrl")(moreResultsUrl)
    __obj.updateDynamic("province")(province)
    __obj.updateDynamic("radius")(radius)
    __obj.updateDynamic("suggestions")(suggestions)
    __obj.asInstanceOf[LocalResult]
  }
}

