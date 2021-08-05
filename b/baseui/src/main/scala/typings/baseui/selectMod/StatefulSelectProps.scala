package typings.baseui.selectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatefulSelectProps
  extends StObject
     with SelectProps {
  
  var initialState: js.UndefOr[State] = js.undefined
  
  var stateReducer: js.UndefOr[StateReducer] = js.undefined
}
object StatefulSelectProps {
  
  inline def apply(): StatefulSelectProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatefulSelectProps]
  }
  
  extension [Self <: StatefulSelectProps](x: Self) {
    
    inline def setInitialState(value: State): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
    
    inline def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
    
    inline def setStateReducer(value: (/* stateType */ String, /* nextState */ State, /* currentState */ State) => State): Self = StObject.set(x, "stateReducer", js.Any.fromFunction3(value))
    
    inline def setStateReducerUndefined: Self = StObject.set(x, "stateReducer", js.undefined)
  }
}
