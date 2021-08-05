package typings.bmapgl.BMapGL

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocalResult extends StObject {
  
  var bounds: Bounds
  
  var center: LocalResultPoi
  
  var city: String
  
  def getCityList(): js.Array[js.Any]
  
  def getCurrentNumPois(): Double
  
  def getNumPages(): Double
  
  def getNumPois(): Double
  
  def getPageIndex(): Double
  
  def getPoi(i: Double): LocalResultPoi
  
  var keyword: String
  
  var moreResultsUrl: String
  
  var province: String
  
  var radius: Double
  
  var suggestions: js.Array[String]
}
object LocalResult {
  
  inline def apply(
    bounds: Bounds,
    center: LocalResultPoi,
    city: String,
    getCityList: () => js.Array[js.Any],
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
  
  extension [Self <: LocalResult](x: Self) {
    
    inline def setBounds(value: Bounds): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    inline def setCenter(value: LocalResultPoi): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    inline def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
    
    inline def setGetCityList(value: () => js.Array[js.Any]): Self = StObject.set(x, "getCityList", js.Any.fromFunction0(value))
    
    inline def setGetCurrentNumPois(value: () => Double): Self = StObject.set(x, "getCurrentNumPois", js.Any.fromFunction0(value))
    
    inline def setGetNumPages(value: () => Double): Self = StObject.set(x, "getNumPages", js.Any.fromFunction0(value))
    
    inline def setGetNumPois(value: () => Double): Self = StObject.set(x, "getNumPois", js.Any.fromFunction0(value))
    
    inline def setGetPageIndex(value: () => Double): Self = StObject.set(x, "getPageIndex", js.Any.fromFunction0(value))
    
    inline def setGetPoi(value: Double => LocalResultPoi): Self = StObject.set(x, "getPoi", js.Any.fromFunction1(value))
    
    inline def setKeyword(value: String): Self = StObject.set(x, "keyword", value.asInstanceOf[js.Any])
    
    inline def setMoreResultsUrl(value: String): Self = StObject.set(x, "moreResultsUrl", value.asInstanceOf[js.Any])
    
    inline def setProvince(value: String): Self = StObject.set(x, "province", value.asInstanceOf[js.Any])
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setSuggestions(value: js.Array[String]): Self = StObject.set(x, "suggestions", value.asInstanceOf[js.Any])
    
    inline def setSuggestionsVarargs(value: String*): Self = StObject.set(x, "suggestions", js.Array(value :_*))
  }
}
