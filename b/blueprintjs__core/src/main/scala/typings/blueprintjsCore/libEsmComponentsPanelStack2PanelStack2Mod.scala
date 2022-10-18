package typings.blueprintjsCore

import typings.blueprintjsCore.libEsmCommonPropsMod.IProps
import typings.blueprintjsCore.libEsmComponentsPanelStack2PanelTypesMod.Panel
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmComponentsPanelStack2PanelStack2Mod {
  
  @JSImport("@blueprintjs/core/lib/esm/components/panel-stack2/panelStack2", "PanelStack2")
  @js.native
  val PanelStack2: PanelStack2Component = js.native
  
  @js.native
  trait PanelStack2Component extends StObject {
    
    /**
      * @template T type union of all possible panels in this stack
      */
    def apply[T /* <: Panel[js.Object] */](props: PanelStack2Props[T]): Element | Null = js.native
    
    var displayName: String = js.native
  }
  
  trait PanelStack2Props[T /* <: Panel[js.Object] */]
    extends StObject
       with IProps {
    
    /**
      * The initial panel to show on mount. This panel cannot be removed from the
      * stack and will appear when the stack is empty.
      * This prop is only used in uncontrolled mode and is thus mutually
      * exclusive with the `stack` prop.
      */
    var initialPanel: js.UndefOr[T] = js.undefined
    
    /**
      * Callback invoked when the user presses the back button or a panel
      * closes itself with a `closePanel()` action.
      */
    var onClose: js.UndefOr[js.Function1[/* removedPanel */ T, Unit]] = js.undefined
    
    /**
      * Callback invoked when a panel opens a new panel with an `openPanel(panel)`
      * action.
      */
    var onOpen: js.UndefOr[js.Function1[/* addedPanel */ T, Unit]] = js.undefined
    
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
    var stack: js.UndefOr[js.Array[T]] = js.undefined
  }
  object PanelStack2Props {
    
    inline def apply[T /* <: Panel[js.Object] */](): PanelStack2Props[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PanelStack2Props[T]]
    }
    
    extension [Self <: PanelStack2Props[?], T /* <: Panel[js.Object] */](x: Self & PanelStack2Props[T]) {
      
      inline def setInitialPanel(value: T): Self = StObject.set(x, "initialPanel", value.asInstanceOf[js.Any])
      
      inline def setInitialPanelUndefined: Self = StObject.set(x, "initialPanel", js.undefined)
      
      inline def setOnClose(value: /* removedPanel */ T => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction1(value))
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setOnOpen(value: /* addedPanel */ T => Unit): Self = StObject.set(x, "onOpen", js.Any.fromFunction1(value))
      
      inline def setOnOpenUndefined: Self = StObject.set(x, "onOpen", js.undefined)
      
      inline def setRenderActivePanelOnly(value: Boolean): Self = StObject.set(x, "renderActivePanelOnly", value.asInstanceOf[js.Any])
      
      inline def setRenderActivePanelOnlyUndefined: Self = StObject.set(x, "renderActivePanelOnly", js.undefined)
      
      inline def setShowPanelHeader(value: Boolean): Self = StObject.set(x, "showPanelHeader", value.asInstanceOf[js.Any])
      
      inline def setShowPanelHeaderUndefined: Self = StObject.set(x, "showPanelHeader", js.undefined)
      
      inline def setStack(value: js.Array[T]): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      inline def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
      
      inline def setStackVarargs(value: T*): Self = StObject.set(x, "stack", js.Array(value*))
    }
  }
}
