package typings.baseui.selectMod

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatefulContainerProps extends StObject {
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
  var initialState: js.UndefOr[State] = js.undefined
  
  var onChange: js.UndefOr[js.Function1[/* params */ OnChangeParams, js.Any]] = js.undefined
  
  var overrides: js.UndefOr[SelectOverrides] = js.undefined
  
  var stateReducer: js.UndefOr[StateReducer] = js.undefined
}
object StatefulContainerProps {
  
  inline def apply(): StatefulContainerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatefulContainerProps]
  }
  
  extension [Self <: StatefulContainerProps](x: Self) {
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setInitialState(value: State): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
    
    inline def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
    
    inline def setOnChange(value: /* params */ OnChangeParams => js.Any): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setOverrides(value: SelectOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    
    inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    
    inline def setStateReducer(value: (/* stateType */ String, /* nextState */ State, /* currentState */ State) => State): Self = StObject.set(x, "stateReducer", js.Any.fromFunction3(value))
    
    inline def setStateReducerUndefined: Self = StObject.set(x, "stateReducer", js.undefined)
  }
}
