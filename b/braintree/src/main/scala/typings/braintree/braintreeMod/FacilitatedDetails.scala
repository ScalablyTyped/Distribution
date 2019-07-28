package typings.braintree.braintreeMod

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
    val __obj = js.Dynamic.literal(merchantId = merchantId, merchantName = merchantName, paymentMethodNonce = paymentMethodNonce)
  
    __obj.asInstanceOf[FacilitatedDetails]
  }
}

