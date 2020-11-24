package typings.awsSdk.shieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProtectionGroupLimits extends js.Object {
  
  /**
    * The maximum number of protection groups that you can have at one time. 
    */
  var MaxProtectionGroups: Long = js.native
  
  /**
    * Limits settings by pattern type in the protection groups for your subscription. 
    */
  var PatternTypeLimits: ProtectionGroupPatternTypeLimits = js.native
}
object ProtectionGroupLimits {
  
  @scala.inline
  def apply(MaxProtectionGroups: Long, PatternTypeLimits: ProtectionGroupPatternTypeLimits): ProtectionGroupLimits = {
    val __obj = js.Dynamic.literal(MaxProtectionGroups = MaxProtectionGroups.asInstanceOf[js.Any], PatternTypeLimits = PatternTypeLimits.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProtectionGroupLimits]
  }
  
  @scala.inline
  implicit class ProtectionGroupLimitsOps[Self <: ProtectionGroupLimits] (val x: Self) extends AnyVal {
    
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
    def setMaxProtectionGroups(value: Long): Self = this.set("MaxProtectionGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatternTypeLimits(value: ProtectionGroupPatternTypeLimits): Self = this.set("PatternTypeLimits", value.asInstanceOf[js.Any])
  }
}
