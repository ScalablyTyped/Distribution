package typings.awsSdk.clientsWorklinkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAuditStreamConfigurationRequest extends StObject {
  
  /**
    * The ARN of the Amazon Kinesis data stream that receives the audit events.
    */
  var AuditStreamArn: js.UndefOr[typings.awsSdk.clientsWorklinkMod.AuditStreamArn] = js.undefined
  
  /**
    * The ARN of the fleet.
    */
  var FleetArn: typings.awsSdk.clientsWorklinkMod.FleetArn
}
object UpdateAuditStreamConfigurationRequest {
  
  inline def apply(FleetArn: FleetArn): UpdateAuditStreamConfigurationRequest = {
    val __obj = js.Dynamic.literal(FleetArn = FleetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAuditStreamConfigurationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateAuditStreamConfigurationRequest] (val x: Self) extends AnyVal {
    
    inline def setAuditStreamArn(value: AuditStreamArn): Self = StObject.set(x, "AuditStreamArn", value.asInstanceOf[js.Any])
    
    inline def setAuditStreamArnUndefined: Self = StObject.set(x, "AuditStreamArn", js.undefined)
    
    inline def setFleetArn(value: FleetArn): Self = StObject.set(x, "FleetArn", value.asInstanceOf[js.Any])
  }
}
