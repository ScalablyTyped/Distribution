package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.carbonComponentsReact.typingsSharedMod.SideNavSharedProps
import typings.react.mod.FC
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sideNavHeaderMod extends Shortcut {
  
  @JSImport("carbon-components-react/lib/components/UIShell/SideNavHeader", JSImport.Default)
  @js.native
  val default: FC[SideNavHeaderProps] = js.native
  
  trait SideNavHeaderProps
    extends StObject
       with SideNavSharedProps {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var renderIcon: js.Any
  }
  object SideNavHeaderProps {
    
    @scala.inline
    def apply(renderIcon: js.Any): SideNavHeaderProps = {
      val __obj = js.Dynamic.literal(renderIcon = renderIcon.asInstanceOf[js.Any])
      __obj.asInstanceOf[SideNavHeaderProps]
    }
    
    @scala.inline
    implicit class SideNavHeaderPropsMutableBuilder[Self <: SideNavHeaderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setRenderIcon(value: js.Any): Self = StObject.set(x, "renderIcon", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = FC[SideNavHeaderProps]
  
  /* This means you don't have to write `default`, but can instead just say `sideNavHeaderMod.foo` */
  override def _to: FC[SideNavHeaderProps] = default
}
