package typings.awsSdk.ioteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetTimerAction extends js.Object {
  
  /**
    * The duration of the timer, in seconds. You can use a string expression that includes numbers, variables ($variable.&lt;variable-name&gt;), and input values ($input.&lt;input-name&gt;.&lt;path-to-datum&gt;) as the duration. The range of the duration is 1-31622400 seconds. To ensure accuracy, the minimum duration is 60 seconds. The evaluated result of the duration is rounded down to the nearest whole number. 
    */
  var durationExpression: js.UndefOr[VariableValue] = js.native
  
  /**
    * The number of seconds until the timer expires. The minimum value is 60 seconds to ensure accuracy. The maximum value is 31622400 seconds. 
    */
  var seconds: js.UndefOr[Seconds] = js.native
  
  /**
    * The name of the timer.
    */
  var timerName: TimerName = js.native
}
object SetTimerAction {
  
  @scala.inline
  def apply(timerName: TimerName): SetTimerAction = {
    val __obj = js.Dynamic.literal(timerName = timerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetTimerAction]
  }
  
  @scala.inline
  implicit class SetTimerActionOps[Self <: SetTimerAction] (val x: Self) extends AnyVal {
    
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
    def setTimerName(value: TimerName): Self = this.set("timerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationExpression(value: VariableValue): Self = this.set("durationExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDurationExpression: Self = this.set("durationExpression", js.undefined)
    
    @scala.inline
    def setSeconds(value: Seconds): Self = this.set("seconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeconds: Self = this.set("seconds", js.undefined)
  }
}
