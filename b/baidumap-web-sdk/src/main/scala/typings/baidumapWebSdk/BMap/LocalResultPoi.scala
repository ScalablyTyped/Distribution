package typings.baidumapWebSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocalResultPoi extends js.Object {
  
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
  implicit class LocalResultPoiOps[Self <: LocalResultPoi] (val x: Self) extends AnyVal {
    
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
    def setAddress(value: String): Self = this.set("address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCity(value: String): Self = this.set("city", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailUrl(value: String): Self = this.set("detailUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAccurate(value: Boolean): Self = this.set("isAccurate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneNumber(value: String): Self = this.set("phoneNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoint(value: Point): Self = this.set("point", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostcode(value: String): Self = this.set("postcode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvince(value: String): Self = this.set("province", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsVarargs(value: String*): Self = this.set("tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: js.Array[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: PoiType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
}
