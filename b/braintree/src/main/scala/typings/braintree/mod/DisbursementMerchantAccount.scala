package typings.braintree.mod

import typings.braintree.braintreeStrings.active_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisbursementMerchantAccount extends StObject {
  
  var id: String
  
  var status: active_
  
  var subMerchantAccount: Boolean
}
object DisbursementMerchantAccount {
  
  inline def apply(id: String, subMerchantAccount: Boolean): DisbursementMerchantAccount = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], status = "active", subMerchantAccount = subMerchantAccount.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisbursementMerchantAccount]
  }
  
  extension [Self <: DisbursementMerchantAccount](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: active_): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setSubMerchantAccount(value: Boolean): Self = StObject.set(x, "subMerchantAccount", value.asInstanceOf[js.Any])
  }
}
