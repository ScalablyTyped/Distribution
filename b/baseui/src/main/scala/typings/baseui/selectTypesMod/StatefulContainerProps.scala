package typings.baseui.selectTypesMod

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatefulContainerProps extends StObject {
  
  def children(a: SelectProps): ReactNode
  
  var initialState: State
  
  def onChange(params: OnChangeParams): Any
  
  var overrides: SelectOverrides
  
  var stateReducer: StateReducer
}
object StatefulContainerProps {
  
  inline def apply(
    children: SelectProps => ReactNode,
    initialState: State,
    onChange: OnChangeParams => Any,
    overrides: SelectOverrides,
    stateReducer: (/* stateType */ String, /* nextState */ State, /* currentState */ State) => State
  ): StatefulContainerProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), initialState = initialState.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), overrides = overrides.asInstanceOf[js.Any], stateReducer = js.Any.fromFunction3(stateReducer))
    __obj.asInstanceOf[StatefulContainerProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StatefulContainerProps] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: SelectProps => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    
    inline def setInitialState(value: State): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
    
    inline def setOnChange(value: OnChangeParams => Any): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    inline def setOverrides(value: SelectOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    
    inline def setStateReducer(value: (/* stateType */ String, /* nextState */ State, /* currentState */ State) => State): Self = StObject.set(x, "stateReducer", js.Any.fromFunction3(value))
  }
}
