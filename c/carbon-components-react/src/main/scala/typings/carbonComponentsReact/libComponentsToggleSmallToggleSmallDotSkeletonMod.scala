package typings.carbonComponentsReact

import typings.react.mod.Component
import typings.react.mod.HTMLAttributes
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsToggleSmallToggleSmallDotSkeletonMod {
  
  @JSImport("carbon-components-react/lib/components/ToggleSmall/ToggleSmall.Skeleton", JSImport.Default)
  @js.native
  open class default ()
    extends Component[ToggleSmallSkeletonProps, js.Object, Any]
  
  type ToggleSmallSkeleton = Component[ToggleSmallSkeletonProps, js.Object, Any]
  
  trait ToggleSmallSkeletonProps
    extends StObject
       with HTMLAttributes[HTMLDivElement] {
    
    var labelText: js.UndefOr[String] = js.undefined
  }
  object ToggleSmallSkeletonProps {
    
    inline def apply(): ToggleSmallSkeletonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToggleSmallSkeletonProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ToggleSmallSkeletonProps] (val x: Self) extends AnyVal {
      
      inline def setLabelText(value: String): Self = StObject.set(x, "labelText", value.asInstanceOf[js.Any])
      
      inline def setLabelTextUndefined: Self = StObject.set(x, "labelText", js.undefined)
    }
  }
}
