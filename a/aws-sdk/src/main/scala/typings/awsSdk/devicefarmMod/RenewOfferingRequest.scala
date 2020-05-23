package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenewOfferingRequest extends js.Object {
  /**
    * The ID of a request to renew an offering.
    */
  var offeringId: js.UndefOr[OfferingIdentifier] = js.native
  /**
    * The quantity requested in an offering renewal.
    */
  var quantity: js.UndefOr[Integer] = js.native
}

object RenewOfferingRequest {
  @scala.inline
  def apply(offeringId: OfferingIdentifier = null, quantity: js.UndefOr[Integer] = js.undefined): RenewOfferingRequest = {
    val __obj = js.Dynamic.literal()
    if (offeringId != null) __obj.updateDynamic("offeringId")(offeringId.asInstanceOf[js.Any])
    if (!js.isUndefined(quantity)) __obj.updateDynamic("quantity")(quantity.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenewOfferingRequest]
  }
}

