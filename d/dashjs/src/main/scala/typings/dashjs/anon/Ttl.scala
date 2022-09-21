package typings.dashjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ttl extends StObject {
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var ttl: js.UndefOr[Double] = js.undefined
}
object Ttl {
  
  inline def apply(): Ttl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Ttl]
  }
  
  extension [Self <: Ttl](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
    
    inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
  }
}
