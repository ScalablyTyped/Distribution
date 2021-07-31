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

object toolbarToolbarMod extends Shortcut {
  
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
    
    @scala.inline
    def apply(): ToolbarItemInheritedProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToolbarItemInheritedProps]
    }
    
    @scala.inline
    implicit class ToolbarItemInheritedPropsMutableBuilder[Self <: ToolbarItemInheritedProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
  
  trait ToolbarItemProps
    extends StObject
       with ToolbarItemInheritedProps {
    
    var placeholderText: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ToolbarItemProps {
    
    @scala.inline
    def apply(): ToolbarItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToolbarItemProps]
    }
    
    @scala.inline
    implicit class ToolbarItemPropsMutableBuilder[Self <: ToolbarItemProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPlaceholderText(value: String): Self = StObject.set(x, "placeholderText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderTextUndefined: Self = StObject.set(x, "placeholderText", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  // ToolbarOption
  trait ToolbarOptionInheritedProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
  }
  object ToolbarOptionInheritedProps {
    
    @scala.inline
    def apply(): ToolbarOptionInheritedProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToolbarOptionInheritedProps]
    }
    
    @scala.inline
    implicit class ToolbarOptionInheritedPropsMutableBuilder[Self <: ToolbarOptionInheritedProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
  
  type ToolbarOptionProps = ToolbarOptionInheritedProps
  
  type ToolbarProps = ToolbarInheritedProps
  
  trait ToolbarTitleProps extends StObject {
    
    var title: js.UndefOr[String] = js.undefined
  }
  object ToolbarTitleProps {
    
    @scala.inline
    def apply(): ToolbarTitleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToolbarTitleProps]
    }
    
    @scala.inline
    implicit class ToolbarTitlePropsMutableBuilder[Self <: ToolbarTitleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  type _To = FC[ToolbarProps]
  
  /* This means you don't have to write `default`, but can instead just say `toolbarToolbarMod.foo` */
  override def _to: FC[ToolbarProps] = default
}
