package typings
package braintreeDashWebLib.braintreeDashWebMod.braintreeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ApplePayStatusCodes extends js.Object

@JSImport("braintree-web/braintree", "ApplePayStatusCodes")
@js.native
object ApplePayStatusCodes extends js.Object {
  // The requested action failed.
  @js.native
  sealed trait STATUS_FAILURE
    extends braintreeDashWebLib.braintreeDashWebMod.braintreeNs.ApplePayStatusCodes
  
  // The billing address is not valid.
  @js.native
  sealed trait STATUS_INVALID_BILLING_POSTAL_ADDRESS
    extends braintreeDashWebLib.braintreeDashWebMod.braintreeNs.ApplePayStatusCodes
  
  // The shipping contact information is not valid.
  @js.native
  sealed trait STATUS_INVALID_SHIPPING_CONTACT
    extends braintreeDashWebLib.braintreeDashWebMod.braintreeNs.ApplePayStatusCodes
  
  // The shipping address is not valid.
  @js.native
  sealed trait STATUS_INVALID_SHIPPING_POSTAL_ADDRESS
    extends braintreeDashWebLib.braintreeDashWebMod.braintreeNs.ApplePayStatusCodes
  
  // The PIN information is not valid.Cards on the China Union Pay network may require a PIN.
  @js.native
  sealed trait STATUS_PIN_INCORRECT
    extends braintreeDashWebLib.braintreeDashWebMod.braintreeNs.ApplePayStatusCodes
  
  // The maximum number of tries for a PIN has been reached and the user has been locked out. Cards on the China Union Pay network may require a PIN.
  @js.native
  sealed trait STATUS_PIN_LOCKOUT
    extends braintreeDashWebLib.braintreeDashWebMod.braintreeNs.ApplePayStatusCodes
  
  // The required PIN information was not provided. Cards on the China Union Pay payment network may require a PIN to authenticate the transaction.
  @js.native
  sealed trait STATUS_PIN_REQUIRED
    extends braintreeDashWebLib.braintreeDashWebMod.braintreeNs.ApplePayStatusCodes
  
  // The requested action succeeded.
  @js.native
  sealed trait STATUS_SUCCESS
    extends braintreeDashWebLib.braintreeDashWebMod.braintreeNs.ApplePayStatusCodes
  
}

