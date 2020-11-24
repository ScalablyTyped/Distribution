package typings.awsSdk.shieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubscriptionLimits extends js.Object {
  
  /**
    * Limits settings on protection groups for your subscription. 
    */
  var ProtectionGroupLimits: typings.awsSdk.shieldMod.ProtectionGroupLimits = js.native
  
  /**
    * Limits settings on protections for your subscription. 
    */
  var ProtectionLimits: typings.awsSdk.shieldMod.ProtectionLimits = js.native
}
object SubscriptionLimits {
  
  @scala.inline
  def apply(ProtectionGroupLimits: ProtectionGroupLimits, ProtectionLimits: ProtectionLimits): SubscriptionLimits = {
    val __obj = js.Dynamic.literal(ProtectionGroupLimits = ProtectionGroupLimits.asInstanceOf[js.Any], ProtectionLimits = ProtectionLimits.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionLimits]
  }
  
  @scala.inline
  implicit class SubscriptionLimitsOps[Self <: SubscriptionLimits] (val x: Self) extends AnyVal {
    
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
    def setProtectionGroupLimits(value: ProtectionGroupLimits): Self = this.set("ProtectionGroupLimits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtectionLimits(value: ProtectionLimits): Self = this.set("ProtectionLimits", value.asInstanceOf[js.Any])
  }
}
