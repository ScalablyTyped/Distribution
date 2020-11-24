package typings.braintreeWebDropIn.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AllowVaultCardOverride extends js.Object {
  
  var allowVaultCardOverride: js.UndefOr[Boolean] = js.native
  
  var vaultCard: js.UndefOr[Boolean] = js.native
}
object AllowVaultCardOverride {
  
  @scala.inline
  def apply(): AllowVaultCardOverride = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowVaultCardOverride]
  }
  
  @scala.inline
  implicit class AllowVaultCardOverrideOps[Self <: AllowVaultCardOverride] (val x: Self) extends AnyVal {
    
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
    def setAllowVaultCardOverride(value: Boolean): Self = this.set("allowVaultCardOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowVaultCardOverride: Self = this.set("allowVaultCardOverride", js.undefined)
    
    @scala.inline
    def setVaultCard(value: Boolean): Self = this.set("vaultCard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVaultCard: Self = this.set("vaultCard", js.undefined)
  }
}
