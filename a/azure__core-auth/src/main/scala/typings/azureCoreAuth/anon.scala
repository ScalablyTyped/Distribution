package typings.azureCoreAuth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Timeout extends StObject {
    
    /**
      * The number of milliseconds a request can take before automatically being terminated.
      */
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object Timeout {
    
    inline def apply(): Timeout = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Timeout]
    }
    
    extension [Self <: Timeout](x: Self) {
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  trait TracingContext extends StObject {
    
    /**
      * Tracing Context for the current request.
      */
    var tracingContext: js.UndefOr[typings.azureCoreAuth.mod.TracingContext] = js.undefined
  }
  object TracingContext {
    
    inline def apply(): TracingContext = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TracingContext]
    }
    
    extension [Self <: TracingContext](x: Self) {
      
      inline def setTracingContext(value: typings.azureCoreAuth.mod.TracingContext): Self = StObject.set(x, "tracingContext", value.asInstanceOf[js.Any])
      
      inline def setTracingContextUndefined: Self = StObject.set(x, "tracingContext", js.undefined)
    }
  }
}
