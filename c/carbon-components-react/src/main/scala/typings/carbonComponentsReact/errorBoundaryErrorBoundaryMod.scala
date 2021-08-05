package typings.carbonComponentsReact

import typings.react.mod.Component
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorBoundaryErrorBoundaryMod {
  
  @JSImport("carbon-components-react/lib/components/ErrorBoundary/ErrorBoundary", JSImport.Default)
  @js.native
  class default ()
    extends Component[ErrorBoundaryProps, js.Object, js.Any]
  
  type ErrorBoundary = Component[ErrorBoundaryProps, js.Object, js.Any]
  
  trait ErrorBoundaryProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var fallback: js.UndefOr[ReactNode] = js.undefined
  }
  object ErrorBoundaryProps {
    
    inline def apply(): ErrorBoundaryProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ErrorBoundaryProps]
    }
    
    extension [Self <: ErrorBoundaryProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setFallback(value: ReactNode): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
      
      inline def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
    }
  }
}
