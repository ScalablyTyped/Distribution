package typings.carbonComponentsReact

import typings.react.mod.Component
import typings.react.mod.HTMLAttributes
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toggleSmallSkeletonMod {
  
  @JSImport("carbon-components-react/lib/components/ToggleSmall/ToggleSmall.Skeleton", JSImport.Default)
  @js.native
  class default ()
    extends Component[ToggleSmallSkeletonProps, js.Object, js.Any]
  
  type ToggleSmallSkeleton = Component[ToggleSmallSkeletonProps, js.Object, js.Any]
  
  trait ToggleSmallSkeletonProps
    extends StObject
       with HTMLAttributes[HTMLDivElement] {
    
    var labelText: js.UndefOr[String] = js.undefined
  }
  object ToggleSmallSkeletonProps {
    
    @scala.inline
    def apply(): ToggleSmallSkeletonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToggleSmallSkeletonProps]
    }
    
    @scala.inline
    implicit class ToggleSmallSkeletonPropsMutableBuilder[Self <: ToggleSmallSkeletonProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLabelText(value: String): Self = StObject.set(x, "labelText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelTextUndefined: Self = StObject.set(x, "labelText", js.undefined)
    }
  }
}
