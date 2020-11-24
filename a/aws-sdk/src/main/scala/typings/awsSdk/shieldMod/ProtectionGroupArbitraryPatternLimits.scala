package typings.awsSdk.shieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProtectionGroupArbitraryPatternLimits extends js.Object {
  
  /**
    * The maximum number of resources you can specify for a single arbitrary pattern in a protection group.
    */
  var MaxMembers: Long = js.native
}
object ProtectionGroupArbitraryPatternLimits {
  
  @scala.inline
  def apply(MaxMembers: Long): ProtectionGroupArbitraryPatternLimits = {
    val __obj = js.Dynamic.literal(MaxMembers = MaxMembers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProtectionGroupArbitraryPatternLimits]
  }
  
  @scala.inline
  implicit class ProtectionGroupArbitraryPatternLimitsOps[Self <: ProtectionGroupArbitraryPatternLimits] (val x: Self) extends AnyVal {
    
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
    def setMaxMembers(value: Long): Self = this.set("MaxMembers", value.asInstanceOf[js.Any])
  }
}
