package typings.baidumapDashWebDashSdk.BMap

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
    val __obj = js.Dynamic.literal(address = address, city = city, cityCode = cityCode, databoxId = databoxId, district = district, districtCode = districtCode, extendedData = extendedData, phoneNumber = phoneNumber, poiId = poiId, point = point, postcode = postcode, province = province, provinceCode = provinceCode, tags = tags, title = title, typeId = typeId)
  
    __obj.asInstanceOf[Custompoi]
  }
}

