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
    
    @scala.inline
    def apply(): ErrorBoundaryProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ErrorBoundaryProps]
    }
    
    @scala.inline
    implicit class ErrorBoundaryPropsMutableBuilder[Self <: ErrorBoundaryProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setFallback(value: ReactNode): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
    }
  }
}
