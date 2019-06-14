package typings
package braintreeDashWebLib.braintreeDashWebMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ApplePayStatusCodes extends js.Object

@JSImport("braintree-web", "ApplePayStatusCodes")
@js.native
object ApplePayStatusCodes extends js.Object {
  // The requested action failed.
  @js.native
  sealed trait STATUS_FAILURE
    extends braintreeDashWebLib.braintreeDashWebMod.ApplePayStatusCodes
  
  // The billing address is not valid.
  @js.native
  sealed trait STATUS_INVALID_BILLING_POSTAL_ADDRESS
    extends braintreeDashWebLib.braintreeDashWebMod.ApplePayStatusCodes
  
  // The shipping contact information is not valid.
  @js.native
  sealed trait STATUS_INVALID_SHIPPING_CONTACT
    extends braintreeDashWebLib.braintreeDashWebMod.ApplePayStatusCodes
  
  // The shipping address is not valid.
  @js.native
  sealed trait STATUS_INVALID_SHIPPING_POSTAL_ADDRESS
    extends braintreeDashWebLib.braintreeDashWebMod.ApplePayStatusCodes
  
  // The PIN information is not valid.Cards on the China Union Pay network may require a PIN.
  @js.native
  sealed trait STATUS_PIN_INCORRECT
    extends braintreeDashWebLib.braintreeDashWebMod.ApplePayStatusCodes
  
  // The maximum number of tries for a PIN has been reached and the user has been locked out. Cards on the China Union Pay network may require a PIN.
  @js.native
  sealed trait STATUS_PIN_LOCKOUT
    extends braintreeDashWebLib.braintreeDashWebMod.ApplePayStatusCodes
  
  // The required PIN information was not provided. Cards on the China Union Pay payment network may require a PIN to authenticate the transaction.
  @js.native
  sealed trait STATUS_PIN_REQUIRED
    extends braintreeDashWebLib.braintreeDashWebMod.ApplePayStatusCodes
  
  // The requested action succeeded.
  @js.native
  sealed trait STATUS_SUCCESS
    extends braintreeDashWebLib.braintreeDashWebMod.ApplePayStatusCodes
  
  /* 0 */ val STATUS_FAILURE: STATUS_FAILURE with scala.Double = js.native
  /* 1 */ val STATUS_INVALID_BILLING_POSTAL_ADDRESS: STATUS_INVALID_BILLING_POSTAL_ADDRESS with scala.Double = js.native
  /* 3 */ val STATUS_INVALID_SHIPPING_CONTACT: STATUS_INVALID_SHIPPING_CONTACT with scala.Double = js.native
  /* 2 */ val STATUS_INVALID_SHIPPING_POSTAL_ADDRESS: STATUS_INVALID_SHIPPING_POSTAL_ADDRESS with scala.Double = js.native
  /* 5 */ val STATUS_PIN_INCORRECT: STATUS_PIN_INCORRECT with scala.Double = js.native
  /* 6 */ val STATUS_PIN_LOCKOUT: STATUS_PIN_LOCKOUT with scala.Double = js.native
  /* 4 */ val STATUS_PIN_REQUIRED: STATUS_PIN_REQUIRED with scala.Double = js.native
  /* 1 */ val STATUS_SUCCESS: STATUS_SUCCESS with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[braintreeDashWebLib.braintreeDashWebMod.ApplePayStatusCodes with scala.Double] = js.native
}

