package typings.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetAccountBalanceResponse extends js.Object {
  
  var AvailableBalance: js.UndefOr[CurrencyAmount] = js.native
  
  var OnHoldBalance: js.UndefOr[CurrencyAmount] = js.native
}
object GetAccountBalanceResponse {
  
  @scala.inline
  def apply(): GetAccountBalanceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAccountBalanceResponse]
  }
  
  @scala.inline
  implicit class GetAccountBalanceResponseOps[Self <: GetAccountBalanceResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAvailableBalance(value: CurrencyAmount): Self = this.set("AvailableBalance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvailableBalance: Self = this.set("AvailableBalance", js.undefined)
    
    @scala.inline
    def setOnHoldBalance(value: CurrencyAmount): Self = this.set("OnHoldBalance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnHoldBalance: Self = this.set("OnHoldBalance", js.undefined)
  }
}
