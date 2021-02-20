package typings.baidumapWebSdk.BMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocalResultPoi extends StObject {
  
  var address: String = js.native
  
  var city: String = js.native
  
  var detailUrl: String = js.native
  
  var isAccurate: Boolean = js.native
  
  var phoneNumber: String = js.native
  
  var point: Point = js.native
  
  var postcode: String = js.native
  
  var province: String = js.native
  
  var tags: js.Array[String] = js.native
  
  var title: String = js.native
  
  var `type`: PoiType = js.native
  
  var url: String = js.native
}
object LocalResultPoi {
  
  @scala.inline
  def apply(
    address: String,
    city: String,
    detailUrl: String,
    isAccurate: Boolean,
    phoneNumber: String,
    point: Point,
    postcode: String,
    province: String,
    tags: js.Array[String],
    title: String,
    `type`: PoiType,
    url: String
  ): LocalResultPoi = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], city = city.asInstanceOf[js.Any], detailUrl = detailUrl.asInstanceOf[js.Any], isAccurate = isAccurate.asInstanceOf[js.Any], phoneNumber = phoneNumber.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any], postcode = postcode.asInstanceOf[js.Any], province = province.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalResultPoi]
  }
  
  @scala.inline
  implicit class LocalResultPoiMutableBuilder[Self <: LocalResultPoi] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailUrl(value: String): Self = StObject.set(x, "detailUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAccurate(value: Boolean): Self = StObject.set(x, "isAccurate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoint(value: Point): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostcode(value: String): Self = StObject.set(x, "postcode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvince(value: String): Self = StObject.set(x, "province", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value :_*))
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: PoiType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
