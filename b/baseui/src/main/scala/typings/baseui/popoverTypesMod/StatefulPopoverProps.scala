package typings.baseui.popoverTypesMod

import typings.baseui.anon.`256`
import typings.baseui.layerTypesMod.TetherPlacement
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatefulPopoverProps
  extends StObject
     with BasePopoverProps {
  
  /** Content that should trigger the popover to be shown (also acts as the anchor against
    * which the popover will be positioned).
    */
  var children: ReactNode
  
  /** Content to render within the popover when it's shown. */
  var content: ReactNode | StatefulContentRenderProp
  
  /** Whether to hide the popover when the user clicks anywhere outside the trigger/popover. */
  var dismissOnClickOutside: Boolean
  
  /** Whether to hide the popover when the user presses the escape key. */
  var dismissOnEsc: Boolean
  
  /** Initial state populated into the component */
  var initialState: js.UndefOr[State] = js.undefined
  
  /** Event handler when popover is hidden. */
  var onClose: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** Event handler when popover is shown. */
  var onOpen: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** Reducer function to manipulate internal state updates. */
  var stateReducer: js.UndefOr[StateReducer] = js.undefined
}
object StatefulPopoverProps {
  
  inline def apply(
    dismissOnClickOutside: Boolean,
    dismissOnEsc: Boolean,
    placement: TetherPlacement,
    triggerType: TriggerType
  ): StatefulPopoverProps = {
    val __obj = js.Dynamic.literal(dismissOnClickOutside = dismissOnClickOutside.asInstanceOf[js.Any], dismissOnEsc = dismissOnEsc.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any], triggerType = triggerType.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatefulPopoverProps]
  }
  
  extension [Self <: StatefulPopoverProps](x: Self) {
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setContent(value: ReactNode | StatefulContentRenderProp): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentFunction1(value: /* a */ `256` => ReactNode): Self = StObject.set(x, "content", js.Any.fromFunction1(value))
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setDismissOnClickOutside(value: Boolean): Self = StObject.set(x, "dismissOnClickOutside", value.asInstanceOf[js.Any])
    
    inline def setDismissOnEsc(value: Boolean): Self = StObject.set(x, "dismissOnEsc", value.asInstanceOf[js.Any])
    
    inline def setInitialState(value: State): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
    
    inline def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
    
    inline def setOnClose(value: () => Any): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
    
    inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
    
    inline def setOnOpen(value: () => Any): Self = StObject.set(x, "onOpen", js.Any.fromFunction0(value))
    
    inline def setOnOpenUndefined: Self = StObject.set(x, "onOpen", js.undefined)
    
    inline def setStateReducer(
      value: (/* stateChangeType */ StateChangeType, /* nextState */ State, /* currentState */ State) => State
    ): Self = StObject.set(x, "stateReducer", js.Any.fromFunction3(value))
    
    inline def setStateReducerUndefined: Self = StObject.set(x, "stateReducer", js.undefined)
  }
}
