package typings.baidumapWebSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BusListResult extends js.Object {
  
  var city: String = js.native
  
  def getBusListItem(i: Double): BusListItem = js.native
  
  def getNumBusList(): Double = js.native
  
  var keyword: String = js.native
  
  var moreResultsUrl: String = js.native
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
  implicit class BusListResultOps[Self <: BusListResult] (val x: Self) extends AnyVal {
    
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
    def setCity(value: String): Self = this.set("city", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetBusListItem(value: Double => BusListItem): Self = this.set("getBusListItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetNumBusList(value: () => Double): Self = this.set("getNumBusList", js.Any.fromFunction0(value))
    
    @scala.inline
    def setKeyword(value: String): Self = this.set("keyword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMoreResultsUrl(value: String): Self = this.set("moreResultsUrl", value.asInstanceOf[js.Any])
  }
}
