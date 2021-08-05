package typings.baseui.accordionMod

import typings.baseui.anon.Expanded
import typings.baseui.baseuiStrings.expand
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccordionProps extends StObject {
  
  var accordion: js.UndefOr[Boolean] = js.undefined
  
  var children: ReactNode
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var initialState: js.UndefOr[AccordionState] = js.undefined
  
  var onChange: js.UndefOr[js.Function1[/* args */ Expanded, js.Any]] = js.undefined
  
  var overrides: js.UndefOr[AccordionOverrides[SharedProps]] = js.undefined
  
  var renderAll: js.UndefOr[Boolean] = js.undefined
  
  var renderPanelContent: js.UndefOr[Boolean] = js.undefined
  
  var stateReducer: js.UndefOr[StateReducer[AccordionState]] = js.undefined
}
object AccordionProps {
  
  inline def apply(): AccordionProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccordionProps]
  }
  
  extension [Self <: AccordionProps](x: Self) {
    
    inline def setAccordion(value: Boolean): Self = StObject.set(x, "accordion", value.asInstanceOf[js.Any])
    
    inline def setAccordionUndefined: Self = StObject.set(x, "accordion", js.undefined)
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setInitialState(value: AccordionState): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
    
    inline def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
    
    inline def setOnChange(value: /* args */ Expanded => js.Any): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setOverrides(value: AccordionOverrides[SharedProps]): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    
    inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    
    inline def setRenderAll(value: Boolean): Self = StObject.set(x, "renderAll", value.asInstanceOf[js.Any])
    
    inline def setRenderAllUndefined: Self = StObject.set(x, "renderAll", js.undefined)
    
    inline def setRenderPanelContent(value: Boolean): Self = StObject.set(x, "renderPanelContent", value.asInstanceOf[js.Any])
    
    inline def setRenderPanelContentUndefined: Self = StObject.set(x, "renderPanelContent", js.undefined)
    
    inline def setStateReducer(value: (expand, AccordionState, AccordionState) => AccordionState): Self = StObject.set(x, "stateReducer", js.Any.fromFunction3(value))
    
    inline def setStateReducerUndefined: Self = StObject.set(x, "stateReducer", js.undefined)
  }
}
