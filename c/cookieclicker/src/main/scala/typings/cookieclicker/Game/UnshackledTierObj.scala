package typings.cookieclicker.Game

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnshackledTierObj extends StObject {
  
  var q: String
  
  var tier: Double
}
object UnshackledTierObj {
  
  inline def apply(q: String, tier: Double): UnshackledTierObj = {
    val __obj = js.Dynamic.literal(q = q.asInstanceOf[js.Any], tier = tier.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnshackledTierObj]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UnshackledTierObj] (val x: Self) extends AnyVal {
    
    inline def setQ(value: String): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
    
    inline def setTier(value: Double): Self = StObject.set(x, "tier", value.asInstanceOf[js.Any])
  }
}
