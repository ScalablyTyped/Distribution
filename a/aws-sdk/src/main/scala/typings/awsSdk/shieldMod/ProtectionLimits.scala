package typings.awsSdk.shieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProtectionLimits extends js.Object {
  
  /**
    * The maximum number of resource types that you can specify in a protection.
    */
  var ProtectedResourceTypeLimits: Limits = js.native
}
object ProtectionLimits {
  
  @scala.inline
  def apply(ProtectedResourceTypeLimits: Limits): ProtectionLimits = {
    val __obj = js.Dynamic.literal(ProtectedResourceTypeLimits = ProtectedResourceTypeLimits.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProtectionLimits]
  }
  
  @scala.inline
  implicit class ProtectionLimitsOps[Self <: ProtectionLimits] (val x: Self) extends AnyVal {
    
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
    def setProtectedResourceTypeLimitsVarargs(value: Limit*): Self = this.set("ProtectedResourceTypeLimits", js.Array(value :_*))
    
    @scala.inline
    def setProtectedResourceTypeLimits(value: Limits): Self = this.set("ProtectedResourceTypeLimits", value.asInstanceOf[js.Any])
  }
}
