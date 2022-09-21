package typings.braintree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("braintree", "AndroidPayCard")
@js.native
open class AndroidPayCard ()
  extends StObject
     with PaymentMethod {
  
  var default: Boolean = js.native
  
  var bin: String = js.native
  
  var createdAt: String = js.native
  
  var customerId: String = js.native
  
  var expirationMonth: String = js.native
  
  var expirationYear: String = js.native
  
  var googleTransactionId: String = js.native
  
  var imageUrl: String = js.native
  
  var sourceCardLast4: String = js.native
  
  var sourceCardType: String = js.native
  
  var sourceDescription: String = js.native
  
  var subscriptions: js.UndefOr[js.Array[Subscription]] = js.native
  
  var token: String = js.native
  
  var updatedAt: String = js.native
  
  var virtualCardLast4: String = js.native
  
  var virtualCardType: String = js.native
}
