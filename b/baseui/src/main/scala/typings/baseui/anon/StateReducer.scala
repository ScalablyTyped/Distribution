package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StateReducer extends StObject {
  
  var initialState: CurrentPage
  
  def stateReducer(changeType: Any, changes: Any): Any
}
object StateReducer {
  
  inline def apply(initialState: CurrentPage, stateReducer: (Any, Any) => Any): StateReducer = {
    val __obj = js.Dynamic.literal(initialState = initialState.asInstanceOf[js.Any], stateReducer = js.Any.fromFunction2(stateReducer))
    __obj.asInstanceOf[StateReducer]
  }
  
  extension [Self <: StateReducer](x: Self) {
    
    inline def setInitialState(value: CurrentPage): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
    
    inline def setStateReducer(value: (Any, Any) => Any): Self = StObject.set(x, "stateReducer", js.Any.fromFunction2(value))
  }
}
