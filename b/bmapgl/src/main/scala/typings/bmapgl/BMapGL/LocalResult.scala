package typings.bmapgl.BMapGL

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocalResult extends StObject {
  
  var bounds: Bounds = js.native
  
  var center: LocalResultPoi = js.native
  
  var city: String = js.native
  
  def getCityList(): js.Array[_] = js.native
  
  def getCurrentNumPois(): Double = js.native
  
  def getNumPages(): Double = js.native
  
  def getNumPois(): Double = js.native
  
  def getPageIndex(): Double = js.native
  
  def getPoi(i: Double): LocalResultPoi = js.native
  
  var keyword: String = js.native
  
  var moreResultsUrl: String = js.native
  
  var province: String = js.native
  
  var radius: Double = js.native
  
  var suggestions: js.Array[String] = js.native
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
  implicit class LocalResultMutableBuilder[Self <: LocalResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBounds(value: Bounds): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenter(value: LocalResultPoi): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetCityList(value: () => js.Array[_]): Self = StObject.set(x, "getCityList", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCurrentNumPois(value: () => Double): Self = StObject.set(x, "getCurrentNumPois", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetNumPages(value: () => Double): Self = StObject.set(x, "getNumPages", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetNumPois(value: () => Double): Self = StObject.set(x, "getNumPois", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPageIndex(value: () => Double): Self = StObject.set(x, "getPageIndex", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPoi(value: Double => LocalResultPoi): Self = StObject.set(x, "getPoi", js.Any.fromFunction1(value))
    
    @scala.inline
    def setKeyword(value: String): Self = StObject.set(x, "keyword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMoreResultsUrl(value: String): Self = StObject.set(x, "moreResultsUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvince(value: String): Self = StObject.set(x, "province", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestions(value: js.Array[String]): Self = StObject.set(x, "suggestions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestionsVarargs(value: String*): Self = StObject.set(x, "suggestions", js.Array(value :_*))
  }
}
