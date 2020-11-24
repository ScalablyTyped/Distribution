package typings.braintree.anon

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AllowVaulting extends js.Object {
  
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
  implicit class AllowVaultingOps[Self <: AllowVaulting] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAllowVaulting(value: Boolean): Self = this.set("allowVaulting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowVaulting: Self = this.set("allowVaulting", js.undefined)
    
    @scala.inline
    def setIncludeBillingPostalCode(value: Boolean): Self = this.set("includeBillingPostalCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeBillingPostalCode: Self = this.set("includeBillingPostalCode", js.undefined)
    
    @scala.inline
    def setRevokeAfter(value: Date): Self = this.set("revokeAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRevokeAfter: Self = this.set("revokeAfter", js.undefined)
  }
}
