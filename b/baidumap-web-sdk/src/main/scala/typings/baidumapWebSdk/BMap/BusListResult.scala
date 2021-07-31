package typings.baidumapWebSdk.BMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BusListResult extends StObject {
  
  var city: String
  
  def getBusListItem(i: Double): BusListItem
  
  def getNumBusList(): Double
  
  var keyword: String
  
  var moreResultsUrl: String
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
  
  @scala.inline
  implicit class BusListResultMutableBuilder[Self <: BusListResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetBusListItem(value: Double => BusListItem): Self = StObject.set(x, "getBusListItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetNumBusList(value: () => Double): Self = StObject.set(x, "getNumBusList", js.Any.fromFunction0(value))
    
    @scala.inline
    def setKeyword(value: String): Self = StObject.set(x, "keyword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMoreResultsUrl(value: String): Self = StObject.set(x, "moreResultsUrl", value.asInstanceOf[js.Any])
  }
}
