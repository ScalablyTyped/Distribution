package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAddressesRequest extends StObject {
  
  /**
    * [EC2-VPC] Information about the allocation IDs.
    */
  var AllocationIds: js.UndefOr[AllocationIdList] = js.undefined
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * One or more filters. Filter names and values are case-sensitive.    allocation-id - [EC2-VPC] The allocation ID for the address.    association-id - [EC2-VPC] The association ID for the address.    domain - Indicates whether the address is for use in EC2-Classic (standard) or in a VPC (vpc).    instance-id - The ID of the instance the address is associated with, if any.    network-border-group - A unique set of Availability Zones, Local Zones, or Wavelength Zones from where AWS advertises IP addresses.     network-interface-id - [EC2-VPC] The ID of the network interface that the address is associated with, if any.    network-interface-owner-id - The AWS account ID of the owner.    private-ip-address - [EC2-VPC] The private IP address associated with the Elastic IP address.    public-ip - The Elastic IP address, or the carrier IP address.    tag:&lt;key&gt; - The key/value combination of a tag assigned to the resource. Use the tag key in the filter name and the tag value as the filter value. For example, to find all resources that have a tag with the key Owner and the value TeamA, specify tag:Owner for the filter name and TeamA for the filter value.    tag-key - The key of a tag assigned to the resource. Use this filter to find all resources assigned a tag with a specific key, regardless of the tag value.  
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
  
  /**
    * One or more Elastic IP addresses. Default: Describes all your Elastic IP addresses.
    */
  var PublicIps: js.UndefOr[PublicIpStringList] = js.undefined
}
object DescribeAddressesRequest {
  
  inline def apply(): DescribeAddressesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAddressesRequest]
  }
  
  extension [Self <: DescribeAddressesRequest](x: Self) {
    
    inline def setAllocationIds(value: AllocationIdList): Self = StObject.set(x, "AllocationIds", value.asInstanceOf[js.Any])
    
    inline def setAllocationIdsUndefined: Self = StObject.set(x, "AllocationIds", js.undefined)
    
    inline def setAllocationIdsVarargs(value: AllocationId*): Self = StObject.set(x, "AllocationIds", js.Array(value :_*))
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setFilters(value: FilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "Filters", js.Array(value :_*))
    
    inline def setPublicIps(value: PublicIpStringList): Self = StObject.set(x, "PublicIps", value.asInstanceOf[js.Any])
    
    inline def setPublicIpsUndefined: Self = StObject.set(x, "PublicIps", js.undefined)
    
    inline def setPublicIpsVarargs(value: String*): Self = StObject.set(x, "PublicIps", js.Array(value :_*))
  }
}
