package typings.bmapgl.BMapGL

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Custompoi extends js.Object {
  
  var address: String = js.native
  
  var city: String = js.native
  
  var cityCode: Double = js.native
  
  var databoxId: String = js.native
  
  var district: String = js.native
  
  var districtCode: Double = js.native
  
  var extendedData: js.Any = js.native
  
  var phoneNumber: String = js.native
  
  var poiId: String = js.native
  
  var point: Point = js.native
  
  var postcode: String = js.native
  
  var province: String = js.native
  
  var provinceCode: Double = js.native
  
  var tags: js.Array[String] = js.native
  
  var title: String = js.native
  
  var typeId: Double = js.native
}
object Custompoi {
  
  @scala.inline
  def apply(
    address: String,
    city: String,
    cityCode: Double,
    databoxId: String,
    district: String,
    districtCode: Double,
    extendedData: js.Any,
    phoneNumber: String,
    poiId: String,
    point: Point,
    postcode: String,
    province: String,
    provinceCode: Double,
    tags: js.Array[String],
    title: String,
    typeId: Double
  ): Custompoi = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], city = city.asInstanceOf[js.Any], cityCode = cityCode.asInstanceOf[js.Any], databoxId = databoxId.asInstanceOf[js.Any], district = district.asInstanceOf[js.Any], districtCode = districtCode.asInstanceOf[js.Any], extendedData = extendedData.asInstanceOf[js.Any], phoneNumber = phoneNumber.asInstanceOf[js.Any], poiId = poiId.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any], postcode = postcode.asInstanceOf[js.Any], province = province.asInstanceOf[js.Any], provinceCode = provinceCode.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], typeId = typeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Custompoi]
  }
  
  @scala.inline
  implicit class CustompoiOps[Self <: Custompoi] (val x: Self) extends AnyVal {
    
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
    def setCityCode(value: Double): Self = this.set("cityCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataboxId(value: String): Self = this.set("databoxId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistrict(value: String): Self = this.set("district", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistrictCode(value: Double): Self = this.set("districtCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtendedData(value: js.Any): Self = this.set("extendedData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneNumber(value: String): Self = this.set("phoneNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoiId(value: String): Self = this.set("poiId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoint(value: Point): Self = this.set("point", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostcode(value: String): Self = this.set("postcode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvince(value: String): Self = this.set("province", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvinceCode(value: Double): Self = this.set("provinceCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsVarargs(value: String*): Self = this.set("tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: js.Array[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeId(value: Double): Self = this.set("typeId", value.asInstanceOf[js.Any])
  }
}
