package typings
package braintreeLib.braintreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FacilitatedDetails extends js.Object {
  var merchantId: java.lang.String
  var merchantName: java.lang.String
  var paymentMethodNonce: java.lang.String
}

object FacilitatedDetails {
  @scala.inline
  def apply(merchantId: java.lang.String, merchantName: java.lang.String, paymentMethodNonce: java.lang.String): FacilitatedDetails = {
    val __obj = js.Dynamic.literal(merchantId = merchantId, merchantName = merchantName, paymentMethodNonce = paymentMethodNonce)
  
    __obj.asInstanceOf[FacilitatedDetails]
  }
}

