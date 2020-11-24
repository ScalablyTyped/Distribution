package typings.awsSdk.wafv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultAction extends js.Object {
  
  /**
    * Specifies that AWS WAF should allow requests by default.
    */
  var Allow: js.UndefOr[AllowAction] = js.native
  
  /**
    * Specifies that AWS WAF should block requests by default. 
    */
  var Block: js.UndefOr[BlockAction] = js.native
}
object DefaultAction {
  
  @scala.inline
  def apply(): DefaultAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultAction]
  }
  
  @scala.inline
  implicit class DefaultActionOps[Self <: DefaultAction] (val x: Self) extends AnyVal {
    
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
    def setAllow(value: AllowAction): Self = this.set("Allow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllow: Self = this.set("Allow", js.undefined)
    
    @scala.inline
    def setBlock(value: BlockAction): Self = this.set("Block", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlock: Self = this.set("Block", js.undefined)
  }
}
