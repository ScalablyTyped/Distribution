package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsUishellSideNavDetailsMod extends Shortcut {
  
  @JSImport("carbon-components-react/lib/components/UIShell/SideNavDetails", JSImport.Default)
  @js.native
  val default: FC[SideNavDetailsProps] = js.native
  
  trait SideNavDetailsProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var title: String
  }
  object SideNavDetailsProps {
    
    inline def apply(title: String): SideNavDetailsProps = {
      val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[SideNavDetailsProps]
    }
    
    extension [Self <: SideNavDetailsProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = FC[SideNavDetailsProps]
  
  /* This means you don't have to write `default`, but can instead just say `libComponentsUishellSideNavDetailsMod.foo` */
  override def _to: FC[SideNavDetailsProps] = default
}
