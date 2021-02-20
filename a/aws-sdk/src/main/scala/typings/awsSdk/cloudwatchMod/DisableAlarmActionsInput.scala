package typings.awsSdk.cloudwatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisableAlarmActionsInput extends StObject {
  
  /**
    * The names of the alarms.
    */
  var AlarmNames: typings.awsSdk.cloudwatchMod.AlarmNames = js.native
}
object DisableAlarmActionsInput {
  
  @scala.inline
  def apply(AlarmNames: AlarmNames): DisableAlarmActionsInput = {
    val __obj = js.Dynamic.literal(AlarmNames = AlarmNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisableAlarmActionsInput]
  }
  
  @scala.inline
  implicit class DisableAlarmActionsInputMutableBuilder[Self <: DisableAlarmActionsInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlarmNames(value: AlarmNames): Self = StObject.set(x, "AlarmNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlarmNamesVarargs(value: AlarmName*): Self = StObject.set(x, "AlarmNames", js.Array(value :_*))
  }
}
