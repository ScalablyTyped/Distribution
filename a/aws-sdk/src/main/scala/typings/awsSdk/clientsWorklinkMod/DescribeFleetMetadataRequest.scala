package typings.awsSdk.clientsWorklinkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeFleetMetadataRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the fleet.
    */
  var FleetArn: typings.awsSdk.clientsWorklinkMod.FleetArn
}
object DescribeFleetMetadataRequest {
  
  inline def apply(FleetArn: FleetArn): DescribeFleetMetadataRequest = {
    val __obj = js.Dynamic.literal(FleetArn = FleetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeFleetMetadataRequest]
  }
  
  extension [Self <: DescribeFleetMetadataRequest](x: Self) {
    
    inline def setFleetArn(value: FleetArn): Self = StObject.set(x, "FleetArn", value.asInstanceOf[js.Any])
  }
}
