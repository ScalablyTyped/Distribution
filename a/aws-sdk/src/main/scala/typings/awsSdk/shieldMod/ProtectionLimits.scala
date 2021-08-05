package typings.awsSdk.shieldMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProtectionLimits extends StObject {
  
  /**
    * The maximum number of resource types that you can specify in a protection.
    */
  var ProtectedResourceTypeLimits: Limits
}
object ProtectionLimits {
  
  inline def apply(ProtectedResourceTypeLimits: Limits): ProtectionLimits = {
    val __obj = js.Dynamic.literal(ProtectedResourceTypeLimits = ProtectedResourceTypeLimits.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProtectionLimits]
  }
  
  extension [Self <: ProtectionLimits](x: Self) {
    
    inline def setProtectedResourceTypeLimits(value: Limits): Self = StObject.set(x, "ProtectedResourceTypeLimits", value.asInstanceOf[js.Any])
    
    inline def setProtectedResourceTypeLimitsVarargs(value: Limit*): Self = StObject.set(x, "ProtectedResourceTypeLimits", js.Array(value :_*))
  }
}
