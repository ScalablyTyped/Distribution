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
  
  inline def apply(): StatefulPanelProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatefulPanelProps]
  }
  
  extension [Self <: StatefulPanelProps](x: Self) {
    
    inline def setInitialState(value: PanelState): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
    
    inline def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
    
    inline def setStateReducer(value: (expand, PanelState, PanelState) => PanelState): Self = StObject.set(x, "stateReducer", js.Any.fromFunction3(value))
    
    inline def setStateReducerUndefined: Self = StObject.set(x, "stateReducer", js.undefined)
  }
}
