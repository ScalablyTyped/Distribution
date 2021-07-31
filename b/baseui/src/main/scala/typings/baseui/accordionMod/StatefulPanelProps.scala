package typings.baseui.accordionMod

import typings.baseui.baseuiStrings.expand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.baseui.accordionMod.SharedStatefulPanelContainerProps because var conflicts: onChange. Inlined initialState, stateReducer */ trait StatefulPanelProps
  extends StObject
     with SharedPanelProps {
  
  var initialState: js.UndefOr[PanelState] = js.undefined
  
  var stateReducer: js.UndefOr[StateReducer[PanelState]] = js.undefined
}
object StatefulPanelProps {
  
  @scala.inline
  def apply(): StatefulPanelProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatefulPanelProps]
  }
  
  @scala.inline
  implicit class StatefulPanelPropsMutableBuilder[Self <: StatefulPanelProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInitialState(value: PanelState): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
    
    @scala.inline
    def setStateReducer(value: (expand, PanelState, PanelState) => PanelState): Self = StObject.set(x, "stateReducer", js.Any.fromFunction3(value))
    
    @scala.inline
    def setStateReducerUndefined: Self = StObject.set(x, "stateReducer", js.undefined)
  }
}
