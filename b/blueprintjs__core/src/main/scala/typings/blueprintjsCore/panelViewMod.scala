package typings.blueprintjsCore

import typings.blueprintjsCore.commonMod.AbstractPureComponent2
import typings.blueprintjsCore.panelPropsMod.IPanel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object panelViewMod {
  
  @JSImport("@blueprintjs/core/lib/esm/components/panel-stack/panelView", "PanelView")
  @js.native
  class PanelView protected ()
    extends AbstractPureComponent2[IPanelViewProps, js.Object, js.Object] {
    def this(props: IPanelViewProps) = this()
    def this(props: IPanelViewProps, context: js.Any) = this()
    
    var handleClose: js.Any = js.native
    
    var maybeRenderBack: js.Any = js.native
    
    var maybeRenderHeader: js.Any = js.native
  }
  
  @js.native
  trait IPanelViewProps extends StObject {
    
    /**
      * Callback invoked when the user presses the back button or a panel invokes
      * the `closePanel()` injected prop method.
      */
    def onClose(removedPanel: IPanel[_]): Unit = js.native
    
    /**
      * Callback invoked when a panel invokes the `openPanel(panel)` injected
      * prop method.
      */
    def onOpen(addedPanel: IPanel[_]): Unit = js.native
    
    /** The panel to be displayed. */
    var panel: IPanel[js.Object] = js.native
    
    /** The previous panel in the stack, for rendering the "back" button. */
    var previousPanel: js.UndefOr[IPanel[js.Object]] = js.native
    
    /** Whether to show the header with the "back" button. */
    var showHeader: Boolean = js.native
  }
  object IPanelViewProps {
    
    @scala.inline
    def apply(
      onClose: IPanel[_] => Unit,
      onOpen: IPanel[_] => Unit,
      panel: IPanel[js.Object],
      showHeader: Boolean
    ): IPanelViewProps = {
      val __obj = js.Dynamic.literal(onClose = js.Any.fromFunction1(onClose), onOpen = js.Any.fromFunction1(onOpen), panel = panel.asInstanceOf[js.Any], showHeader = showHeader.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPanelViewProps]
    }
    
    @scala.inline
    implicit class IPanelViewPropsMutableBuilder[Self <: IPanelViewProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnClose(value: IPanel[_] => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnOpen(value: IPanel[_] => Unit): Self = StObject.set(x, "onOpen", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPanel(value: IPanel[js.Object]): Self = StObject.set(x, "panel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviousPanel(value: IPanel[js.Object]): Self = StObject.set(x, "previousPanel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviousPanelUndefined: Self = StObject.set(x, "previousPanel", js.undefined)
      
      @scala.inline
      def setShowHeader(value: Boolean): Self = StObject.set(x, "showHeader", value.asInstanceOf[js.Any])
    }
  }
}
