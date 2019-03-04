package typings
package baidumapDashWebDashSdkLib.BMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeocoderResult extends js.Object {
  var address: java.lang.String
  var addressComponents: AddressComponent
  var business: java.lang.String
  var point: Point
  var surroundingPoi: js.Array[LocalResultPoi]
}

object GeocoderResult {
  @scala.inline
  def apply(
    address: java.lang.String,
    addressComponents: AddressComponent,
    business: java.lang.String,
    point: Point,
    surroundingPoi: js.Array[LocalResultPoi]
  ): GeocoderResult = {
    val __obj = js.Dynamic.literal(address = address, addressComponents = addressComponents, business = business, point = point, surroundingPoi = surroundingPoi)
  
    __obj.asInstanceOf[GeocoderResult]
  }
}

