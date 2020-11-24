package typings.awsSdk.ioteventsdataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DetectorStateDefinition extends js.Object {
  
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
  implicit class DetectorStateDefinitionOps[Self <: DetectorStateDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setStateName(value: StateName): Self = this.set("stateName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimersVarargs(value: TimerDefinition*): Self = this.set("timers", js.Array(value :_*))
    
    @scala.inline
    def setTimers(value: TimerDefinitions): Self = this.set("timers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariablesVarargs(value: VariableDefinition*): Self = this.set("variables", js.Array(value :_*))
    
    @scala.inline
    def setVariables(value: VariableDefinitions): Self = this.set("variables", value.asInstanceOf[js.Any])
  }
}
