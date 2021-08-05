package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.carbonComponentsReact.typingsSharedMod.RequiresChildrenProps
import typings.carbonComponentsReact.typingsSharedMod.SideNavSizingProps
import typings.react.mod.FC
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sideNavItemMod extends Shortcut {
  
  @JSImport("carbon-components-react/lib/components/UIShell/SideNavItem", JSImport.Default)
  @js.native
  val default: FC[SideNavItemProps] = js.native
  
  trait SideNavItemProps
    extends StObject
       with RequiresChildrenProps[ReactNode]
       with SideNavSizingProps {
    
    var className: js.UndefOr[String] = js.undefined
  }
  object SideNavItemProps {
    
    inline def apply(): SideNavItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SideNavItemProps]
    }
    
    extension [Self <: SideNavItemProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    }
  }
  
  type _To = FC[SideNavItemProps]
  
  /* This means you don't have to write `default`, but can instead just say `sideNavItemMod.foo` */
  override def _to: FC[SideNavItemProps] = default
}
