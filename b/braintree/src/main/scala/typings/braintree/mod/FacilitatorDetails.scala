package typings.braintree.mod

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
    val __obj = js.Dynamic.literal(oauthApplicationClientId = oauthApplicationClientId.asInstanceOf[js.Any], oauthApplicationName = oauthApplicationName.asInstanceOf[js.Any], sourcePaymentMethodToken = sourcePaymentMethodToken.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FacilitatorDetails]
  }
}

