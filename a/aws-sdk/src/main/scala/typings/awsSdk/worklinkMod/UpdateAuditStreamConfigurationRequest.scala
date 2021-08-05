package typings.awsSdk.worklinkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAuditStreamConfigurationRequest extends StObject {
  
  /**
    * The ARN of the Amazon Kinesis data stream that receives the audit events.
    */
  var AuditStreamArn: js.UndefOr[typings.awsSdk.worklinkMod.AuditStreamArn] = js.undefined
  
  /**
    * The ARN of the fleet.
    */
  var FleetArn: typings.awsSdk.worklinkMod.FleetArn
}
object UpdateAuditStreamConfigurationRequest {
  
  inline def apply(FleetArn: FleetArn): UpdateAuditStreamConfigurationRequest = {
    val __obj = js.Dynamic.literal(FleetArn = FleetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAuditStreamConfigurationRequest]
  }
  
  extension [Self <: UpdateAuditStreamConfigurationRequest](x: Self) {
    
    inline def setAuditStreamArn(value: AuditStreamArn): Self = StObject.set(x, "AuditStreamArn", value.asInstanceOf[js.Any])
    
    inline def setAuditStreamArnUndefined: Self = StObject.set(x, "AuditStreamArn", js.undefined)
    
    inline def setFleetArn(value: FleetArn): Self = StObject.set(x, "FleetArn", value.asInstanceOf[js.Any])
  }
}
