package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateScheduledAuditResponse extends StObject {
  
  /**
    * The ARN of the scheduled audit.
    */
  var scheduledAuditArn: js.UndefOr[ScheduledAuditArn] = js.undefined
}
object UpdateScheduledAuditResponse {
  
  inline def apply(): UpdateScheduledAuditResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateScheduledAuditResponse]
  }
  
  extension [Self <: UpdateScheduledAuditResponse](x: Self) {
    
    inline def setScheduledAuditArn(value: ScheduledAuditArn): Self = StObject.set(x, "scheduledAuditArn", value.asInstanceOf[js.Any])
    
    inline def setScheduledAuditArnUndefined: Self = StObject.set(x, "scheduledAuditArn", js.undefined)
  }
}
