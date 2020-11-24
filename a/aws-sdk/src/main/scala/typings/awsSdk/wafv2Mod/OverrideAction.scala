package typings.awsSdk.wafv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OverrideAction extends js.Object {
  
  /**
    * Override the rule action setting to count.
    */
  var Count: js.UndefOr[CountAction] = js.native
  
  /**
    * Don't override the rule action setting.
    */
  var None: js.UndefOr[NoneAction] = js.native
}
object OverrideAction {
  
  @scala.inline
  def apply(): OverrideAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OverrideAction]
  }
  
  @scala.inline
  implicit class OverrideActionOps[Self <: OverrideAction] (val x: Self) extends AnyVal {
    
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
    def setCount(value: CountAction): Self = this.set("Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCount: Self = this.set("Count", js.undefined)
    
    @scala.inline
    def setNone(value: NoneAction): Self = this.set("None", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNone: Self = this.set("None", js.undefined)
  }
}
