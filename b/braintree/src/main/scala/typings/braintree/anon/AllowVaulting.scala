package typings.braintree.anon

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AllowVaulting extends StObject {
  
  var allowVaulting: js.UndefOr[Boolean] = js.native
  
  var includeBillingPostalCode: js.UndefOr[Boolean] = js.native
  
  var revokeAfter: js.UndefOr[Date] = js.native
}
object AllowVaulting {
  
  @scala.inline
  def apply(): AllowVaulting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowVaulting]
  }
  
  @scala.inline
  implicit class AllowVaultingMutableBuilder[Self <: AllowVaulting] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowVaulting(value: Boolean): Self = StObject.set(x, "allowVaulting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowVaultingUndefined: Self = StObject.set(x, "allowVaulting", js.undefined)
    
    @scala.inline
    def setIncludeBillingPostalCode(value: Boolean): Self = StObject.set(x, "includeBillingPostalCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeBillingPostalCodeUndefined: Self = StObject.set(x, "includeBillingPostalCode", js.undefined)
    
    @scala.inline
    def setRevokeAfter(value: Date): Self = StObject.set(x, "revokeAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevokeAfterUndefined: Self = StObject.set(x, "revokeAfter", js.undefined)
  }
}
