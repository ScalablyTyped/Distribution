package typings.baidumapWebSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Custompoi extends js.Object {
  var address: String
  var city: String
  var cityCode: Double
  var databoxId: String
  var district: String
  var districtCode: Double
  var extendedData: js.Any
  var phoneNumber: String
  var poiId: String
  var point: Point
  var postcode: String
  var province: String
  var provinceCode: Double
  var tags: js.Array[String]
  var title: String
  var typeId: Double
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
}

