package typings.carbonComponentsReact

import typings.react.mod.Component
import typings.react.mod.HTMLAttributes
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toggleSkeletonMod {
  
  @JSImport("carbon-components-react/lib/components/Toggle/Toggle.Skeleton", JSImport.Default)
  @js.native
  class default ()
    extends Component[ToggleSkeletonProps, js.Object, js.Any]
  
  type ToggleSkeleton = Component[ToggleSkeletonProps, js.Object, js.Any]
  
  trait ToggleSkeletonProps
    extends StObject
       with HTMLAttributes[HTMLDivElement] {
    
    var labelText: js.UndefOr[String] = js.undefined
  }
  object ToggleSkeletonProps {
    
    @scala.inline
    def apply(): ToggleSkeletonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToggleSkeletonProps]
    }
    
    @scala.inline
    implicit class ToggleSkeletonPropsMutableBuilder[Self <: ToggleSkeletonProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLabelText(value: String): Self = StObject.set(x, "labelText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelTextUndefined: Self = StObject.set(x, "labelText", js.undefined)
    }
  }
}
