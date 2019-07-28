package typings.braintreeDashWeb.braintreeDashWebMod

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
  sealed trait STATUS_FAILURE extends ApplePayStatusCodes
  
  // The billing address is not valid.
  @js.native
  sealed trait STATUS_INVALID_BILLING_POSTAL_ADDRESS extends ApplePayStatusCodes
  
  // The shipping contact information is not valid.
  @js.native
  sealed trait STATUS_INVALID_SHIPPING_CONTACT extends ApplePayStatusCodes
  
  // The shipping address is not valid.
  @js.native
  sealed trait STATUS_INVALID_SHIPPING_POSTAL_ADDRESS extends ApplePayStatusCodes
  
  // The PIN information is not valid.Cards on the China Union Pay network may require a PIN.
  @js.native
  sealed trait STATUS_PIN_INCORRECT extends ApplePayStatusCodes
  
  // The maximum number of tries for a PIN has been reached and the user has been locked out. Cards on the China Union Pay network may require a PIN.
  @js.native
  sealed trait STATUS_PIN_LOCKOUT extends ApplePayStatusCodes
  
  // The required PIN information was not provided. Cards on the China Union Pay payment network may require a PIN to authenticate the transaction.
  @js.native
  sealed trait STATUS_PIN_REQUIRED extends ApplePayStatusCodes
  
  // The requested action succeeded.
  @js.native
  sealed trait STATUS_SUCCESS extends ApplePayStatusCodes
  
  /* 0 */ val STATUS_FAILURE: typings.braintreeDashWeb.braintreeDashWebMod.ApplePayStatusCodes.STATUS_FAILURE with Double = js.native
  /* 1 */ val STATUS_INVALID_BILLING_POSTAL_ADDRESS: typings.braintreeDashWeb.braintreeDashWebMod.ApplePayStatusCodes.STATUS_INVALID_BILLING_POSTAL_ADDRESS with Double = js.native
  /* 3 */ val STATUS_INVALID_SHIPPING_CONTACT: typings.braintreeDashWeb.braintreeDashWebMod.ApplePayStatusCodes.STATUS_INVALID_SHIPPING_CONTACT with Double = js.native
  /* 2 */ val STATUS_INVALID_SHIPPING_POSTAL_ADDRESS: typings.braintreeDashWeb.braintreeDashWebMod.ApplePayStatusCodes.STATUS_INVALID_SHIPPING_POSTAL_ADDRESS with Double = js.native
  /* 5 */ val STATUS_PIN_INCORRECT: typings.braintreeDashWeb.braintreeDashWebMod.ApplePayStatusCodes.STATUS_PIN_INCORRECT with Double = js.native
  /* 6 */ val STATUS_PIN_LOCKOUT: typings.braintreeDashWeb.braintreeDashWebMod.ApplePayStatusCodes.STATUS_PIN_LOCKOUT with Double = js.native
  /* 4 */ val STATUS_PIN_REQUIRED: typings.braintreeDashWeb.braintreeDashWebMod.ApplePayStatusCodes.STATUS_PIN_REQUIRED with Double = js.native
  /* 1 */ val STATUS_SUCCESS: typings.braintreeDashWeb.braintreeDashWebMod.ApplePayStatusCodes.STATUS_SUCCESS with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ApplePayStatusCodes with Double] = js.native
}

