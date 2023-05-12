package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.carbonComponentsReact.typingsSharedMod.ForwardRefReturn
import typings.carbonComponentsReact.typingsSharedMod.RenderIconProps
import typings.carbonComponentsReact.typingsSharedMod.SideNavSharedProps
import typings.carbonComponentsReact.typingsSharedMod.SideNavSizingProps
import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.std.HTMLButtonElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsUishellSideNavMenuMod extends Shortcut {
  
  @JSImport("carbon-components-react/lib/components/UIShell/SideNavMenu", JSImport.Default)
  @js.native
  val default: ForwardRefReturn[HTMLButtonElement, SideNavMenuProps] = js.native
  
  @JSImport("carbon-components-react/lib/components/UIShell/SideNavMenu", "SideNavMenu")
  @js.native
  open class SideNavMenu protected ()
    extends Component[SideNavMenuProps, js.Object, Any] {
    def this(props: SideNavMenuProps) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: SideNavMenuProps, context: Any) = this()
  }
  
  trait SideNavMenuProps
    extends StObject
       with RenderIconProps[Any]
       with SideNavSharedProps
       with SideNavSizingProps {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var defaultExpanded: js.UndefOr[Boolean] = js.undefined
    
    var isActive: js.UndefOr[Boolean] = js.undefined
    
    var title: String
  }
  object SideNavMenuProps {
    
    inline def apply(title: String): SideNavMenuProps = {
      val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[SideNavMenuProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SideNavMenuProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDefaultExpanded(value: Boolean): Self = StObject.set(x, "defaultExpanded", value.asInstanceOf[js.Any])
      
      inline def setDefaultExpandedUndefined: Self = StObject.set(x, "defaultExpanded", js.undefined)
      
      inline def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
      
      inline def setIsActiveUndefined: Self = StObject.set(x, "isActive", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = ForwardRefReturn[HTMLButtonElement, SideNavMenuProps]
  
  /* This means you don't have to write `default`, but can instead just say `libComponentsUishellSideNavMenuMod.foo` */
  override def _to: ForwardRefReturn[HTMLButtonElement, SideNavMenuProps] = default
}
