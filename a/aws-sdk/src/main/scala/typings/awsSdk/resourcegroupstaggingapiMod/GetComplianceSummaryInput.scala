package typings.awsSdk.resourcegroupstaggingapiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetComplianceSummaryInput extends StObject {
  
  /**
    * Specifies a list of attributes to group the counts of noncompliant resources by. If supplied, the counts are sorted by those attributes.
    */
  var GroupBy: js.UndefOr[typings.awsSdk.resourcegroupstaggingapiMod.GroupBy] = js.undefined
  
  /**
    * Specifies the maximum number of results to be returned in each page. A query can return fewer than this maximum, even if there are more results still to return. You should always check the PaginationToken response value to see if there are more results. You can specify a minimum of 1 and a maximum value of 100.
    */
  var MaxResults: js.UndefOr[MaxResultsGetComplianceSummary] = js.undefined
  
  /**
    * Specifies a PaginationToken response value from a previous request to indicate that you want the next page of results. Leave this parameter empty in your initial request.
    */
  var PaginationToken: js.UndefOr[typings.awsSdk.resourcegroupstaggingapiMod.PaginationToken] = js.undefined
  
  /**
    * Specifies a list of Amazon Web Services Regions to limit the output to. If you use this parameter, the count of returned noncompliant resources includes only resources in the specified Regions.
    */
  var RegionFilters: js.UndefOr[RegionFilterList] = js.undefined
  
  /**
    * Specifies that you want the response to include information for only resources of the specified types. The format of each resource type is service[:resourceType]. For example, specifying a resource type of ec2 returns all Amazon EC2 resources (which includes EC2 instances). Specifying a resource type of ec2:instance returns only EC2 instances. The string for each service name and resource type is the same as that embedded in a resource's Amazon Resource Name (ARN). Consult the  Amazon Web Services General Reference  for the following:   For a list of service name strings, see Amazon Web Services Service Namespaces.   For resource type strings, see Example ARNs.   For more information about ARNs, see Amazon Resource Names (ARNs) and Amazon Web Services Service Namespaces.   You can specify multiple resource types by using a comma separated array. The array can include up to 100 items. Note that the length constraint requirement applies to each resource type filter. 
    */
  var ResourceTypeFilters: js.UndefOr[ResourceTypeFilterList] = js.undefined
  
  /**
    * Specifies that you want the response to include information for only resources that have tags with the specified tag keys. If you use this parameter, the count of returned noncompliant resources includes only resources that have the specified tag keys.
    */
  var TagKeyFilters: js.UndefOr[TagKeyFilterList] = js.undefined
  
  /**
    * Specifies target identifiers (usually, specific account IDs) to limit the output by. If you use this parameter, the count of returned noncompliant resources includes only resources with the specified target IDs.
    */
  var TargetIdFilters: js.UndefOr[TargetIdFilterList] = js.undefined
}
object GetComplianceSummaryInput {
  
  inline def apply(): GetComplianceSummaryInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetComplianceSummaryInput]
  }
  
  extension [Self <: GetComplianceSummaryInput](x: Self) {
    
    inline def setGroupBy(value: GroupBy): Self = StObject.set(x, "GroupBy", value.asInstanceOf[js.Any])
    
    inline def setGroupByUndefined: Self = StObject.set(x, "GroupBy", js.undefined)
    
    inline def setGroupByVarargs(value: GroupByAttribute*): Self = StObject.set(x, "GroupBy", js.Array(value*))
    
    inline def setMaxResults(value: MaxResultsGetComplianceSummary): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setPaginationToken(value: PaginationToken): Self = StObject.set(x, "PaginationToken", value.asInstanceOf[js.Any])
    
    inline def setPaginationTokenUndefined: Self = StObject.set(x, "PaginationToken", js.undefined)
    
    inline def setRegionFilters(value: RegionFilterList): Self = StObject.set(x, "RegionFilters", value.asInstanceOf[js.Any])
    
    inline def setRegionFiltersUndefined: Self = StObject.set(x, "RegionFilters", js.undefined)
    
    inline def setRegionFiltersVarargs(value: Region*): Self = StObject.set(x, "RegionFilters", js.Array(value*))
    
    inline def setResourceTypeFilters(value: ResourceTypeFilterList): Self = StObject.set(x, "ResourceTypeFilters", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeFiltersUndefined: Self = StObject.set(x, "ResourceTypeFilters", js.undefined)
    
    inline def setResourceTypeFiltersVarargs(value: AmazonResourceType*): Self = StObject.set(x, "ResourceTypeFilters", js.Array(value*))
    
    inline def setTagKeyFilters(value: TagKeyFilterList): Self = StObject.set(x, "TagKeyFilters", value.asInstanceOf[js.Any])
    
    inline def setTagKeyFiltersUndefined: Self = StObject.set(x, "TagKeyFilters", js.undefined)
    
    inline def setTagKeyFiltersVarargs(value: TagKey*): Self = StObject.set(x, "TagKeyFilters", js.Array(value*))
    
    inline def setTargetIdFilters(value: TargetIdFilterList): Self = StObject.set(x, "TargetIdFilters", value.asInstanceOf[js.Any])
    
    inline def setTargetIdFiltersUndefined: Self = StObject.set(x, "TargetIdFilters", js.undefined)
    
    inline def setTargetIdFiltersVarargs(value: TargetId*): Self = StObject.set(x, "TargetIdFilters", js.Array(value*))
  }
}
