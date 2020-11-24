package typings.awsSdk.ioteventsdataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DetectorState extends js.Object {
  
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
  implicit class DetectorStateOps[Self <: DetectorState] (val x: Self) extends AnyVal {
    
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
    def setTimersVarargs(value: Timer*): Self = this.set("timers", js.Array(value :_*))
    
    @scala.inline
    def setTimers(value: Timers): Self = this.set("timers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariablesVarargs(value: Variable*): Self = this.set("variables", js.Array(value :_*))
    
    @scala.inline
    def setVariables(value: Variables): Self = this.set("variables", value.asInstanceOf[js.Any])
  }
}
