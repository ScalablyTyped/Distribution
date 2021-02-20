package typings.bmapgl.BMapGL

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Custompoi extends StObject {
  
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
  implicit class CustompoiMutableBuilder[Self <: Custompoi] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCityCode(value: Double): Self = StObject.set(x, "cityCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataboxId(value: String): Self = StObject.set(x, "databoxId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistrict(value: String): Self = StObject.set(x, "district", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistrictCode(value: Double): Self = StObject.set(x, "districtCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtendedData(value: js.Any): Self = StObject.set(x, "extendedData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoiId(value: String): Self = StObject.set(x, "poiId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoint(value: Point): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostcode(value: String): Self = StObject.set(x, "postcode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvince(value: String): Self = StObject.set(x, "province", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvinceCode(value: Double): Self = StObject.set(x, "provinceCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value :_*))
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeId(value: Double): Self = StObject.set(x, "typeId", value.asInstanceOf[js.Any])
  }
}
