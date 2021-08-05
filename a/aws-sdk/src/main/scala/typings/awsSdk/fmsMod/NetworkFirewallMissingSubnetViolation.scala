package typings.awsSdk.fmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkFirewallMissingSubnetViolation extends StObject {
  
  /**
    * The Availability Zone of a violating subnet. 
    */
  var AvailabilityZone: js.UndefOr[LengthBoundedString] = js.undefined
  
  /**
    * The reason the resource has this violation, if one is available. 
    */
  var TargetViolationReason: js.UndefOr[typings.awsSdk.fmsMod.TargetViolationReason] = js.undefined
  
  /**
    * The resource ID of the VPC associated with a violating subnet.
    */
  var VPC: js.UndefOr[ResourceId] = js.undefined
  
  /**
    * The ID of the AWS Network Firewall or VPC resource that's in violation.
    */
  var ViolationTarget: js.UndefOr[typings.awsSdk.fmsMod.ViolationTarget] = js.undefined
}
object NetworkFirewallMissingSubnetViolation {
  
  inline def apply(): NetworkFirewallMissingSubnetViolation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkFirewallMissingSubnetViolation]
  }
  
  extension [Self <: NetworkFirewallMissingSubnetViolation](x: Self) {
    
    inline def setAvailabilityZone(value: LengthBoundedString): Self = StObject.set(x, "AvailabilityZone", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZoneUndefined: Self = StObject.set(x, "AvailabilityZone", js.undefined)
    
    inline def setTargetViolationReason(value: TargetViolationReason): Self = StObject.set(x, "TargetViolationReason", value.asInstanceOf[js.Any])
    
    inline def setTargetViolationReasonUndefined: Self = StObject.set(x, "TargetViolationReason", js.undefined)
    
    inline def setVPC(value: ResourceId): Self = StObject.set(x, "VPC", value.asInstanceOf[js.Any])
    
    inline def setVPCUndefined: Self = StObject.set(x, "VPC", js.undefined)
    
    inline def setViolationTarget(value: ViolationTarget): Self = StObject.set(x, "ViolationTarget", value.asInstanceOf[js.Any])
    
    inline def setViolationTargetUndefined: Self = StObject.set(x, "ViolationTarget", js.undefined)
  }
}
