package typings.awsSdk.ioteventsdataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimerDefinition extends js.Object {
  
  /**
    * The name of the timer.
    */
  var name: TimerName = js.native
  
  /**
    * The new setting of the timer (the number of seconds before the timer elapses).
    */
  var seconds: Seconds = js.native
}
object TimerDefinition {
  
  @scala.inline
  def apply(name: TimerName, seconds: Seconds): TimerDefinition = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], seconds = seconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimerDefinition]
  }
  
  @scala.inline
  implicit class TimerDefinitionOps[Self <: TimerDefinition] (val x: Self) extends AnyVal {
    
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
    def setName(value: TimerName): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeconds(value: Seconds): Self = this.set("seconds", value.asInstanceOf[js.Any])
  }
}
