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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("address")(address)
    __obj.updateDynamic("city")(city)
    __obj.updateDynamic("cityCode")(cityCode)
    __obj.updateDynamic("databoxId")(databoxId)
    __obj.updateDynamic("district")(district)
    __obj.updateDynamic("districtCode")(districtCode)
    __obj.updateDynamic("extendedData")(extendedData)
    __obj.updateDynamic("phoneNumber")(phoneNumber)
    __obj.updateDynamic("poiId")(poiId)
    __obj.updateDynamic("point")(point)
    __obj.updateDynamic("postcode")(postcode)
    __obj.updateDynamic("province")(province)
    __obj.updateDynamic("provinceCode")(provinceCode)
    __obj.updateDynamic("tags")(tags)
    __obj.updateDynamic("title")(title)
    __obj.updateDynamic("typeId")(typeId)
    __obj.asInstanceOf[Custompoi]
  }
}

