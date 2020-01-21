package typings.braintreeWeb.mod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ApplePayStatusCodes with Double] = js.native
  /* 0 */ @js.native
  object STATUS_FAILURE extends TopLevel[STATUS_FAILURE with Double]
  
  /* 1 */ @js.native
  object STATUS_INVALID_BILLING_POSTAL_ADDRESS extends TopLevel[STATUS_INVALID_BILLING_POSTAL_ADDRESS with Double]
  
  /* 3 */ @js.native
  object STATUS_INVALID_SHIPPING_CONTACT extends TopLevel[STATUS_INVALID_SHIPPING_CONTACT with Double]
  
  /* 2 */ @js.native
  object STATUS_INVALID_SHIPPING_POSTAL_ADDRESS extends TopLevel[STATUS_INVALID_SHIPPING_POSTAL_ADDRESS with Double]
  
  /* 5 */ @js.native
  object STATUS_PIN_INCORRECT extends TopLevel[STATUS_PIN_INCORRECT with Double]
  
  /* 6 */ @js.native
  object STATUS_PIN_LOCKOUT extends TopLevel[STATUS_PIN_LOCKOUT with Double]
  
  /* 4 */ @js.native
  object STATUS_PIN_REQUIRED extends TopLevel[STATUS_PIN_REQUIRED with Double]
  
  /* 1 */ @js.native
  object STATUS_SUCCESS extends TopLevel[STATUS_SUCCESS with Double]
  
}

