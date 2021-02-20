package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateScheduledAuditResponse extends StObject {
  
  /**
    * The ARN of the scheduled audit.
    */
  var scheduledAuditArn: js.UndefOr[ScheduledAuditArn] = js.native
}
object CreateScheduledAuditResponse {
  
  @scala.inline
  def apply(): CreateScheduledAuditResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateScheduledAuditResponse]
  }
  
  @scala.inline
  implicit class CreateScheduledAuditResponseMutableBuilder[Self <: CreateScheduledAuditResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScheduledAuditArn(value: ScheduledAuditArn): Self = StObject.set(x, "scheduledAuditArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduledAuditArnUndefined: Self = StObject.set(x, "scheduledAuditArn", js.undefined)
  }
}
