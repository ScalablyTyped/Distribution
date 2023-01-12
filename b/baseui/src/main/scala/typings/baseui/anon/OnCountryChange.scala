package typings.baseui.anon

import typings.baseui.phoneInputTypesMod.State
import typings.baseui.phoneInputTypesMod.StateChange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnCountryChange extends StObject {
  
  var initialState: Country
  
  def onCountryChange(): Unit
  
  def onTextChange(): Unit
  
  var stateReducer: typings.baseui.phoneInputTypesMod.StateReducer
}
object OnCountryChange {
  
  inline def apply(
    initialState: Country,
    onCountryChange: () => Unit,
    onTextChange: () => Unit,
    stateReducer: (/* type */ StateChange, /* nextState */ PartialState, /* currentState */ State) => State
  ): OnCountryChange = {
    val __obj = js.Dynamic.literal(initialState = initialState.asInstanceOf[js.Any], onCountryChange = js.Any.fromFunction0(onCountryChange), onTextChange = js.Any.fromFunction0(onTextChange), stateReducer = js.Any.fromFunction3(stateReducer))
    __obj.asInstanceOf[OnCountryChange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OnCountryChange] (val x: Self) extends AnyVal {
    
    inline def setInitialState(value: Country): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
    
    inline def setOnCountryChange(value: () => Unit): Self = StObject.set(x, "onCountryChange", js.Any.fromFunction0(value))
    
    inline def setOnTextChange(value: () => Unit): Self = StObject.set(x, "onTextChange", js.Any.fromFunction0(value))
    
    inline def setStateReducer(value: (/* type */ StateChange, /* nextState */ PartialState, /* currentState */ State) => State): Self = StObject.set(x, "stateReducer", js.Any.fromFunction3(value))
  }
}
