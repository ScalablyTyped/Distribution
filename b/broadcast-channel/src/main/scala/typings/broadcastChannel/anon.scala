package typings.broadcastChannel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait FallbackInterval extends StObject {
    
    var fallbackInterval: js.UndefOr[Double] = js.undefined
    
    var onclose: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var ttl: js.UndefOr[Double] = js.undefined
  }
  object FallbackInterval {
    
    inline def apply(): FallbackInterval = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FallbackInterval]
    }
    
    extension [Self <: FallbackInterval](x: Self) {
      
      inline def setFallbackInterval(value: Double): Self = StObject.set(x, "fallbackInterval", value.asInstanceOf[js.Any])
      
      inline def setFallbackIntervalUndefined: Self = StObject.set(x, "fallbackInterval", js.undefined)
      
      inline def setOnclose(value: () => Unit): Self = StObject.set(x, "onclose", js.Any.fromFunction0(value))
      
      inline def setOncloseUndefined: Self = StObject.set(x, "onclose", js.undefined)
      
      inline def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
      
      inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
    }
  }
  
  trait Ttl extends StObject {
    
    var ttl: js.UndefOr[Double] = js.undefined
    
    var useFastPath: js.UndefOr[Boolean] = js.undefined
  }
  object Ttl {
    
    inline def apply(): Ttl = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Ttl]
    }
    
    extension [Self <: Ttl](x: Self) {
      
      inline def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
      
      inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
      
      inline def setUseFastPath(value: Boolean): Self = StObject.set(x, "useFastPath", value.asInstanceOf[js.Any])
      
      inline def setUseFastPathUndefined: Self = StObject.set(x, "useFastPath", js.undefined)
    }
  }
}
