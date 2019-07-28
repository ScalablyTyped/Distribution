package typings.braintree.braintreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FacilitatorDetails extends js.Object {
  var oauthApplicationClientId: String
  var oauthApplicationName: String
  var sourcePaymentMethodToken: String
}

object FacilitatorDetails {
  @scala.inline
  def apply(oauthApplicationClientId: String, oauthApplicationName: String, sourcePaymentMethodToken: String): FacilitatorDetails = {
    val __obj = js.Dynamic.literal(oauthApplicationClientId = oauthApplicationClientId, oauthApplicationName = oauthApplicationName, sourcePaymentMethodToken = sourcePaymentMethodToken)
  
    __obj.asInstanceOf[FacilitatorDetails]
  }
}

