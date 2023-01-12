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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FallbackInterval] (val x: Self) extends AnyVal {
      
      inline def setFallbackInterval(value: Double): Self = StObject.set(x, "fallbackInterval", value.asInstanceOf[js.Any])
      
      inline def setFallbackIntervalUndefined: Self = StObject.set(x, "fallbackInterval", js.undefined)
      
      inline def setOnclose(value: () => Unit): Self = StObject.set(x, "onclose", js.Any.fromFunction0(value))
      
      inline def setOncloseUndefined: Self = StObject.set(x, "onclose", js.undefined)
      
      inline def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
      
      inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
    }
  }
  
  trait MaxParallelWrites extends StObject {
    
    /**
      * Opening too many write files will throw an error.
      * So we ensure we throttle to have a max limit on writes.
      * @link https://stackoverflow.com/questions/8965606/node-and-error-emfile-too-many-open-files
      */
    var maxParallelWrites: js.UndefOr[Double] = js.undefined
    
    var ttl: js.UndefOr[Double] = js.undefined
    
    var useFastPath: js.UndefOr[Boolean] = js.undefined
  }
  object MaxParallelWrites {
    
    inline def apply(): MaxParallelWrites = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MaxParallelWrites]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MaxParallelWrites] (val x: Self) extends AnyVal {
      
      inline def setMaxParallelWrites(value: Double): Self = StObject.set(x, "maxParallelWrites", value.asInstanceOf[js.Any])
      
      inline def setMaxParallelWritesUndefined: Self = StObject.set(x, "maxParallelWrites", js.undefined)
      
      inline def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
      
      inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
      
      inline def setUseFastPath(value: Boolean): Self = StObject.set(x, "useFastPath", value.asInstanceOf[js.Any])
      
      inline def setUseFastPathUndefined: Self = StObject.set(x, "useFastPath", js.undefined)
    }
  }
}
