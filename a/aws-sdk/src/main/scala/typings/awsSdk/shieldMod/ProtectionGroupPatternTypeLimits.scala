package typings.awsSdk.shieldMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProtectionGroupPatternTypeLimits extends StObject {
  
  /**
    * Limits settings on protection groups with arbitrary pattern type. 
    */
  var ArbitraryPatternLimits: ProtectionGroupArbitraryPatternLimits
}
object ProtectionGroupPatternTypeLimits {
  
  inline def apply(ArbitraryPatternLimits: ProtectionGroupArbitraryPatternLimits): ProtectionGroupPatternTypeLimits = {
    val __obj = js.Dynamic.literal(ArbitraryPatternLimits = ArbitraryPatternLimits.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProtectionGroupPatternTypeLimits]
  }
  
  extension [Self <: ProtectionGroupPatternTypeLimits](x: Self) {
    
    inline def setArbitraryPatternLimits(value: ProtectionGroupArbitraryPatternLimits): Self = StObject.set(x, "ArbitraryPatternLimits", value.asInstanceOf[js.Any])
  }
}
