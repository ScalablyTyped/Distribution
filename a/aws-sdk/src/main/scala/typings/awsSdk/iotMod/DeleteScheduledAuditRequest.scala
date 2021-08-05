package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteScheduledAuditRequest extends StObject {
  
  /**
    * The name of the scheduled audit you want to delete.
    */
  var scheduledAuditName: ScheduledAuditName
}
object DeleteScheduledAuditRequest {
  
  inline def apply(scheduledAuditName: ScheduledAuditName): DeleteScheduledAuditRequest = {
    val __obj = js.Dynamic.literal(scheduledAuditName = scheduledAuditName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteScheduledAuditRequest]
  }
  
  extension [Self <: DeleteScheduledAuditRequest](x: Self) {
    
    inline def setScheduledAuditName(value: ScheduledAuditName): Self = StObject.set(x, "scheduledAuditName", value.asInstanceOf[js.Any])
  }
}
