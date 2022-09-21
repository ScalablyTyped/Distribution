package typings.baseui.anon

import typings.baseui.typesMod.AccordionOnChangeHandler
import typings.baseui.typesMod.AccordionOverrides
import typings.baseui.typesMod.AccordionState
import typings.baseui.typesMod.StateChangeType
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<baseui.baseui/accordion/types.AccordionProps> */
trait PartialAccordionProps extends StObject {
  
  var accordion: js.UndefOr[Boolean] = js.undefined
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var initialState: js.UndefOr[AccordionState] = js.undefined
  
  var onChange: js.UndefOr[AccordionOnChangeHandler] = js.undefined
  
  var overrides: js.UndefOr[AccordionOverrides] = js.undefined
  
  var renderAll: js.UndefOr[Boolean] = js.undefined
  
  var stateReducer: js.UndefOr[typings.baseui.typesMod.StateReducer] = js.undefined
}
object PartialAccordionProps {
  
  inline def apply(): PartialAccordionProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialAccordionProps]
  }
  
  extension [Self <: PartialAccordionProps](x: Self) {
    
    inline def setAccordion(value: Boolean): Self = StObject.set(x, "accordion", value.asInstanceOf[js.Any])
    
    inline def setAccordionUndefined: Self = StObject.set(x, "accordion", js.undefined)
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setInitialState(value: AccordionState): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
    
    inline def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
    
    inline def setOnChange(value: /* a */ Expanded => Any): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setOverrides(value: AccordionOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    
    inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    
    inline def setRenderAll(value: Boolean): Self = StObject.set(x, "renderAll", value.asInstanceOf[js.Any])
    
    inline def setRenderAllUndefined: Self = StObject.set(x, "renderAll", js.undefined)
    
    inline def setStateReducer(
      value: (/* stateChangeType */ StateChangeType, /* nextState */ AccordionState, /* currentState */ AccordionState) => AccordionState
    ): Self = StObject.set(x, "stateReducer", js.Any.fromFunction3(value))
    
    inline def setStateReducerUndefined: Self = StObject.set(x, "stateReducer", js.undefined)
  }
}
