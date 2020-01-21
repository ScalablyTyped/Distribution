package typings.baidumapWebSdk.BMap

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
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], city = city.asInstanceOf[js.Any], detailUrl = detailUrl.asInstanceOf[js.Any], isAccurate = isAccurate.asInstanceOf[js.Any], phoneNumber = phoneNumber.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any], postcode = postcode.asInstanceOf[js.Any], province = province.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalResultPoi]
  }
}

