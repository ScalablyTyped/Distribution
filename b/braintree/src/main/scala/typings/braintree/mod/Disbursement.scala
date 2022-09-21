package typings.braintree.mod

import typings.braintree.anon.Credit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("braintree", "Disbursement")
@js.native
open class Disbursement () extends StObject {
  
  var amount: String = js.native
  
  var disbursementDate: js.Date = js.native
  
  var disbursementType: DisbursementType = js.native
  
  var exceptionMessage: js.UndefOr[DisbursementExceptionMessage] = js.native
  
  var followUpAction: js.UndefOr[DisbursementFollowUpAction] = js.native
  
  var id: String = js.native
  
  var merchantAccount: DisbursementMerchantAccount = js.native
  
  var retry: Boolean = js.native
  
  var success: Boolean = js.native
  
  var transactionIds: js.Array[String] = js.native
}
/* static members */
object Disbursement {
  
  @JSImport("braintree", "Disbursement")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("braintree", "Disbursement.Types")
  @js.native
  def Types: Credit = js.native
  inline def Types_=(x: Credit): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Types")(x.asInstanceOf[js.Any])
}
