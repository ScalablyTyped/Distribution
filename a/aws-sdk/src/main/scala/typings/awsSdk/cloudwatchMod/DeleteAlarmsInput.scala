package typings.awsSdk.cloudwatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteAlarmsInput extends StObject {
  
  /**
    * The alarms to be deleted.
    */
  var AlarmNames: typings.awsSdk.cloudwatchMod.AlarmNames
}
object DeleteAlarmsInput {
  
  @scala.inline
  def apply(AlarmNames: AlarmNames): DeleteAlarmsInput = {
    val __obj = js.Dynamic.literal(AlarmNames = AlarmNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAlarmsInput]
  }
  
  @scala.inline
  implicit class DeleteAlarmsInputMutableBuilder[Self <: DeleteAlarmsInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlarmNames(value: AlarmNames): Self = StObject.set(x, "AlarmNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlarmNamesVarargs(value: AlarmName*): Self = StObject.set(x, "AlarmNames", js.Array(value :_*))
  }
}
