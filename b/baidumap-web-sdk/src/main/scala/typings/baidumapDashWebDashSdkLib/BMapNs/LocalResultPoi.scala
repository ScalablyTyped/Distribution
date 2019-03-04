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
    val __obj = js.Dynamic.literal(address = address, city = city, detailUrl = detailUrl, isAccurate = isAccurate, phoneNumber = phoneNumber, point = point, postcode = postcode, province = province, tags = tags, title = title, url = url)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[LocalResultPoi]
  }
}

