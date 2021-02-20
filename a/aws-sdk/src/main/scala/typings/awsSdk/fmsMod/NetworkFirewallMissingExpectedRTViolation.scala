package typings.awsSdk.fmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetworkFirewallMissingExpectedRTViolation extends StObject {
  
  /**
    * The Availability Zone of a violating subnet. 
    */
  var AvailabilityZone: js.UndefOr[LengthBoundedString] = js.native
  
  /**
    * The resource ID of the current route table that's associated with the subnet, if one is available.
    */
  var CurrentRouteTable: js.UndefOr[ResourceId] = js.native
  
  /**
    * The resource ID of the route table that should be associated with the subnet.
    */
  var ExpectedRouteTable: js.UndefOr[ResourceId] = js.native
  
  /**
    * The resource ID of the VPC associated with a violating subnet.
    */
  var VPC: js.UndefOr[ResourceId] = js.native
  
  /**
    * The ID of the AWS Network Firewall or VPC resource that's in violation.
    */
  var ViolationTarget: js.UndefOr[typings.awsSdk.fmsMod.ViolationTarget] = js.native
}
object NetworkFirewallMissingExpectedRTViolation {
  
  @scala.inline
  def apply(): NetworkFirewallMissingExpectedRTViolation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkFirewallMissingExpectedRTViolation]
  }
  
  @scala.inline
  implicit class NetworkFirewallMissingExpectedRTViolationMutableBuilder[Self <: NetworkFirewallMissingExpectedRTViolation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailabilityZone(value: LengthBoundedString): Self = StObject.set(x, "AvailabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityZoneUndefined: Self = StObject.set(x, "AvailabilityZone", js.undefined)
    
    @scala.inline
    def setCurrentRouteTable(value: ResourceId): Self = StObject.set(x, "CurrentRouteTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentRouteTableUndefined: Self = StObject.set(x, "CurrentRouteTable", js.undefined)
    
    @scala.inline
    def setExpectedRouteTable(value: ResourceId): Self = StObject.set(x, "ExpectedRouteTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpectedRouteTableUndefined: Self = StObject.set(x, "ExpectedRouteTable", js.undefined)
    
    @scala.inline
    def setVPC(value: ResourceId): Self = StObject.set(x, "VPC", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVPCUndefined: Self = StObject.set(x, "VPC", js.undefined)
    
    @scala.inline
    def setViolationTarget(value: ViolationTarget): Self = StObject.set(x, "ViolationTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViolationTargetUndefined: Self = StObject.set(x, "ViolationTarget", js.undefined)
  }
}
