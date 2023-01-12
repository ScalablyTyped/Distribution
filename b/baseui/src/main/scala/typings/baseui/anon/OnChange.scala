package typings.baseui.anon

import typings.baseui.pinCodeTypesMod.StateChange
import typings.baseui.pinCodeTypesMod.StatefulPinCodeContainerState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnChange extends StObject {
  
  var initialState: Values
  
  def onChange(): Unit
  
  var stateReducer: typings.baseui.pinCodeTypesMod.StateReducer
}
object OnChange {
  
  inline def apply(
    initialState: Values,
    onChange: () => Unit,
    stateReducer: (/* type */ StateChange, /* nextState */ StatefulPinCodeContainerState, /* currentState */ StatefulPinCodeContainerState) => StatefulPinCodeContainerState
  ): OnChange = {
    val __obj = js.Dynamic.literal(initialState = initialState.asInstanceOf[js.Any], onChange = js.Any.fromFunction0(onChange), stateReducer = js.Any.fromFunction3(stateReducer))
    __obj.asInstanceOf[OnChange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OnChange] (val x: Self) extends AnyVal {
    
    inline def setInitialState(value: Values): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
    
    inline def setOnChange(value: () => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction0(value))
    
    inline def setStateReducer(
      value: (/* type */ StateChange, /* nextState */ StatefulPinCodeContainerState, /* currentState */ StatefulPinCodeContainerState) => StatefulPinCodeContainerState
    ): Self = StObject.set(x, "stateReducer", js.Any.fromFunction3(value))
  }
}
