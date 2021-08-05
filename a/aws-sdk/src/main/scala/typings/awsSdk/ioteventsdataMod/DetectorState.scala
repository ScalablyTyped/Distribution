package typings.awsSdk.ioteventsdataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetectorState extends StObject {
  
  /**
    * The name of the state.
    */
  var stateName: StateName
  
  /**
    * The current state of the detector's timers.
    */
  var timers: Timers
  
  /**
    * The current values of the detector's variables.
    */
  var variables: Variables
}
object DetectorState {
  
  inline def apply(stateName: StateName, timers: Timers, variables: Variables): DetectorState = {
    val __obj = js.Dynamic.literal(stateName = stateName.asInstanceOf[js.Any], timers = timers.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectorState]
  }
  
  extension [Self <: DetectorState](x: Self) {
    
    inline def setStateName(value: StateName): Self = StObject.set(x, "stateName", value.asInstanceOf[js.Any])
    
    inline def setTimers(value: Timers): Self = StObject.set(x, "timers", value.asInstanceOf[js.Any])
    
    inline def setTimersVarargs(value: Timer*): Self = StObject.set(x, "timers", js.Array(value :_*))
    
    inline def setVariables(value: Variables): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
    
    inline def setVariablesVarargs(value: Variable*): Self = StObject.set(x, "variables", js.Array(value :_*))
  }
}
