package typings.blueprintjsCore

import typings.blueprintjsCore.blueprintjsCoreStrings.pop
import typings.blueprintjsCore.blueprintjsCoreStrings.push
import typings.blueprintjsCore.commonMod.AbstractPureComponent2
import typings.blueprintjsCore.panelPropsMod.IPanel
import typings.blueprintjsCore.propsMod.IProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object panelStackMod {
  
  @JSImport("@blueprintjs/core/lib/esm/components/panel-stack/panelStack", "PanelStack")
  @js.native
  open class PanelStack protected ()
    extends AbstractPureComponent2[IPanelStackProps, IPanelStackState, js.Object] {
    def this(props: IPanelStackProps) = this()
    def this(props: IPanelStackProps, context: Any) = this()
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MPanelStack(prevProps: IPanelStackProps, prevState: IPanelStackState): Unit = js.native
    
    /* private */ var handlePanelClose: Any = js.native
    
    /* private */ var handlePanelOpen: Any = js.native
    
    /* private */ var renderPanel: Any = js.native
    
    /* private */ var renderPanels: Any = js.native
  }
  
  trait IPanelStackProps
    extends StObject
       with IProps {
    
    /**
      * The initial panel to show on mount. This panel cannot be removed from the
      * stack and will appear when the stack is empty.
      * This prop is only used in uncontrolled mode and is thus mutually
      * exclusive with the `stack` prop.
      */
    var initialPanel: js.UndefOr[IPanel[Any]] = js.undefined
    
    /**
      * Callback invoked when the user presses the back button or a panel invokes
      * the `closePanel()` injected prop method.
      */
    var onClose: js.UndefOr[js.Function1[/* removedPanel */ IPanel[js.Object], Unit]] = js.undefined
    
    /**
      * Callback invoked when a panel invokes the `openPanel(panel)` injected
      * prop method.
      */
    var onOpen: js.UndefOr[js.Function1[/* addedPanel */ IPanel[js.Object], Unit]] = js.undefined
    
    /**
      * If false, PanelStack will render all panels in the stack to the DOM, allowing their
      * React component trees to maintain state as a user navigates through the stack.
      * Panels other than the currently active one will be invisible.
      *
      * @default true
      */
    var renderActivePanelOnly: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to show the header with the "back" button in each panel.
      *
      * @default true
      */
    var showPanelHeader: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The full stack of panels in controlled mode. The last panel in the stack
      * will be displayed.
      */
    var stack: js.UndefOr[js.Array[IPanel[Any]]] = js.undefined
  }
  object IPanelStackProps {
    
    inline def apply(): IPanelStackProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IPanelStackProps]
    }
    
    extension [Self <: IPanelStackProps](x: Self) {
      
      inline def setInitialPanel(value: IPanel[Any]): Self = StObject.set(x, "initialPanel", value.asInstanceOf[js.Any])
      
      inline def setInitialPanelUndefined: Self = StObject.set(x, "initialPanel", js.undefined)
      
      inline def setOnClose(value: /* removedPanel */ IPanel[js.Object] => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction1(value))
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setOnOpen(value: /* addedPanel */ IPanel[js.Object] => Unit): Self = StObject.set(x, "onOpen", js.Any.fromFunction1(value))
      
      inline def setOnOpenUndefined: Self = StObject.set(x, "onOpen", js.undefined)
      
      inline def setRenderActivePanelOnly(value: Boolean): Self = StObject.set(x, "renderActivePanelOnly", value.asInstanceOf[js.Any])
      
      inline def setRenderActivePanelOnlyUndefined: Self = StObject.set(x, "renderActivePanelOnly", js.undefined)
      
      inline def setShowPanelHeader(value: Boolean): Self = StObject.set(x, "showPanelHeader", value.asInstanceOf[js.Any])
      
      inline def setShowPanelHeaderUndefined: Self = StObject.set(x, "showPanelHeader", js.undefined)
      
      inline def setStack(value: js.Array[IPanel[Any]]): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      inline def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
      
      inline def setStackVarargs(value: IPanel[Any]*): Self = StObject.set(x, "stack", js.Array(value*))
    }
  }
  
  trait IPanelStackState extends StObject {
    
    /** Whether the stack is currently animating the push or pop of a panel. */
    var direction: push | pop
    
    /** The current stack of panels. The first panel in the stack will be displayed. */
    var stack: js.Array[IPanel[js.Object]]
  }
  object IPanelStackState {
    
    inline def apply(direction: push | pop, stack: js.Array[IPanel[js.Object]]): IPanelStackState = {
      val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPanelStackState]
    }
    
    extension [Self <: IPanelStackState](x: Self) {
      
      inline def setDirection(value: push | pop): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setStack(value: js.Array[IPanel[js.Object]]): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      inline def setStackVarargs(value: IPanel[js.Object]*): Self = StObject.set(x, "stack", js.Array(value*))
    }
  }
}
