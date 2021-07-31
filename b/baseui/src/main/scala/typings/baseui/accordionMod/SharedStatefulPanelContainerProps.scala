package typings.baseui.accordionMod

import typings.baseui.anon.ExpandedBoolean
import typings.baseui.baseuiStrings.expand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SharedStatefulPanelContainerProps extends StObject {
  
  var initialState: js.UndefOr[PanelState] = js.undefined
  
  var onChange: js.UndefOr[js.Function1[/* args */ ExpandedBoolean, js.Any]] = js.undefined
  
  var stateReducer: js.UndefOr[StateReducer[PanelState]] = js.undefined
}
object SharedStatefulPanelContainerProps {
  
  @scala.inline
  def apply(): SharedStatefulPanelContainerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SharedStatefulPanelContainerProps]
  }
  
  @scala.inline
  implicit class SharedStatefulPanelContainerPropsMutableBuilder[Self <: SharedStatefulPanelContainerProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInitialState(value: PanelState): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
    
    @scala.inline
    def setOnChange(value: /* args */ ExpandedBoolean => js.Any): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    @scala.inline
    def setStateReducer(value: (expand, PanelState, PanelState) => PanelState): Self = StObject.set(x, "stateReducer", js.Any.fromFunction3(value))
    
    @scala.inline
    def setStateReducerUndefined: Self = StObject.set(x, "stateReducer", js.undefined)
  }
}
