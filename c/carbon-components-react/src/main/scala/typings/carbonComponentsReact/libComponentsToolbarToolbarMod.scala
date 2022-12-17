package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.carbonComponentsReact.typingsSharedMod.ForwardRefReturn
import typings.carbonComponentsReact.typingsSharedMod.ReactDivAttr
import typings.react.mod.FC
import typings.react.mod.ReactNode
import typings.std.HTMLHRElement
import typings.std.HTMLLIElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsToolbarToolbarMod extends Shortcut {
  
  /**
    * @deprecated
    */
  @JSImport("carbon-components-react/lib/components/Toolbar/Toolbar", JSImport.Default)
  @js.native
  val default: FC[ToolbarProps] = js.native
  
  @JSImport("carbon-components-react/lib/components/Toolbar/Toolbar", "ToolbarDivider")
  @js.native
  val ToolbarDivider: ForwardRefReturn[HTMLHRElement, js.Object] = js.native
  
  @JSImport("carbon-components-react/lib/components/Toolbar/Toolbar", "ToolbarItem")
  @js.native
  val ToolbarItem: FC[ToolbarItemProps] = js.native
  
  @JSImport("carbon-components-react/lib/components/Toolbar/Toolbar", "ToolbarOption")
  @js.native
  val ToolbarOption: ForwardRefReturn[HTMLLIElement, ToolbarOptionProps] = js.native
  
  @JSImport("carbon-components-react/lib/components/Toolbar/Toolbar", "ToolbarTitle")
  @js.native
  val ToolbarTitle: ForwardRefReturn[HTMLLIElement, ToolbarTitleProps] = js.native
  
  // Toolbar
  type ToolbarInheritedProps = ReactDivAttr
  
  // ToolbarItem
  trait ToolbarItemInheritedProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
  }
  object ToolbarItemInheritedProps {
    
    inline def apply(): ToolbarItemInheritedProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToolbarItemInheritedProps]
    }
    
    extension [Self <: ToolbarItemInheritedProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
  
  trait ToolbarItemProps
    extends StObject
       with ToolbarItemInheritedProps {
    
    var placeholderText: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ToolbarItemProps {
    
    inline def apply(): ToolbarItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToolbarItemProps]
    }
    
    extension [Self <: ToolbarItemProps](x: Self) {
      
      inline def setPlaceholderText(value: String): Self = StObject.set(x, "placeholderText", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderTextUndefined: Self = StObject.set(x, "placeholderText", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  // ToolbarOption
  trait ToolbarOptionInheritedProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
  }
  object ToolbarOptionInheritedProps {
    
    inline def apply(): ToolbarOptionInheritedProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToolbarOptionInheritedProps]
    }
    
    extension [Self <: ToolbarOptionInheritedProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
  
  type ToolbarOptionProps = ToolbarOptionInheritedProps
  
  type ToolbarProps = ToolbarInheritedProps
  
  trait ToolbarTitleProps extends StObject {
    
    var title: js.UndefOr[String] = js.undefined
  }
  object ToolbarTitleProps {
    
    inline def apply(): ToolbarTitleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToolbarTitleProps]
    }
    
    extension [Self <: ToolbarTitleProps](x: Self) {
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  type _To = FC[ToolbarProps]
  
  /* This means you don't have to write `default`, but can instead just say `libComponentsToolbarToolbarMod.foo` */
  override def _to: FC[ToolbarProps] = default
}
