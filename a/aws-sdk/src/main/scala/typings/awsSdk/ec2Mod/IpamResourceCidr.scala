package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IpamResourceCidr extends StObject {
  
  /**
    * The compliance status of the IPAM resource. For more information on compliance statuses, see Monitor CIDR usage by resource in the Amazon VPC IPAM User Guide.
    */
  var ComplianceStatus: js.UndefOr[IpamComplianceStatus] = js.undefined
  
  /**
    * The percentage of IP address space in use. To convert the decimal to a percentage, multiply the decimal by 100. Note the following:   For a resources that are VPCs, this is the percentage of IP address space in the VPC that's taken up by subnet CIDRs.    For resources that are subnets, if the subnet has an IPv4 CIDR provisioned to it, this is the percentage of IPv4 address space in the subnet that's in use. If the subnet has an IPv6 CIDR provisioned to it, the percentage of IPv6 address space in use is not represented. The percentage of IPv6 address space in use cannot currently be calculated.    For resources that are public IPv4 pools, this is the percentage of IP address space in the pool that's been allocated to Elastic IP addresses (EIPs).   
    */
  var IpUsage: js.UndefOr[BoxedDouble] = js.undefined
  
  /**
    * The IPAM ID for an IPAM resource.
    */
  var IpamId: js.UndefOr[typings.awsSdk.ec2Mod.IpamId] = js.undefined
  
  /**
    * The pool ID for an IPAM resource.
    */
  var IpamPoolId: js.UndefOr[typings.awsSdk.ec2Mod.IpamPoolId] = js.undefined
  
  /**
    * The scope ID for an IPAM resource.
    */
  var IpamScopeId: js.UndefOr[typings.awsSdk.ec2Mod.IpamScopeId] = js.undefined
  
  /**
    * The management state of the resource. For more information about management states, see Monitor CIDR usage by resource in the Amazon VPC IPAM User Guide.
    */
  var ManagementState: js.UndefOr[IpamManagementState] = js.undefined
  
  /**
    * The overlap status of an IPAM resource. The overlap status tells you if the CIDR for a resource overlaps with another CIDR in the scope. For more information on overlap statuses, see Monitor CIDR usage by resource in the Amazon VPC IPAM User Guide.
    */
  var OverlapStatus: js.UndefOr[IpamOverlapStatus] = js.undefined
  
  /**
    * The CIDR for an IPAM resource.
    */
  var ResourceCidr: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of an IPAM resource.
    */
  var ResourceId: js.UndefOr[String] = js.undefined
  
  /**
    * The name of an IPAM resource.
    */
  var ResourceName: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Web Services account number of the owner of an IPAM resource.
    */
  var ResourceOwnerId: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Web Services Region for an IPAM resource.
    */
  var ResourceRegion: js.UndefOr[String] = js.undefined
  
  /**
    * The tags for an IPAM resource.
    */
  var ResourceTags: js.UndefOr[IpamResourceTagList] = js.undefined
  
  /**
    * The type of IPAM resource.
    */
  var ResourceType: js.UndefOr[IpamResourceType] = js.undefined
  
  /**
    * The ID of a VPC.
    */
  var VpcId: js.UndefOr[String] = js.undefined
}
object IpamResourceCidr {
  
  inline def apply(): IpamResourceCidr = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IpamResourceCidr]
  }
  
  extension [Self <: IpamResourceCidr](x: Self) {
    
    inline def setComplianceStatus(value: IpamComplianceStatus): Self = StObject.set(x, "ComplianceStatus", value.asInstanceOf[js.Any])
    
    inline def setComplianceStatusUndefined: Self = StObject.set(x, "ComplianceStatus", js.undefined)
    
    inline def setIpUsage(value: BoxedDouble): Self = StObject.set(x, "IpUsage", value.asInstanceOf[js.Any])
    
    inline def setIpUsageUndefined: Self = StObject.set(x, "IpUsage", js.undefined)
    
    inline def setIpamId(value: IpamId): Self = StObject.set(x, "IpamId", value.asInstanceOf[js.Any])
    
    inline def setIpamIdUndefined: Self = StObject.set(x, "IpamId", js.undefined)
    
    inline def setIpamPoolId(value: IpamPoolId): Self = StObject.set(x, "IpamPoolId", value.asInstanceOf[js.Any])
    
    inline def setIpamPoolIdUndefined: Self = StObject.set(x, "IpamPoolId", js.undefined)
    
    inline def setIpamScopeId(value: IpamScopeId): Self = StObject.set(x, "IpamScopeId", value.asInstanceOf[js.Any])
    
    inline def setIpamScopeIdUndefined: Self = StObject.set(x, "IpamScopeId", js.undefined)
    
    inline def setManagementState(value: IpamManagementState): Self = StObject.set(x, "ManagementState", value.asInstanceOf[js.Any])
    
    inline def setManagementStateUndefined: Self = StObject.set(x, "ManagementState", js.undefined)
    
    inline def setOverlapStatus(value: IpamOverlapStatus): Self = StObject.set(x, "OverlapStatus", value.asInstanceOf[js.Any])
    
    inline def setOverlapStatusUndefined: Self = StObject.set(x, "OverlapStatus", js.undefined)
    
    inline def setResourceCidr(value: String): Self = StObject.set(x, "ResourceCidr", value.asInstanceOf[js.Any])
    
    inline def setResourceCidrUndefined: Self = StObject.set(x, "ResourceCidr", js.undefined)
    
    inline def setResourceId(value: String): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceIdUndefined: Self = StObject.set(x, "ResourceId", js.undefined)
    
    inline def setResourceName(value: String): Self = StObject.set(x, "ResourceName", value.asInstanceOf[js.Any])
    
    inline def setResourceNameUndefined: Self = StObject.set(x, "ResourceName", js.undefined)
    
    inline def setResourceOwnerId(value: String): Self = StObject.set(x, "ResourceOwnerId", value.asInstanceOf[js.Any])
    
    inline def setResourceOwnerIdUndefined: Self = StObject.set(x, "ResourceOwnerId", js.undefined)
    
    inline def setResourceRegion(value: String): Self = StObject.set(x, "ResourceRegion", value.asInstanceOf[js.Any])
    
    inline def setResourceRegionUndefined: Self = StObject.set(x, "ResourceRegion", js.undefined)
    
    inline def setResourceTags(value: IpamResourceTagList): Self = StObject.set(x, "ResourceTags", value.asInstanceOf[js.Any])
    
    inline def setResourceTagsUndefined: Self = StObject.set(x, "ResourceTags", js.undefined)
    
    inline def setResourceTagsVarargs(value: IpamResourceTag*): Self = StObject.set(x, "ResourceTags", js.Array(value*))
    
    inline def setResourceType(value: IpamResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
    
    inline def setVpcId(value: String): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    inline def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
  }
}
