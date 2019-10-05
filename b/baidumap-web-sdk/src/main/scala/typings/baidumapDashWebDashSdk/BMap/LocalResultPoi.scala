package typings.baidumapDashWebDashSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalResultPoi extends js.Object {
  var address: String
  var city: String
  var detailUrl: String
  var isAccurate: Boolean
  var phoneNumber: String
  var point: Point
  var postcode: String
  var province: String
  var tags: js.Array[String]
  var title: String
  var `type`: PoiType
  var url: String
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
    val __obj = js.Dynamic.literal(address = address, city = city, detailUrl = detailUrl, isAccurate = isAccurate, phoneNumber = phoneNumber, point = point, postcode = postcode, province = province, tags = tags, title = title, url = url)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[LocalResultPoi]
  }
}

