package typings.baseui.anon

import typings.baseui.buttonGroupTypesMod.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InitialState extends StObject {
  
  var initialState: Selected
  
  var stateReducer: js.Function3[
    /* import warning: importer.ImportType#apply Failed type conversion: typeof STATE_CHANGE_TYPE[keyof typeof STATE_CHANGE_TYPE] */ /* type */ js.Any, 
    /* nextState */ State, 
    /* currentState */ State, 
    State
  ]
}
object InitialState {
  
  inline def apply(
    initialState: Selected,
    stateReducer: (/* import warning: importer.ImportType#apply Failed type conversion: typeof STATE_CHANGE_TYPE[keyof typeof STATE_CHANGE_TYPE] */ /* type */ js.Any, /* nextState */ State, /* currentState */ State) => State
  ): InitialState = {
    val __obj = js.Dynamic.literal(initialState = initialState.asInstanceOf[js.Any], stateReducer = js.Any.fromFunction3(stateReducer))
    __obj.asInstanceOf[InitialState]
  }
  
  extension [Self <: InitialState](x: Self) {
    
    inline def setInitialState(value: Selected): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
    
    inline def setStateReducer(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: typeof STATE_CHANGE_TYPE[keyof typeof STATE_CHANGE_TYPE] */ /* type */ js.Any, /* nextState */ State, /* currentState */ State) => State
    ): Self = StObject.set(x, "stateReducer", js.Any.fromFunction3(value))
  }
}
