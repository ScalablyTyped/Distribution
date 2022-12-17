package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsUishellHeaderSideNavItemsMod extends Shortcut {
  
  @JSImport("carbon-components-react/lib/components/UIShell/HeaderSideNavItems", JSImport.Default)
  @js.native
  val default: FC[HeaderSideNavItemsProps] = js.native
  
  trait HeaderSideNavItemsProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var hasDivider: js.UndefOr[Boolean] = js.undefined
  }
  object HeaderSideNavItemsProps {
    
    inline def apply(): HeaderSideNavItemsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HeaderSideNavItemsProps]
    }
    
    extension [Self <: HeaderSideNavItemsProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setHasDivider(value: Boolean): Self = StObject.set(x, "hasDivider", value.asInstanceOf[js.Any])
      
      inline def setHasDividerUndefined: Self = StObject.set(x, "hasDivider", js.undefined)
    }
  }
  
  type _To = FC[HeaderSideNavItemsProps]
  
  /* This means you don't have to write `default`, but can instead just say `libComponentsUishellHeaderSideNavItemsMod.foo` */
  override def _to: FC[HeaderSideNavItemsProps] = default
}
