package typings.baidumapWebSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeocoderResult extends js.Object {
  var address: String
  var addressComponents: AddressComponent
  var business: String
  var point: Point
  var surroundingPoi: js.Array[LocalResultPoi]
}

object GeocoderResult {
  @scala.inline
  def apply(
    address: String,
    addressComponents: AddressComponent,
    business: String,
    point: Point,
    surroundingPoi: js.Array[LocalResultPoi]
  ): GeocoderResult = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], addressComponents = addressComponents.asInstanceOf[js.Any], business = business.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any], surroundingPoi = surroundingPoi.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeocoderResult]
  }
}

