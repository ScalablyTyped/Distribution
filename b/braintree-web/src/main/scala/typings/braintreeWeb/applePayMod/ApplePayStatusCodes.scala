package typings.braintreeWeb.applePayMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ApplePayStatusCodes extends js.Object
@JSImport("braintree-web/modules/apple-pay", "ApplePayStatusCodes")
@js.native
object ApplePayStatusCodes extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ApplePayStatusCodes with Double] = js.native
  
  // The requested action failed.
  @js.native
  sealed trait STATUS_FAILURE extends ApplePayStatusCodes
  /* 0 */ @js.native
  object STATUS_FAILURE extends TopLevel[STATUS_FAILURE with Double]
  
  // The billing address is not valid.
  @js.native
  sealed trait STATUS_INVALID_BILLING_POSTAL_ADDRESS extends ApplePayStatusCodes
  /* 1 */ @js.native
  object STATUS_INVALID_BILLING_POSTAL_ADDRESS extends TopLevel[STATUS_INVALID_BILLING_POSTAL_ADDRESS with Double]
  
  // The shipping contact information is not valid.
  @js.native
  sealed trait STATUS_INVALID_SHIPPING_CONTACT extends ApplePayStatusCodes
  /* 3 */ @js.native
  object STATUS_INVALID_SHIPPING_CONTACT extends TopLevel[STATUS_INVALID_SHIPPING_CONTACT with Double]
  
  // The shipping address is not valid.
  @js.native
  sealed trait STATUS_INVALID_SHIPPING_POSTAL_ADDRESS extends ApplePayStatusCodes
  /* 2 */ @js.native
  object STATUS_INVALID_SHIPPING_POSTAL_ADDRESS extends TopLevel[STATUS_INVALID_SHIPPING_POSTAL_ADDRESS with Double]
  
  // The PIN information is not valid.Cards on the China Union Pay network may require a PIN.
  @js.native
  sealed trait STATUS_PIN_INCORRECT extends ApplePayStatusCodes
  /* 5 */ @js.native
  object STATUS_PIN_INCORRECT extends TopLevel[STATUS_PIN_INCORRECT with Double]
  
  // The maximum number of tries for a PIN has been reached and the user has been locked out. Cards on the China Union Pay network may require a PIN.
  @js.native
  sealed trait STATUS_PIN_LOCKOUT extends ApplePayStatusCodes
  /* 6 */ @js.native
  object STATUS_PIN_LOCKOUT extends TopLevel[STATUS_PIN_LOCKOUT with Double]
  
  // The required PIN information was not provided. Cards on the China Union Pay payment network may require a PIN to authenticate the transaction.
  @js.native
  sealed trait STATUS_PIN_REQUIRED extends ApplePayStatusCodes
  /* 4 */ @js.native
  object STATUS_PIN_REQUIRED extends TopLevel[STATUS_PIN_REQUIRED with Double]
  
  // The requested action succeeded.
  @js.native
  sealed trait STATUS_SUCCESS extends ApplePayStatusCodes
  /* 1 */ @js.native
  object STATUS_SUCCESS extends TopLevel[STATUS_SUCCESS with Double]
}
