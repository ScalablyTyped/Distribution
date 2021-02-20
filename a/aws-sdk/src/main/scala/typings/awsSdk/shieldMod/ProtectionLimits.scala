package typings.awsSdk.shieldMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProtectionLimits extends StObject {
  
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
  implicit class ProtectionLimitsMutableBuilder[Self <: ProtectionLimits] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProtectedResourceTypeLimits(value: Limits): Self = StObject.set(x, "ProtectedResourceTypeLimits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtectedResourceTypeLimitsVarargs(value: Limit*): Self = StObject.set(x, "ProtectedResourceTypeLimits", js.Array(value :_*))
  }
}
