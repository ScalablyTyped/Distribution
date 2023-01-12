package typings.braintree.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllowVaulting extends StObject {
  
  var allowVaulting: js.UndefOr[Boolean] = js.undefined
  
  var includeBillingPostalCode: js.UndefOr[Boolean] = js.undefined
  
  var revokeAfter: js.UndefOr[js.Date] = js.undefined
}
object AllowVaulting {
  
  inline def apply(): AllowVaulting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowVaulting]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AllowVaulting] (val x: Self) extends AnyVal {
    
    inline def setAllowVaulting(value: Boolean): Self = StObject.set(x, "allowVaulting", value.asInstanceOf[js.Any])
    
    inline def setAllowVaultingUndefined: Self = StObject.set(x, "allowVaulting", js.undefined)
    
    inline def setIncludeBillingPostalCode(value: Boolean): Self = StObject.set(x, "includeBillingPostalCode", value.asInstanceOf[js.Any])
    
    inline def setIncludeBillingPostalCodeUndefined: Self = StObject.set(x, "includeBillingPostalCode", js.undefined)
    
    inline def setRevokeAfter(value: js.Date): Self = StObject.set(x, "revokeAfter", value.asInstanceOf[js.Any])
    
    inline def setRevokeAfterUndefined: Self = StObject.set(x, "revokeAfter", js.undefined)
  }
}
