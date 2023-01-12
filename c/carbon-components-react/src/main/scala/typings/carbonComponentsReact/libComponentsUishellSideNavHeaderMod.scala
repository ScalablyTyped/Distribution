package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.carbonComponentsReact.typingsSharedMod.SideNavSharedProps
import typings.react.mod.FC
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsUishellSideNavHeaderMod extends Shortcut {
  
  @JSImport("carbon-components-react/lib/components/UIShell/SideNavHeader", JSImport.Default)
  @js.native
  val default: FC[SideNavHeaderProps] = js.native
  
  trait SideNavHeaderProps
    extends StObject
       with SideNavSharedProps {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var renderIcon: Any
  }
  object SideNavHeaderProps {
    
    inline def apply(renderIcon: Any): SideNavHeaderProps = {
      val __obj = js.Dynamic.literal(renderIcon = renderIcon.asInstanceOf[js.Any])
      __obj.asInstanceOf[SideNavHeaderProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SideNavHeaderProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setRenderIcon(value: Any): Self = StObject.set(x, "renderIcon", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = FC[SideNavHeaderProps]
  
  /* This means you don't have to write `default`, but can instead just say `libComponentsUishellSideNavHeaderMod.foo` */
  override def _to: FC[SideNavHeaderProps] = default
}
