package typings.blueprintjsCore

import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object panelPropsMod {
  
  trait IPanel[P] extends StObject {
    
    /**
      * The component type to render for this panel. This must be a reference to
      * the component class or SFC, _not_ a JSX element, so it can be re-created
      * dynamically when needed.
      */
    var component: ComponentType[P & IPanelProps]
    
    /**
      * HTML title to be passed to the <Text> component
      */
    var htmlTitle: js.UndefOr[String] = js.undefined
    
    /**
      * The props passed to the component type when it is rendered. The methods
      * in `IPanelProps` will be injected by `PanelStack`.
      */
    var props: js.UndefOr[P] = js.undefined
    
    /**
      * The title to be displayed above this panel. It is also used as the text
      * of the back button for any panel opened by this panel.
      */
    var title: js.UndefOr[ReactNode] = js.undefined
  }
  object IPanel {
    
    @scala.inline
    def apply[P](component: ComponentType[P & IPanelProps]): IPanel[P] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPanel[P]]
    }
    
    @scala.inline
    implicit class IPanelMutableBuilder[Self <: IPanel[?], P] (val x: Self & IPanel[P]) extends AnyVal {
      
      @scala.inline
      def setComponent(value: ComponentType[P & IPanelProps]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtmlTitle(value: String): Self = StObject.set(x, "htmlTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtmlTitleUndefined: Self = StObject.set(x, "htmlTitle", js.undefined)
      
      @scala.inline
      def setProps(value: P): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
      
      @scala.inline
      def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait IPanelProps extends StObject {
    
    /**
      * Call this method to programatically close this panel. If this is the only
      * panel on the stack then this method will do nothing.
      *
      * Remember that the panel header always contains a "back" button that
      * closes this panel on click (unless there is only one panel on the stack).
      */
    def closePanel(): Unit
    
    /**
      * Call this method to open a new panel on the top of the stack.
      */
    def openPanel[P](panel: IPanel[P]): Unit
  }
  object IPanelProps {
    
    @scala.inline
    def apply(closePanel: () => Unit, openPanel: IPanel[js.Any] => Unit): IPanelProps = {
      val __obj = js.Dynamic.literal(closePanel = js.Any.fromFunction0(closePanel), openPanel = js.Any.fromFunction1(openPanel))
      __obj.asInstanceOf[IPanelProps]
    }
    
    @scala.inline
    implicit class IPanelPropsMutableBuilder[Self <: IPanelProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClosePanel(value: () => Unit): Self = StObject.set(x, "closePanel", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOpenPanel(value: IPanel[js.Any] => Unit): Self = StObject.set(x, "openPanel", js.Any.fromFunction1(value))
    }
  }
}
