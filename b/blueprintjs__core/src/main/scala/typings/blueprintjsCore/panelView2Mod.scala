package typings.blueprintjsCore

import typings.blueprintjsCore.panelTypesMod.Panel
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object panelView2Mod {
  
  @JSImport("@blueprintjs/core/lib/esm/components/panel-stack2/panelView2", "PanelView2")
  @js.native
  val PanelView2: PanelView2Component = js.native
  
  @js.native
  trait PanelView2Component extends StObject {
    
    def apply[T /* <: Panel[js.Object] */](props: PanelView2Props[T]): Element | Null = js.native
    
    var displayName: String = js.native
  }
  
  trait PanelView2Props[T /* <: Panel[js.Object] */] extends StObject {
    
    /**
      * Callback invoked when the user presses the back button or a panel invokes
      * the `closePanel()` injected prop method.
      */
    def onClose(removedPanel: T): Unit
    
    /**
      * Callback invoked when a panel invokes the `openPanel(panel)` injected
      * prop method.
      */
    def onOpen(addedPanel: T): Unit
    
    /** The panel to be displayed. */
    var panel: T
    
    /** The previous panel in the stack, for rendering the "back" button. */
    var previousPanel: js.UndefOr[T] = js.undefined
    
    /** Whether to show the header with the "back" button. */
    var showHeader: Boolean
  }
  object PanelView2Props {
    
    inline def apply[T /* <: Panel[js.Object] */](onClose: T => Unit, onOpen: T => Unit, panel: T, showHeader: Boolean): PanelView2Props[T] = {
      val __obj = js.Dynamic.literal(onClose = js.Any.fromFunction1(onClose), onOpen = js.Any.fromFunction1(onOpen), panel = panel.asInstanceOf[js.Any], showHeader = showHeader.asInstanceOf[js.Any])
      __obj.asInstanceOf[PanelView2Props[T]]
    }
    
    extension [Self <: PanelView2Props[?], T /* <: Panel[js.Object] */](x: Self & PanelView2Props[T]) {
      
      inline def setOnClose(value: T => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction1(value))
      
      inline def setOnOpen(value: T => Unit): Self = StObject.set(x, "onOpen", js.Any.fromFunction1(value))
      
      inline def setPanel(value: T): Self = StObject.set(x, "panel", value.asInstanceOf[js.Any])
      
      inline def setPreviousPanel(value: T): Self = StObject.set(x, "previousPanel", value.asInstanceOf[js.Any])
      
      inline def setPreviousPanelUndefined: Self = StObject.set(x, "previousPanel", js.undefined)
      
      inline def setShowHeader(value: Boolean): Self = StObject.set(x, "showHeader", value.asInstanceOf[js.Any])
    }
  }
}
