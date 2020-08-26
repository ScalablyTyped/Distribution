package typings.baidumapWebSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocalResult extends js.Object {
  var bounds: Bounds = js.native
  var center: LocalResultPoi = js.native
  var city: String = js.native
  var keyword: String = js.native
  var moreResultsUrl: String = js.native
  var province: String = js.native
  var radius: Double = js.native
  var suggestions: js.Array[String] = js.native
  def getCityList(): js.Array[_] = js.native
  def getCurrentNumPois(): Double = js.native
  def getNumPages(): Double = js.native
  def getNumPois(): Double = js.native
  def getPageIndex(): Double = js.native
  def getPoi(i: Double): LocalResultPoi = js.native
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
  @scala.inline
  implicit class LocalResultOps[Self <: LocalResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBounds(value: Bounds): Self = this.set("bounds", value.asInstanceOf[js.Any])
    @scala.inline
    def setCenter(value: LocalResultPoi): Self = this.set("center", value.asInstanceOf[js.Any])
    @scala.inline
    def setCity(value: String): Self = this.set("city", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetCityList(value: () => js.Array[_]): Self = this.set("getCityList", js.Any.fromFunction0(value))
    @scala.inline
    def setGetCurrentNumPois(value: () => Double): Self = this.set("getCurrentNumPois", js.Any.fromFunction0(value))
    @scala.inline
    def setGetNumPages(value: () => Double): Self = this.set("getNumPages", js.Any.fromFunction0(value))
    @scala.inline
    def setGetNumPois(value: () => Double): Self = this.set("getNumPois", js.Any.fromFunction0(value))
    @scala.inline
    def setGetPageIndex(value: () => Double): Self = this.set("getPageIndex", js.Any.fromFunction0(value))
    @scala.inline
    def setGetPoi(value: Double => LocalResultPoi): Self = this.set("getPoi", js.Any.fromFunction1(value))
    @scala.inline
    def setKeyword(value: String): Self = this.set("keyword", value.asInstanceOf[js.Any])
    @scala.inline
    def setMoreResultsUrl(value: String): Self = this.set("moreResultsUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setProvince(value: String): Self = this.set("province", value.asInstanceOf[js.Any])
    @scala.inline
    def setRadius(value: Double): Self = this.set("radius", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuggestionsVarargs(value: String*): Self = this.set("suggestions", js.Array(value :_*))
    @scala.inline
    def setSuggestions(value: js.Array[String]): Self = this.set("suggestions", value.asInstanceOf[js.Any])
  }
  
}

