package typings.awsSdk.resourcegroupstaggingapiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetComplianceSummaryInput extends StObject {
  
  /**
    * A list of attributes to group the counts of noncompliant resources by. If supplied, the counts are sorted by those attributes.
    */
  var GroupBy: js.UndefOr[typings.awsSdk.resourcegroupstaggingapiMod.GroupBy] = js.native
  
  /**
    * A limit that restricts the number of results that are returned per page.
    */
  var MaxResults: js.UndefOr[MaxResultsGetComplianceSummary] = js.native
  
  /**
    * A string that indicates that additional data is available. Leave this value empty for your initial request. If the response includes a PaginationToken, use that string for this value to request an additional page of data.
    */
  var PaginationToken: js.UndefOr[typings.awsSdk.resourcegroupstaggingapiMod.PaginationToken] = js.native
  
  /**
    * A list of Regions to limit the output by. If you use this parameter, the count of returned noncompliant resources includes only resources in the specified Regions.
    */
  var RegionFilters: js.UndefOr[RegionFilterList] = js.native
  
  /**
    * The constraints on the resources that you want returned. The format of each resource type is service[:resourceType]. For example, specifying a resource type of ec2 returns all Amazon EC2 resources (which includes EC2 instances). Specifying a resource type of ec2:instance returns only EC2 instances.  The string for each service name and resource type is the same as that embedded in a resource's Amazon Resource Name (ARN). Consult the AWS General Reference for the following:   For a list of service name strings, see AWS Service Namespaces.   For resource type strings, see Example ARNs.   For more information about ARNs, see Amazon Resource Names (ARNs) and AWS Service Namespaces.   You can specify multiple resource types by using an array. The array can include up to 100 items. Note that the length constraint requirement applies to each resource type filter. 
    */
  var ResourceTypeFilters: js.UndefOr[ResourceTypeFilterList] = js.native
  
  /**
    * A list of tag keys to limit the output by. If you use this parameter, the count of returned noncompliant resources includes only resources that have the specified tag keys.
    */
  var TagKeyFilters: js.UndefOr[TagKeyFilterList] = js.native
  
  /**
    * The target identifiers (usually, specific account IDs) to limit the output by. If you use this parameter, the count of returned noncompliant resources includes only resources with the specified target IDs.
    */
  var TargetIdFilters: js.UndefOr[TargetIdFilterList] = js.native
}
object GetComplianceSummaryInput {
  
  @scala.inline
  def apply(): GetComplianceSummaryInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetComplianceSummaryInput]
  }
  
  @scala.inline
  implicit class GetComplianceSummaryInputMutableBuilder[Self <: GetComplianceSummaryInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroupBy(value: GroupBy): Self = StObject.set(x, "GroupBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupByUndefined: Self = StObject.set(x, "GroupBy", js.undefined)
    
    @scala.inline
    def setGroupByVarargs(value: GroupByAttribute*): Self = StObject.set(x, "GroupBy", js.Array(value :_*))
    
    @scala.inline
    def setMaxResults(value: MaxResultsGetComplianceSummary): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setPaginationToken(value: PaginationToken): Self = StObject.set(x, "PaginationToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaginationTokenUndefined: Self = StObject.set(x, "PaginationToken", js.undefined)
    
    @scala.inline
    def setRegionFilters(value: RegionFilterList): Self = StObject.set(x, "RegionFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionFiltersUndefined: Self = StObject.set(x, "RegionFilters", js.undefined)
    
    @scala.inline
    def setRegionFiltersVarargs(value: Region*): Self = StObject.set(x, "RegionFilters", js.Array(value :_*))
    
    @scala.inline
    def setResourceTypeFilters(value: ResourceTypeFilterList): Self = StObject.set(x, "ResourceTypeFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceTypeFiltersUndefined: Self = StObject.set(x, "ResourceTypeFilters", js.undefined)
    
    @scala.inline
    def setResourceTypeFiltersVarargs(value: AmazonResourceType*): Self = StObject.set(x, "ResourceTypeFilters", js.Array(value :_*))
    
    @scala.inline
    def setTagKeyFilters(value: TagKeyFilterList): Self = StObject.set(x, "TagKeyFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagKeyFiltersUndefined: Self = StObject.set(x, "TagKeyFilters", js.undefined)
    
    @scala.inline
    def setTagKeyFiltersVarargs(value: TagKey*): Self = StObject.set(x, "TagKeyFilters", js.Array(value :_*))
    
    @scala.inline
    def setTargetIdFilters(value: TargetIdFilterList): Self = StObject.set(x, "TargetIdFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetIdFiltersUndefined: Self = StObject.set(x, "TargetIdFilters", js.undefined)
    
    @scala.inline
    def setTargetIdFiltersVarargs(value: TargetId*): Self = StObject.set(x, "TargetIdFilters", js.Array(value :_*))
  }
}
