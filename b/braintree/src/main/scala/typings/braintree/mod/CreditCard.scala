package typings.braintree.mod

import typings.braintree.anon.All
import typings.braintree.anon.International
import typings.braintree.anon.No
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("braintree", "CreditCard")
@js.native
open class CreditCard ()
  extends StObject
     with PaymentMethod {
  
  var default: Boolean = js.native
  
  var billingAddress: js.UndefOr[Address] = js.native
  
  var bin: String = js.native
  
  var cardType: String = js.native
  
  var cardholderName: js.UndefOr[String] = js.native
  
  var commercial: Commercial = js.native
  
  var countryOfIssuance: String = js.native
  
  var createdAt: String = js.native
  
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
  
  var updatedAt: String = js.native
  
  var verification: js.UndefOr[CreditCardVerification] = js.native
}
/* static members */
object CreditCard {
  
  @JSImport("braintree", "CreditCard")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("braintree", "CreditCard.CardType")
  @js.native
  def CardType: All = js.native
  
  @JSImport("braintree", "CreditCard.CardTypeIndicator")
  @js.native
  def CardTypeIndicator: No = js.native
  inline def CardTypeIndicator_=(x: No): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CardTypeIndicator")(x.asInstanceOf[js.Any])
  
  inline def CardType_=(x: All): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CardType")(x.asInstanceOf[js.Any])
  
  @JSImport("braintree", "CreditCard.CustomerLocation")
  @js.native
  def CustomerLocation: International = js.native
  inline def CustomerLocation_=(x: International): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CustomerLocation")(x.asInstanceOf[js.Any])
}
