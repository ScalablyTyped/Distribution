package typings.carbonComponentsReact

import typings.react.mod.Context
import typings.react.mod.ErrorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsErrorBoundaryErrorBoundaryContextMod {
  
  @JSImport("carbon-components-react/lib/components/ErrorBoundary/ErrorBoundaryContext", "ErrorBoundaryContext")
  @js.native
  val ErrorBoundaryContext: Context[ErrorBoundaryContextValue] = js.native
  
  trait ErrorBoundaryContextValue extends StObject {
    
    var log: js.UndefOr[js.Function2[/* error */ js.Error, /* errorInfo */ ErrorInfo, Unit]] = js.undefined
  }
  object ErrorBoundaryContextValue {
    
    inline def apply(): ErrorBoundaryContextValue = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ErrorBoundaryContextValue]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ErrorBoundaryContextValue] (val x: Self) extends AnyVal {
      
      inline def setLog(value: (/* error */ js.Error, /* errorInfo */ ErrorInfo) => Unit): Self = StObject.set(x, "log", js.Any.fromFunction2(value))
      
      inline def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
    }
  }
}
