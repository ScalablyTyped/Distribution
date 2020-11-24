package typings.awsSdk.wafv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetRateBasedStatementManagedKeysResponse extends js.Object {
  
  /**
    * The keys that are of Internet Protocol version 4 (IPv4). 
    */
  var ManagedKeysIPV4: js.UndefOr[RateBasedStatementManagedKeysIPSet] = js.native
  
  /**
    * The keys that are of Internet Protocol version 6 (IPv6). 
    */
  var ManagedKeysIPV6: js.UndefOr[RateBasedStatementManagedKeysIPSet] = js.native
}
object GetRateBasedStatementManagedKeysResponse {
  
  @scala.inline
  def apply(): GetRateBasedStatementManagedKeysResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRateBasedStatementManagedKeysResponse]
  }
  
  @scala.inline
  implicit class GetRateBasedStatementManagedKeysResponseOps[Self <: GetRateBasedStatementManagedKeysResponse] (val x: Self) extends AnyVal {
    
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
    def setManagedKeysIPV4(value: RateBasedStatementManagedKeysIPSet): Self = this.set("ManagedKeysIPV4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManagedKeysIPV4: Self = this.set("ManagedKeysIPV4", js.undefined)
    
    @scala.inline
    def setManagedKeysIPV6(value: RateBasedStatementManagedKeysIPSet): Self = this.set("ManagedKeysIPV6", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManagedKeysIPV6: Self = this.set("ManagedKeysIPV6", js.undefined)
  }
}
