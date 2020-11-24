package typings.awsSdk.shieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProtectionGroupPatternTypeLimits extends js.Object {
  
  /**
    * Limits settings on protection groups with arbitrary pattern type. 
    */
  var ArbitraryPatternLimits: ProtectionGroupArbitraryPatternLimits = js.native
}
object ProtectionGroupPatternTypeLimits {
  
  @scala.inline
  def apply(ArbitraryPatternLimits: ProtectionGroupArbitraryPatternLimits): ProtectionGroupPatternTypeLimits = {
    val __obj = js.Dynamic.literal(ArbitraryPatternLimits = ArbitraryPatternLimits.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProtectionGroupPatternTypeLimits]
  }
  
  @scala.inline
  implicit class ProtectionGroupPatternTypeLimitsOps[Self <: ProtectionGroupPatternTypeLimits] (val x: Self) extends AnyVal {
    
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
    def setArbitraryPatternLimits(value: ProtectionGroupArbitraryPatternLimits): Self = this.set("ArbitraryPatternLimits", value.asInstanceOf[js.Any])
  }
}
