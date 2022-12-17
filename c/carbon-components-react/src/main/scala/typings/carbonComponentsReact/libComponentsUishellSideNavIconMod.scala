package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.carbonComponentsReact.typingsSharedMod.RequiresChildrenProps
import typings.react.mod.FC
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsUishellSideNavIconMod extends Shortcut {
  
  @JSImport("carbon-components-react/lib/components/UIShell/SideNavIcon", JSImport.Default)
  @js.native
  val default: FC[SideNavIconProps] = js.native
  
  trait SideNavIconProps
    extends StObject
       with RequiresChildrenProps[ReactNode] {
    
    var className: js.UndefOr[String] = js.undefined
    
    var small: js.UndefOr[Boolean] = js.undefined
  }
  object SideNavIconProps {
    
    inline def apply(): SideNavIconProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SideNavIconProps]
    }
    
    extension [Self <: SideNavIconProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setSmall(value: Boolean): Self = StObject.set(x, "small", value.asInstanceOf[js.Any])
      
      inline def setSmallUndefined: Self = StObject.set(x, "small", js.undefined)
    }
  }
  
  type _To = FC[SideNavIconProps]
  
  /* This means you don't have to write `default`, but can instead just say `libComponentsUishellSideNavIconMod.foo` */
  override def _to: FC[SideNavIconProps] = default
}
