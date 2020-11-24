package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OwnershipControls extends js.Object {
  
  /**
    * The container element for an ownership control rule.
    */
  var Rules: OwnershipControlsRules = js.native
}
object OwnershipControls {
  
  @scala.inline
  def apply(Rules: OwnershipControlsRules): OwnershipControls = {
    val __obj = js.Dynamic.literal(Rules = Rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[OwnershipControls]
  }
  
  @scala.inline
  implicit class OwnershipControlsOps[Self <: OwnershipControls] (val x: Self) extends AnyVal {
    
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
    def setRulesVarargs(value: OwnershipControlsRule*): Self = this.set("Rules", js.Array(value :_*))
    
    @scala.inline
    def setRules(value: OwnershipControlsRules): Self = this.set("Rules", value.asInstanceOf[js.Any])
  }
}
