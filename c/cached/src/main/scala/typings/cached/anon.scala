package typings.cached

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Expire extends StObject {
    
    var expire: Double
    
    var freshFor: Double
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object Expire {
    
    inline def apply(expire: Double, freshFor: Double): Expire = {
      val __obj = js.Dynamic.literal(expire = expire.asInstanceOf[js.Any], freshFor = freshFor.asInstanceOf[js.Any])
      __obj.asInstanceOf[Expire]
    }
    
    extension [Self <: Expire](x: Self) {
      
      inline def setExpire(value: Double): Self = StObject.set(x, "expire", value.asInstanceOf[js.Any])
      
      inline def setFreshFor(value: Double): Self = StObject.set(x, "freshFor", value.asInstanceOf[js.Any])
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
}
