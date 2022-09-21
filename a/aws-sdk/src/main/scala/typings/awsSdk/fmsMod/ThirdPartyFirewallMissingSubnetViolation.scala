package typings.awsSdk.fmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThirdPartyFirewallMissingSubnetViolation extends StObject {
  
  /**
    * The Availability Zone of a subnet that's causing the violation.
    */
  var AvailabilityZone: js.UndefOr[LengthBoundedString] = js.undefined
  
  /**
    * The reason the resource is causing the violation, if a reason is available.
    */
  var TargetViolationReason: js.UndefOr[typings.awsSdk.fmsMod.TargetViolationReason] = js.undefined
  
  /**
    * The resource ID of the VPC associated with a subnet that's causing the violation.
    */
  var VPC: js.UndefOr[ResourceId] = js.undefined
  
  /**
    * The ID of the third-party firewall or VPC resource that's causing the violation.
    */
  var ViolationTarget: js.UndefOr[typings.awsSdk.fmsMod.ViolationTarget] = js.undefined
}
object ThirdPartyFirewallMissingSubnetViolation {
  
  inline def apply(): ThirdPartyFirewallMissingSubnetViolation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThirdPartyFirewallMissingSubnetViolation]
  }
  
  extension [Self <: ThirdPartyFirewallMissingSubnetViolation](x: Self) {
    
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
