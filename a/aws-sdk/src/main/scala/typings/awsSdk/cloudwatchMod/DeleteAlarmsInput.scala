package typings.awsSdk.cloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteAlarmsInput extends js.Object {
  
  /**
    * The alarms to be deleted.
    */
  var AlarmNames: typings.awsSdk.cloudwatchMod.AlarmNames = js.native
}
object DeleteAlarmsInput {
  
  @scala.inline
  def apply(AlarmNames: AlarmNames): DeleteAlarmsInput = {
    val __obj = js.Dynamic.literal(AlarmNames = AlarmNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAlarmsInput]
  }
  
  @scala.inline
  implicit class DeleteAlarmsInputOps[Self <: DeleteAlarmsInput] (val x: Self) extends AnyVal {
    
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
    def setAlarmNamesVarargs(value: AlarmName*): Self = this.set("AlarmNames", js.Array(value :_*))
    
    @scala.inline
    def setAlarmNames(value: AlarmNames): Self = this.set("AlarmNames", value.asInstanceOf[js.Any])
  }
}
