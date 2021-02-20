package typings.awsSdk.ioteventsdataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DetectorState extends StObject {
  
  /**
    * The name of the state.
    */
  var stateName: StateName = js.native
  
  /**
    * The current state of the detector's timers.
    */
  var timers: Timers = js.native
  
  /**
    * The current values of the detector's variables.
    */
  var variables: Variables = js.native
}
object DetectorState {
  
  @scala.inline
  def apply(stateName: StateName, timers: Timers, variables: Variables): DetectorState = {
    val __obj = js.Dynamic.literal(stateName = stateName.asInstanceOf[js.Any], timers = timers.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectorState]
  }
  
  @scala.inline
  implicit class DetectorStateMutableBuilder[Self <: DetectorState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStateName(value: StateName): Self = StObject.set(x, "stateName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimers(value: Timers): Self = StObject.set(x, "timers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimersVarargs(value: Timer*): Self = StObject.set(x, "timers", js.Array(value :_*))
    
    @scala.inline
    def setVariables(value: Variables): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariablesVarargs(value: Variable*): Self = StObject.set(x, "variables", js.Array(value :_*))
  }
}
