package typings
package baidumapDashWebDashSdkLib.BMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalResultPoi extends js.Object {
  var address: java.lang.String
  var city: java.lang.String
  var detailUrl: java.lang.String
  var isAccurate: scala.Boolean
  var phoneNumber: java.lang.String
  var point: Point
  var postcode: java.lang.String
  var province: java.lang.String
  var tags: js.Array[java.lang.String]
  var title: java.lang.String
  var `type`: PoiType
  var url: java.lang.String
}

object LocalResultPoi {
  @scala.inline
  def apply(
    address: java.lang.String,
    city: java.lang.String,
    detailUrl: java.lang.String,
    isAccurate: scala.Boolean,
    phoneNumber: java.lang.String,
    point: Point,
    postcode: java.lang.String,
    province: java.lang.String,
    tags: js.Array[java.lang.String],
    title: java.lang.String,
    `type`: PoiType,
    url: java.lang.String
  ): LocalResultPoi = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("address")(address)
    __obj.updateDynamic("city")(city)
    __obj.updateDynamic("detailUrl")(detailUrl)
    __obj.updateDynamic("isAccurate")(isAccurate)
    __obj.updateDynamic("phoneNumber")(phoneNumber)
    __obj.updateDynamic("point")(point)
    __obj.updateDynamic("postcode")(postcode)
    __obj.updateDynamic("province")(province)
    __obj.updateDynamic("tags")(tags)
    __obj.updateDynamic("title")(title)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[LocalResultPoi]
  }
}

