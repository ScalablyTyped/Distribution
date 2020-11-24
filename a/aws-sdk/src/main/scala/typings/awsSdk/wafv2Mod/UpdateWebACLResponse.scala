package typings.awsSdk.wafv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateWebACLResponse extends js.Object {
  
  /**
    * A token used for optimistic locking. AWS WAF returns this token to your update requests. You use NextLockToken in the same manner as you use LockToken. 
    */
  var NextLockToken: js.UndefOr[LockToken] = js.native
}
object UpdateWebACLResponse {
  
  @scala.inline
  def apply(): UpdateWebACLResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateWebACLResponse]
  }
  
  @scala.inline
  implicit class UpdateWebACLResponseOps[Self <: UpdateWebACLResponse] (val x: Self) extends AnyVal {
    
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
    def setNextLockToken(value: LockToken): Self = this.set("NextLockToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextLockToken: Self = this.set("NextLockToken", js.undefined)
  }
}
