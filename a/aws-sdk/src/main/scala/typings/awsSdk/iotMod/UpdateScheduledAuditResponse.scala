package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateScheduledAuditResponse extends StObject {
  
  /**
    * The ARN of the scheduled audit.
    */
  var scheduledAuditArn: js.UndefOr[ScheduledAuditArn] = js.native
}
object UpdateScheduledAuditResponse {
  
  @scala.inline
  def apply(): UpdateScheduledAuditResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateScheduledAuditResponse]
  }
  
  @scala.inline
  implicit class UpdateScheduledAuditResponseMutableBuilder[Self <: UpdateScheduledAuditResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScheduledAuditArn(value: ScheduledAuditArn): Self = StObject.set(x, "scheduledAuditArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduledAuditArnUndefined: Self = StObject.set(x, "scheduledAuditArn", js.undefined)
  }
}
