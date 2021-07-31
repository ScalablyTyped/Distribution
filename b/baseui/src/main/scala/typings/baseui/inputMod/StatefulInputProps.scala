package typings.baseui.inputMod

import typings.baseui.baseuiStrings.change_
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.baseui.inputMod.StatefulContainerProps because var conflicts: onChange. Inlined children, initialState, stateReducer */ trait StatefulInputProps
  extends StObject
     with InputProps {
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
  var initialState: js.UndefOr[State] = js.undefined
  
  var stateReducer: js.UndefOr[js.Function3[change_, /* nextState */ State, /* currentState */ State, State]] = js.undefined
}
object StatefulInputProps {
  
  @scala.inline
  def apply(): StatefulInputProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatefulInputProps]
  }
  
  @scala.inline
  implicit class StatefulInputPropsMutableBuilder[Self <: StatefulInputProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: scala.Nothing | ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setInitialState(value: State): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
    
    @scala.inline
    def setStateReducer(value: (change_, /* nextState */ State, /* currentState */ State) => State): Self = StObject.set(x, "stateReducer", js.Any.fromFunction3(value))
    
    @scala.inline
    def setStateReducerUndefined: Self = StObject.set(x, "stateReducer", js.undefined)
  }
}
