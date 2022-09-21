package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountAttributesMessage extends StObject {
  
  /**
    * A list of AccountQuota objects. Within this list, each quota has a name, a count of usage toward the quota maximum, and a maximum value for the quota.
    */
  var AccountQuotas: js.UndefOr[AccountQuotaList] = js.undefined
}
object AccountAttributesMessage {
  
  inline def apply(): AccountAttributesMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountAttributesMessage]
  }
  
  extension [Self <: AccountAttributesMessage](x: Self) {
    
    inline def setAccountQuotas(value: AccountQuotaList): Self = StObject.set(x, "AccountQuotas", value.asInstanceOf[js.Any])
    
    inline def setAccountQuotasUndefined: Self = StObject.set(x, "AccountQuotas", js.undefined)
    
    inline def setAccountQuotasVarargs(value: AccountQuota*): Self = StObject.set(x, "AccountQuotas", js.Array(value*))
  }
}
