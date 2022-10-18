package typings.awsSdk.clientsWorklinkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAuditStreamConfigurationRequest extends StObject {
  
  /**
    * The ARN of the fleet.
    */
  var FleetArn: typings.awsSdk.clientsWorklinkMod.FleetArn
}
object DescribeAuditStreamConfigurationRequest {
  
  inline def apply(FleetArn: FleetArn): DescribeAuditStreamConfigurationRequest = {
    val __obj = js.Dynamic.literal(FleetArn = FleetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAuditStreamConfigurationRequest]
  }
  
  extension [Self <: DescribeAuditStreamConfigurationRequest](x: Self) {
    
    inline def setFleetArn(value: FleetArn): Self = StObject.set(x, "FleetArn", value.asInstanceOf[js.Any])
  }
}
