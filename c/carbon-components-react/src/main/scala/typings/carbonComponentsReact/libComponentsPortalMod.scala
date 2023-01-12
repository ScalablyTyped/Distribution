package typings.carbonComponentsReact

import typings.react.mod.FC
import typings.react.mod.MutableRefObject
import typings.react.mod.ReactNode
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsPortalMod {
  
  @JSImport("carbon-components-react/lib/components/Portal", "Portal")
  @js.native
  val Portal: FC[PortalProps] = js.native
  
  trait PortalProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var container: js.UndefOr[MutableRefObject[Element]] = js.undefined
  }
  object PortalProps {
    
    inline def apply(): PortalProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PortalProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PortalProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setContainer(value: MutableRefObject[Element]): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    }
  }
}
