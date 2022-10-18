package typings.blueprintjsCore

import typings.blueprintjsCore.libEsmCommonMod.AbstractPureComponent2
import typings.blueprintjsCore.libEsmComponentsPanelStackPanelPropsMod.IPanel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmComponentsPanelStackPanelViewMod {
  
  @JSImport("@blueprintjs/core/lib/esm/components/panel-stack/panelView", "PanelView")
  @js.native
  open class PanelView protected ()
    extends AbstractPureComponent2[IPanelViewProps, js.Object, js.Object] {
    def this(props: IPanelViewProps) = this()
    def this(props: IPanelViewProps, context: Any) = this()
    
    /* private */ var handleClose: Any = js.native
    
    /* private */ var maybeRenderBack: Any = js.native
    
    /* private */ var maybeRenderHeader: Any = js.native
  }
  
  trait IPanelViewProps extends StObject {
    
    /**
      * Callback invoked when the user presses the back button or a panel invokes
      * the `closePanel()` injected prop method.
      */
    def onClose(removedPanel: IPanel[Any]): Unit
    
    /**
      * Callback invoked when a panel invokes the `openPanel(panel)` injected
      * prop method.
      */
    def onOpen(addedPanel: IPanel[Any]): Unit
    
    /** The panel to be displayed. */
    var panel: IPanel[js.Object]
    
    /** The previous panel in the stack, for rendering the "back" button. */
    var previousPanel: js.UndefOr[IPanel[js.Object]] = js.undefined
    
    /** Whether to show the header with the "back" button. */
    var showHeader: Boolean
  }
  object IPanelViewProps {
    
    inline def apply(
      onClose: IPanel[Any] => Unit,
      onOpen: IPanel[Any] => Unit,
      panel: IPanel[js.Object],
      showHeader: Boolean
    ): IPanelViewProps = {
      val __obj = js.Dynamic.literal(onClose = js.Any.fromFunction1(onClose), onOpen = js.Any.fromFunction1(onOpen), panel = panel.asInstanceOf[js.Any], showHeader = showHeader.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPanelViewProps]
    }
    
    extension [Self <: IPanelViewProps](x: Self) {
      
      inline def setOnClose(value: IPanel[Any] => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction1(value))
      
      inline def setOnOpen(value: IPanel[Any] => Unit): Self = StObject.set(x, "onOpen", js.Any.fromFunction1(value))
      
      inline def setPanel(value: IPanel[js.Object]): Self = StObject.set(x, "panel", value.asInstanceOf[js.Any])
      
      inline def setPreviousPanel(value: IPanel[js.Object]): Self = StObject.set(x, "previousPanel", value.asInstanceOf[js.Any])
      
      inline def setPreviousPanelUndefined: Self = StObject.set(x, "previousPanel", js.undefined)
      
      inline def setShowHeader(value: Boolean): Self = StObject.set(x, "showHeader", value.asInstanceOf[js.Any])
    }
  }
}
