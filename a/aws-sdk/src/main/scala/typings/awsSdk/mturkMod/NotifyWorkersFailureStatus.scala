package typings.awsSdk.mturkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotifyWorkersFailureStatus extends StObject {
  
  /**
    *  Encoded value for the failure type. 
    */
  var NotifyWorkersFailureCode: js.UndefOr[typings.awsSdk.mturkMod.NotifyWorkersFailureCode] = js.native
  
  /**
    *  A message detailing the reason the Worker could not be notified. 
    */
  var NotifyWorkersFailureMessage: js.UndefOr[String] = js.native
  
  /**
    *  The ID of the Worker.
    */
  var WorkerId: js.UndefOr[CustomerId] = js.native
}
object NotifyWorkersFailureStatus {
  
  @scala.inline
  def apply(): NotifyWorkersFailureStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotifyWorkersFailureStatus]
  }
  
  @scala.inline
  implicit class NotifyWorkersFailureStatusMutableBuilder[Self <: NotifyWorkersFailureStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNotifyWorkersFailureCode(value: NotifyWorkersFailureCode): Self = StObject.set(x, "NotifyWorkersFailureCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotifyWorkersFailureCodeUndefined: Self = StObject.set(x, "NotifyWorkersFailureCode", js.undefined)
    
    @scala.inline
    def setNotifyWorkersFailureMessage(value: String): Self = StObject.set(x, "NotifyWorkersFailureMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotifyWorkersFailureMessageUndefined: Self = StObject.set(x, "NotifyWorkersFailureMessage", js.undefined)
    
    @scala.inline
    def setWorkerId(value: CustomerId): Self = StObject.set(x, "WorkerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkerIdUndefined: Self = StObject.set(x, "WorkerId", js.undefined)
  }
}
