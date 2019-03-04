package typings
package baidumapDashWebDashSdkLib.BMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Custompoi extends js.Object {
  var address: java.lang.String
  var city: java.lang.String
  var cityCode: scala.Double
  var databoxId: java.lang.String
  var district: java.lang.String
  var districtCode: scala.Double
  var extendedData: js.Any
  var phoneNumber: java.lang.String
  var poiId: java.lang.String
  var point: Point
  var postcode: java.lang.String
  var province: java.lang.String
  var provinceCode: scala.Double
  var tags: js.Array[java.lang.String]
  var title: java.lang.String
  var typeId: scala.Double
}

object Custompoi {
  @scala.inline
  def apply(
    address: java.lang.String,
    city: java.lang.String,
    cityCode: scala.Double,
    databoxId: java.lang.String,
    district: java.lang.String,
    districtCode: scala.Double,
    extendedData: js.Any,
    phoneNumber: java.lang.String,
    poiId: java.lang.String,
    point: Point,
    postcode: java.lang.String,
    province: java.lang.String,
    provinceCode: scala.Double,
    tags: js.Array[java.lang.String],
    title: java.lang.String,
    typeId: scala.Double
  ): Custompoi = {
    val __obj = js.Dynamic.literal(address = address, city = city, cityCode = cityCode, databoxId = databoxId, district = district, districtCode = districtCode, extendedData = extendedData, phoneNumber = phoneNumber, poiId = poiId, point = point, postcode = postcode, province = province, provinceCode = provinceCode, tags = tags, title = title, typeId = typeId)
  
    __obj.asInstanceOf[Custompoi]
  }
}

