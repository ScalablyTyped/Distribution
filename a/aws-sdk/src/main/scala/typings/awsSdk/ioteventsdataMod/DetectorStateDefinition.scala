package typings.awsSdk.ioteventsdataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DetectorStateDefinition extends StObject {
  
  /**
    * The name of the new state of the detector (instance).
    */
  var stateName: StateName = js.native
  
  /**
    * The new values of the detector's timers. Any timer whose value isn't specified is cleared, and its timeout event won't occur.
    */
  var timers: TimerDefinitions = js.native
  
  /**
    * The new values of the detector's variables. Any variable whose value isn't specified is cleared.
    */
  var variables: VariableDefinitions = js.native
}
object DetectorStateDefinition {
  
  @scala.inline
  def apply(stateName: StateName, timers: TimerDefinitions, variables: VariableDefinitions): DetectorStateDefinition = {
    val __obj = js.Dynamic.literal(stateName = stateName.asInstanceOf[js.Any], timers = timers.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectorStateDefinition]
  }
  
  @scala.inline
  implicit class DetectorStateDefinitionMutableBuilder[Self <: DetectorStateDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStateName(value: StateName): Self = StObject.set(x, "stateName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimers(value: TimerDefinitions): Self = StObject.set(x, "timers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimersVarargs(value: TimerDefinition*): Self = StObject.set(x, "timers", js.Array(value :_*))
    
    @scala.inline
    def setVariables(value: VariableDefinitions): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariablesVarargs(value: VariableDefinition*): Self = StObject.set(x, "variables", js.Array(value :_*))
  }
}
