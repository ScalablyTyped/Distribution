package typings.braintree.mod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("braintree", "CreditCard")
@js.native
class CreditCard ()
  extends StObject
     with PaymentMethod {
  
  var default: Boolean = js.native
  
  var billingAddress: js.UndefOr[Address] = js.native
  
  var bin: String = js.native
  
  var cardType: String = js.native
  
  var cardholderName: js.UndefOr[String] = js.native
  
  var commercial: Commercial = js.native
  
  var countryOfIssuance: String = js.native
  
  var createdAt: Date = js.native
  
  var customerId: String = js.native
  
  var customerLocation: CustomerLocation = js.native
  
  var debit: String = js.native
  
  var durbinRegulated: DurbinRegulated = js.native
  
  var expirationDate: js.UndefOr[String] = js.native
  
  var expirationMonth: js.UndefOr[String] = js.native
  
  var expirationYear: js.UndefOr[String] = js.native
  
  var expired: Boolean = js.native
  
  var healthcare: HealthCare = js.native
  
  var imageUrl: String = js.native
  
  var issuingBank: String = js.native
  
  var last4: String = js.native
  
  var maskedNumber: String = js.native
  
  var payroll: Payroll = js.native
  
  var prepaid: Prepaid = js.native
  
  var productId: String = js.native
  
  var subscriptions: js.UndefOr[js.Array[Subscription]] = js.native
  
  var token: String = js.native
  
  var uniqueNumberIdentifier: String = js.native
  
  var updatedAt: Date = js.native
  
  var verification: js.UndefOr[CreditCardVerification] = js.native
}
