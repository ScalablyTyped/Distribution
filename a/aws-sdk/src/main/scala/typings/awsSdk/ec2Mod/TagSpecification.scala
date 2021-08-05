package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagSpecification extends StObject {
  
  /**
    * The type of resource to tag. Currently, the resource types that support tagging on creation are: capacity-reservation | carrier-gateway | client-vpn-endpoint | customer-gateway | dedicated-host | dhcp-options | export-image-task | export-instance-task | fleet | fpga-image | host-reservation | import-image-task | import-snapshot-task | instance | internet-gateway | ipv4pool-ec2 | ipv6pool-ec2 | key-pair | launch-template | placement-group | prefix-list | natgateway | network-acl | route-table | security-group | spot-fleet-request | spot-instances-request | snapshot | subnet | traffic-mirror-filter | traffic-mirror-session | traffic-mirror-target | transit-gateway | transit-gateway-attachment | transit-gateway-route-table | volume |vpc |  vpc-peering-connection | vpc-endpoint (for interface and gateway endpoints) | vpc-endpoint-service (for AWS PrivateLink) | vpc-flow-log | vpn-connection | vpn-gateway. To tag a resource after it has been created, see CreateTags.
    */
  var ResourceType: js.UndefOr[typings.awsSdk.ec2Mod.ResourceType] = js.undefined
  
  /**
    * The tags to apply to the resource.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object TagSpecification {
  
  inline def apply(): TagSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TagSpecification]
  }
  
  extension [Self <: TagSpecification](x: Self) {
    
    inline def setResourceType(value: ResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
