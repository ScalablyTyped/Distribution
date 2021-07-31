package typings.braintree.mod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("braintree", "ApplePayCard")
@js.native
class ApplePayCard ()
  extends StObject
     with PaymentMethod {
  
  var default: Boolean = js.native
  
  var bin: String = js.native
  
  var cardType: String = js.native
  
  var cardholderName: String = js.native
  
  var createdAt: Date = js.native
  
  var customerId: String = js.native
  
  var expirationMonth: String = js.native
  
  var expirationYear: String = js.native
  
  var expired: Boolean = js.native
  
  var imageUrl: String = js.native
  
  var last4: String = js.native
  
  var paymentInsuranceName: String = js.native
  
  var sourceDescription: String = js.native
  
  var subscriptions: js.UndefOr[js.Array[Subscription]] = js.native
  
  var token: String = js.native
  
  var updatedAt: Date = js.native
}
