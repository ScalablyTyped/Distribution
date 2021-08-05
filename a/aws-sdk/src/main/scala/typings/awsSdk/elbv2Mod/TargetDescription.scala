package typings.awsSdk.elbv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetDescription extends StObject {
  
  /**
    * An Availability Zone or all. This determines whether the target receives traffic from the load balancer nodes in the specified Availability Zone or from all enabled Availability Zones for the load balancer. This parameter is not supported if the target type of the target group is instance. If the target type is ip and the IP address is in a subnet of the VPC for the target group, the Availability Zone is automatically detected and this parameter is optional. If the IP address is outside the VPC, this parameter is required. With an Application Load Balancer, if the target type is ip and the IP address is outside the VPC for the target group, the only supported value is all. If the target type is lambda, this parameter is optional and the only supported value is all.
    */
  var AvailabilityZone: js.UndefOr[ZoneName] = js.undefined
  
  /**
    * The ID of the target. If the target type of the target group is instance, specify an instance ID. If the target type is ip, specify an IP address. If the target type is lambda, specify the ARN of the Lambda function.
    */
  var Id: TargetId
  
  /**
    * The port on which the target is listening. If the target group protocol is GENEVE, the supported port is 6081. Not used if the target is a Lambda function.
    */
  var Port: js.UndefOr[typings.awsSdk.elbv2Mod.Port] = js.undefined
}
object TargetDescription {
  
  inline def apply(Id: TargetId): TargetDescription = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetDescription]
  }
  
  extension [Self <: TargetDescription](x: Self) {
    
    inline def setAvailabilityZone(value: ZoneName): Self = StObject.set(x, "AvailabilityZone", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZoneUndefined: Self = StObject.set(x, "AvailabilityZone", js.undefined)
    
    inline def setId(value: TargetId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setPort(value: Port): Self = StObject.set(x, "Port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "Port", js.undefined)
  }
}
