package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object headerSideNavItemsMod extends Shortcut {
  
  @JSImport("carbon-components-react/lib/components/UIShell/HeaderSideNavItems", JSImport.Default)
  @js.native
  val default: FC[HeaderSideNavItemsProps] = js.native
  
  trait HeaderSideNavItemsProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var hasDivider: js.UndefOr[Boolean] = js.undefined
  }
  object HeaderSideNavItemsProps {
    
    @scala.inline
    def apply(): HeaderSideNavItemsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HeaderSideNavItemsProps]
    }
    
    @scala.inline
    implicit class HeaderSideNavItemsPropsMutableBuilder[Self <: HeaderSideNavItemsProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setHasDivider(value: Boolean): Self = StObject.set(x, "hasDivider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasDividerUndefined: Self = StObject.set(x, "hasDivider", js.undefined)
    }
  }
  
  type _To = FC[HeaderSideNavItemsProps]
  
  /* This means you don't have to write `default`, but can instead just say `headerSideNavItemsMod.foo` */
  override def _to: FC[HeaderSideNavItemsProps] = default
}
