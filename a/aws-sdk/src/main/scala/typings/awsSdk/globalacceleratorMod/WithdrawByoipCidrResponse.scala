package typings.awsSdk.globalacceleratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WithdrawByoipCidrResponse extends js.Object {
  
  /**
    * Information about the address pool.
    */
  var ByoipCidr: js.UndefOr[typings.awsSdk.globalacceleratorMod.ByoipCidr] = js.native
}
object WithdrawByoipCidrResponse {
  
  @scala.inline
  def apply(): WithdrawByoipCidrResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WithdrawByoipCidrResponse]
  }
  
  @scala.inline
  implicit class WithdrawByoipCidrResponseOps[Self <: WithdrawByoipCidrResponse] (val x: Self) extends AnyVal {
    
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
    def setByoipCidr(value: ByoipCidr): Self = this.set("ByoipCidr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteByoipCidr: Self = this.set("ByoipCidr", js.undefined)
  }
}
