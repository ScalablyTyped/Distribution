package typings.braintree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("braintree", "MerchantAccount")
@js.native
class MerchantAccount () extends StObject {
  
  var default: Boolean = js.native
  
  var business: js.UndefOr[MerchantBusinessResponse] = js.native
  
  var currencyIsoCode: String = js.native
  
  var funding: MerchantFunding = js.native
  
  var id: String = js.native
  
  var individual: MerchantIndividualResponse = js.native
  
  var masterMerchantAccount: js.UndefOr[MerchantAccount] = js.native
  
  var status: MerchantAccountStatus = js.native
}
