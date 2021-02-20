package typings.awsSdk.mturkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotifyWorkersResponse extends StObject {
  
  /**
    *  When MTurk sends notifications to the list of Workers, it returns back any failures it encounters in this list of NotifyWorkersFailureStatus objects. 
    */
  var NotifyWorkersFailureStatuses: js.UndefOr[NotifyWorkersFailureStatusList] = js.native
}
object NotifyWorkersResponse {
  
  @scala.inline
  def apply(): NotifyWorkersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotifyWorkersResponse]
  }
  
  @scala.inline
  implicit class NotifyWorkersResponseMutableBuilder[Self <: NotifyWorkersResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNotifyWorkersFailureStatuses(value: NotifyWorkersFailureStatusList): Self = StObject.set(x, "NotifyWorkersFailureStatuses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotifyWorkersFailureStatusesUndefined: Self = StObject.set(x, "NotifyWorkersFailureStatuses", js.undefined)
    
    @scala.inline
    def setNotifyWorkersFailureStatusesVarargs(value: NotifyWorkersFailureStatus*): Self = StObject.set(x, "NotifyWorkersFailureStatuses", js.Array(value :_*))
  }
}
