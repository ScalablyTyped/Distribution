package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteAlarmRequest extends StObject {
  
  /**
    * The name of the alarm to delete.
    */
  var alarmName: ResourceName = js.native
}
object DeleteAlarmRequest {
  
  @scala.inline
  def apply(alarmName: ResourceName): DeleteAlarmRequest = {
    val __obj = js.Dynamic.literal(alarmName = alarmName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAlarmRequest]
  }
  
  @scala.inline
  implicit class DeleteAlarmRequestMutableBuilder[Self <: DeleteAlarmRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlarmName(value: ResourceName): Self = StObject.set(x, "alarmName", value.asInstanceOf[js.Any])
  }
}
