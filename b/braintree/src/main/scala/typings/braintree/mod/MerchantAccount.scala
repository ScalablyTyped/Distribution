package typings.braintree.mod

import typings.braintree.anon.Active
import typings.braintree.anon.Bank
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("braintree", "MerchantAccount")
@js.native
open class MerchantAccount () extends StObject {
  
  var default: Boolean = js.native
  
  var business: js.UndefOr[MerchantBusinessResponse] = js.native
  
  var currencyIsoCode: String = js.native
  
  var funding: MerchantFunding = js.native
  
  var id: String = js.native
  
  var individual: MerchantIndividualResponse = js.native
  
  var masterMerchantAccount: js.UndefOr[MerchantAccount] = js.native
  
  var status: MerchantAccountStatus = js.native
}
/* static members */
object MerchantAccount {
  
  @JSImport("braintree", "MerchantAccount")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("braintree", "MerchantAccount.FundingDestination")
  @js.native
  def FundingDestination: Bank = js.native
  inline def FundingDestination_=(x: Bank): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FundingDestination")(x.asInstanceOf[js.Any])
  
  @JSImport("braintree", "MerchantAccount.Status")
  @js.native
  def Status: Active = js.native
  inline def Status_=(x: Active): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Status")(x.asInstanceOf[js.Any])
}
