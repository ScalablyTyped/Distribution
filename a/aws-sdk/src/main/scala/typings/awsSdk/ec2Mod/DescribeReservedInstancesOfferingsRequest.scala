package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeReservedInstancesOfferingsRequest extends js.Object {
  
  /**
    * The Availability Zone in which the Reserved Instance can be used.
    */
  var AvailabilityZone: js.UndefOr[String] = js.native
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * One or more filters.    availability-zone - The Availability Zone where the Reserved Instance can be used.    duration - The duration of the Reserved Instance (for example, one year or three years), in seconds (31536000 | 94608000).    fixed-price - The purchase price of the Reserved Instance (for example, 9800.0).    instance-type - The instance type that is covered by the reservation.    marketplace - Set to true to show only Reserved Instance Marketplace offerings. When this filter is not used, which is the default behavior, all offerings from both AWS and the Reserved Instance Marketplace are listed.    product-description - The Reserved Instance product platform description. Instances that include (Amazon VPC) in the product platform description will only be displayed to EC2-Classic account holders and are for use with Amazon VPC. (Linux/UNIX | Linux/UNIX (Amazon VPC) | SUSE Linux | SUSE Linux (Amazon VPC) | Red Hat Enterprise Linux | Red Hat Enterprise Linux (Amazon VPC) | Windows | Windows (Amazon VPC) | Windows with SQL Server Standard | Windows with SQL Server Standard (Amazon VPC) | Windows with SQL Server Web |  Windows with SQL Server Web (Amazon VPC) | Windows with SQL Server Enterprise | Windows with SQL Server Enterprise (Amazon VPC))     reserved-instances-offering-id - The Reserved Instances offering ID.    scope - The scope of the Reserved Instance (Availability Zone or Region).    usage-price - The usage price of the Reserved Instance, per hour (for example, 0.84).  
    */
  var Filters: js.UndefOr[FilterList] = js.native
  
  /**
    * Include Reserved Instance Marketplace offerings in the response.
    */
  var IncludeMarketplace: js.UndefOr[Boolean] = js.native
  
  /**
    * The tenancy of the instances covered by the reservation. A Reserved Instance with a tenancy of dedicated is applied to instances that run in a VPC on single-tenant hardware (i.e., Dedicated Instances).  Important: The host value cannot be used with this parameter. Use the default or dedicated values only. Default: default 
    */
  var InstanceTenancy: js.UndefOr[Tenancy] = js.native
  
  /**
    * The instance type that the reservation will cover (for example, m1.small). For more information, see Instance Types in the Amazon Elastic Compute Cloud User Guide.
    */
  var InstanceType: js.UndefOr[typings.awsSdk.ec2Mod.InstanceType] = js.native
  
  /**
    * The maximum duration (in seconds) to filter when searching for offerings. Default: 94608000 (3 years)
    */
  var MaxDuration: js.UndefOr[Long] = js.native
  
  /**
    * The maximum number of instances to filter when searching for offerings. Default: 20
    */
  var MaxInstanceCount: js.UndefOr[Integer] = js.native
  
  /**
    * The maximum number of results to return for the request in a single page. The remaining results of the initial request can be seen by sending another request with the returned NextToken value. The maximum is 100. Default: 100
    */
  var MaxResults: js.UndefOr[Integer] = js.native
  
  /**
    * The minimum duration (in seconds) to filter when searching for offerings. Default: 2592000 (1 month)
    */
  var MinDuration: js.UndefOr[Long] = js.native
  
  /**
    * The token to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * The offering class of the Reserved Instance. Can be standard or convertible.
    */
  var OfferingClass: js.UndefOr[OfferingClassType] = js.native
  
  /**
    * The Reserved Instance offering type. If you are using tools that predate the 2011-11-01 API version, you only have access to the Medium Utilization Reserved Instance offering type. 
    */
  var OfferingType: js.UndefOr[OfferingTypeValues] = js.native
  
  /**
    * The Reserved Instance product platform description. Instances that include (Amazon VPC) in the description are for use with Amazon VPC.
    */
  var ProductDescription: js.UndefOr[RIProductDescription] = js.native
  
  /**
    * One or more Reserved Instances offering IDs.
    */
  var ReservedInstancesOfferingIds: js.UndefOr[ReservedInstancesOfferingIdStringList] = js.native
}
object DescribeReservedInstancesOfferingsRequest {
  
  @scala.inline
  def apply(): DescribeReservedInstancesOfferingsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeReservedInstancesOfferingsRequest]
  }
  
  @scala.inline
  implicit class DescribeReservedInstancesOfferingsRequestOps[Self <: DescribeReservedInstancesOfferingsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAvailabilityZone(value: String): Self = this.set("AvailabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvailabilityZone: Self = this.set("AvailabilityZone", js.undefined)
    
    @scala.inline
    def setDryRun(value: Boolean): Self = this.set("DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDryRun: Self = this.set("DryRun", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: Filter*): Self = this.set("Filters", js.Array(value :_*))
    
    @scala.inline
    def setFilters(value: FilterList): Self = this.set("Filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilters: Self = this.set("Filters", js.undefined)
    
    @scala.inline
    def setIncludeMarketplace(value: Boolean): Self = this.set("IncludeMarketplace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeMarketplace: Self = this.set("IncludeMarketplace", js.undefined)
    
    @scala.inline
    def setInstanceTenancy(value: Tenancy): Self = this.set("InstanceTenancy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceTenancy: Self = this.set("InstanceTenancy", js.undefined)
    
    @scala.inline
    def setInstanceType(value: InstanceType): Self = this.set("InstanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceType: Self = this.set("InstanceType", js.undefined)
    
    @scala.inline
    def setMaxDuration(value: Long): Self = this.set("MaxDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxDuration: Self = this.set("MaxDuration", js.undefined)
    
    @scala.inline
    def setMaxInstanceCount(value: Integer): Self = this.set("MaxInstanceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxInstanceCount: Self = this.set("MaxInstanceCount", js.undefined)
    
    @scala.inline
    def setMaxResults(value: Integer): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    
    @scala.inline
    def setMinDuration(value: Long): Self = this.set("MinDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinDuration: Self = this.set("MinDuration", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setOfferingClass(value: OfferingClassType): Self = this.set("OfferingClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOfferingClass: Self = this.set("OfferingClass", js.undefined)
    
    @scala.inline
    def setOfferingType(value: OfferingTypeValues): Self = this.set("OfferingType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOfferingType: Self = this.set("OfferingType", js.undefined)
    
    @scala.inline
    def setProductDescription(value: RIProductDescription): Self = this.set("ProductDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductDescription: Self = this.set("ProductDescription", js.undefined)
    
    @scala.inline
    def setReservedInstancesOfferingIdsVarargs(value: ReservedInstancesOfferingId*): Self = this.set("ReservedInstancesOfferingIds", js.Array(value :_*))
    
    @scala.inline
    def setReservedInstancesOfferingIds(value: ReservedInstancesOfferingIdStringList): Self = this.set("ReservedInstancesOfferingIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReservedInstancesOfferingIds: Self = this.set("ReservedInstancesOfferingIds", js.undefined)
  }
}
