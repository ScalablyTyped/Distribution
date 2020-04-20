package typings.braintree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FacilitatedDetails extends js.Object {
  var merchantId: String
  var merchantName: String
  var paymentMethodNonce: String
}

object FacilitatedDetails {
  @scala.inline
  def apply(merchantId: String, merchantName: String, paymentMethodNonce: String): FacilitatedDetails = {
    val __obj = js.Dynamic.literal(merchantId = merchantId.asInstanceOf[js.Any], merchantName = merchantName.asInstanceOf[js.Any], paymentMethodNonce = paymentMethodNonce.asInstanceOf[js.Any])
    __obj.asInstanceOf[FacilitatedDetails]
  }
}

