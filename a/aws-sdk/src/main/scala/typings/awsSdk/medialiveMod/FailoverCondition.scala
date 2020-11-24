package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FailoverCondition extends js.Object {
  
  /**
    * Failover condition type-specific settings.
    */
  var FailoverConditionSettings: js.UndefOr[typings.awsSdk.medialiveMod.FailoverConditionSettings] = js.native
}
object FailoverCondition {
  
  @scala.inline
  def apply(): FailoverCondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FailoverCondition]
  }
  
  @scala.inline
  implicit class FailoverConditionOps[Self <: FailoverCondition] (val x: Self) extends AnyVal {
    
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
    def setFailoverConditionSettings(value: FailoverConditionSettings): Self = this.set("FailoverConditionSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailoverConditionSettings: Self = this.set("FailoverConditionSettings", js.undefined)
  }
}
