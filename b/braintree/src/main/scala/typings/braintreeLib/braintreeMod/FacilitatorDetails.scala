package typings
package braintreeLib.braintreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FacilitatorDetails extends js.Object {
  var oauthApplicationClientId: java.lang.String
  var oauthApplicationName: java.lang.String
  var sourcePaymentMethodToken: java.lang.String
}

object FacilitatorDetails {
  @scala.inline
  def apply(
    oauthApplicationClientId: java.lang.String,
    oauthApplicationName: java.lang.String,
    sourcePaymentMethodToken: java.lang.String
  ): FacilitatorDetails = {
    val __obj = js.Dynamic.literal(oauthApplicationClientId = oauthApplicationClientId, oauthApplicationName = oauthApplicationName, sourcePaymentMethodToken = sourcePaymentMethodToken)
  
    __obj.asInstanceOf[FacilitatorDetails]
  }
}

