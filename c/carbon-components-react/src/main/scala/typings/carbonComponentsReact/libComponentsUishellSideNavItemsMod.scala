package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.carbonComponentsReact.typingsSharedMod.RequiresChildrenProps
import typings.carbonComponentsReact.typingsSharedMod.SideNavSharedProps
import typings.react.mod.FC
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsUishellSideNavItemsMod extends Shortcut {
  
  @JSImport("carbon-components-react/lib/components/UIShell/SideNavItems", JSImport.Default)
  @js.native
  val default: FC[SideNavItemsProps] = js.native
  
  trait SideNavItemsProps
    extends StObject
       with SideNavSharedProps
       with RequiresChildrenProps[ReactNode] {
    
    var className: js.UndefOr[String] = js.undefined
  }
  object SideNavItemsProps {
    
    inline def apply(): SideNavItemsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SideNavItemsProps]
    }
    
    extension [Self <: SideNavItemsProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    }
  }
  
  type _To = FC[SideNavItemsProps]
  
  /* This means you don't have to write `default`, but can instead just say `libComponentsUishellSideNavItemsMod.foo` */
  override def _to: FC[SideNavItemsProps] = default
}
