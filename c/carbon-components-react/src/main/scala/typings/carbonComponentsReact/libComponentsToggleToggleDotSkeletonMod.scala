package typings.carbonComponentsReact

import typings.carbonComponentsReact.carbonComponentsReactStrings.md
import typings.carbonComponentsReact.carbonComponentsReactStrings.sm
import typings.react.mod.Component
import typings.react.mod.HTMLAttributes
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsToggleToggleDotSkeletonMod {
  
  @JSImport("carbon-components-react/lib/components/Toggle/Toggle.Skeleton", JSImport.Default)
  @js.native
  open class default ()
    extends Component[ToggleSkeletonProps, js.Object, Any]
  
  type ToggleSkeleton = Component[ToggleSkeletonProps, js.Object, Any]
  
  trait ToggleSkeletonProps
    extends StObject
       with HTMLAttributes[HTMLDivElement] {
    
    var labelText: js.UndefOr[String] = js.undefined
    
    var size: js.UndefOr[sm | md] = js.undefined
  }
  object ToggleSkeletonProps {
    
    inline def apply(): ToggleSkeletonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToggleSkeletonProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ToggleSkeletonProps] (val x: Self) extends AnyVal {
      
      inline def setLabelText(value: String): Self = StObject.set(x, "labelText", value.asInstanceOf[js.Any])
      
      inline def setLabelTextUndefined: Self = StObject.set(x, "labelText", js.undefined)
      
      inline def setSize(value: sm | md): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
}
