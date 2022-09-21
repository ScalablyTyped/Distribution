package typings.awsSdk.resourcegroupstaggingapiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResourcesInput extends StObject {
  
  /**
    * Specifies whether to exclude resources that are compliant with the tag policy. Set this to true if you are interested in retrieving information on noncompliant resources only. You can use this parameter only if the IncludeComplianceDetails parameter is also set to true.
    */
  var ExcludeCompliantResources: js.UndefOr[typings.awsSdk.resourcegroupstaggingapiMod.ExcludeCompliantResources] = js.undefined
  
  /**
    * Specifies whether to include details regarding the compliance with the effective tag policy. Set this to true to determine whether resources are compliant with the tag policy and to get details.
    */
  var IncludeComplianceDetails: js.UndefOr[typings.awsSdk.resourcegroupstaggingapiMod.IncludeComplianceDetails] = js.undefined
  
  /**
    * Specifies a PaginationToken response value from a previous request to indicate that you want the next page of results. Leave this parameter empty in your initial request.
    */
  var PaginationToken: js.UndefOr[typings.awsSdk.resourcegroupstaggingapiMod.PaginationToken] = js.undefined
  
  /**
    * Specifies a list of ARNs of resources for which you want to retrieve tag data. You can't specify both this parameter and any of the pagination parameters (ResourcesPerPage, TagsPerPage, PaginationToken) in the same request. If you specify both, you get an Invalid Parameter exception. If a resource specified by this parameter doesn't exist, it doesn't generate an error; it simply isn't included in the response. An ARN (Amazon Resource Name) uniquely identifies a resource. For more information, see Amazon Resource Names (ARNs) and Amazon Web Services Service Namespaces in the Amazon Web Services General Reference.
    */
  var ResourceARNList: js.UndefOr[ResourceARNListForGet] = js.undefined
  
  /**
    * Specifies the resource types that you want included in the response. The format of each resource type is service[:resourceType]. For example, specifying a resource type of ec2 returns all Amazon EC2 resources (which includes EC2 instances). Specifying a resource type of ec2:instance returns only EC2 instances.  The string for each service name and resource type is the same as that embedded in a resource's Amazon Resource Name (ARN). For the list of services whose resources you can use in this parameter, see Services that support the Resource Groups Tagging API. You can specify multiple resource types by using an array. The array can include up to 100 items. Note that the length constraint requirement applies to each resource type filter. For example, the following string would limit the response to only Amazon EC2 instances, Amazon S3 buckets, or any Audit Manager resource:  ec2:instance,s3:bucket,auditmanager 
    */
  var ResourceTypeFilters: js.UndefOr[ResourceTypeFilterList] = js.undefined
  
  /**
    * Specifies the maximum number of results to be returned in each page. A query can return fewer than this maximum, even if there are more results still to return. You should always check the PaginationToken response value to see if there are more results. You can specify a minimum of 1 and a maximum value of 100.
    */
  var ResourcesPerPage: js.UndefOr[typings.awsSdk.resourcegroupstaggingapiMod.ResourcesPerPage] = js.undefined
  
  /**
    * Specifies a list of TagFilters (keys and values) to restrict the output to only those resources that have tags with the specified keys and, if included, the specified values. Each TagFilter must contain a key with values optional. A request can include up to 50 keys, and each key can include up to 20 values.  Note the following when deciding how to use TagFilters:   If you don't specify a TagFilter, the response includes all resources that are currently tagged or ever had a tag. Resources that currently don't have tags are shown with an empty tag set, like this: "Tags": [].   If you specify more than one filter in a single request, the response returns only those resources that satisfy all filters.   If you specify a filter that contains more than one value for a key, the response returns resources that match any of the specified values for that key.   If you don't specify a value for a key, the response returns all resources that are tagged with that key, with any or no value. For example, for the following filters: filter1= {keyA,{value1}}, filter2={keyB,{value2,value3,value4}}, filter3= {keyC}:    GetResources({filter1}) returns resources tagged with key1=value1     GetResources({filter2}) returns resources tagged with key2=value2 or key2=value3 or key2=value4     GetResources({filter3}) returns resources tagged with any tag with the key key3, and with any or no value    GetResources({filter1,filter2,filter3}) returns resources tagged with (key1=value1) and (key2=value2 or key2=value3 or key2=value4) and (key3, any or no value)     
    */
  var TagFilters: js.UndefOr[TagFilterList] = js.undefined
  
  /**
    * Amazon Web Services recommends using ResourcesPerPage instead of this parameter. A limit that restricts the number of tags (key and value pairs) returned by GetResources in paginated output. A resource with no tags is counted as having one tag (one key and value pair).  GetResources does not split a resource and its associated tags across pages. If the specified TagsPerPage would cause such a break, a PaginationToken is returned in place of the affected resource and its tags. Use that token in another request to get the remaining data. For example, if you specify a TagsPerPage of 100 and the account has 22 resources with 10 tags each (meaning that each resource has 10 key and value pairs), the output will consist of three pages. The first page displays the first 10 resources, each with its 10 tags. The second page displays the next 10 resources, each with its 10 tags. The third page displays the remaining 2 resources, each with its 10 tags. You can set TagsPerPage to a minimum of 100 items up to a maximum of 500 items.
    */
  var TagsPerPage: js.UndefOr[typings.awsSdk.resourcegroupstaggingapiMod.TagsPerPage] = js.undefined
}
object GetResourcesInput {
  
  inline def apply(): GetResourcesInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetResourcesInput]
  }
  
  extension [Self <: GetResourcesInput](x: Self) {
    
    inline def setExcludeCompliantResources(value: ExcludeCompliantResources): Self = StObject.set(x, "ExcludeCompliantResources", value.asInstanceOf[js.Any])
    
    inline def setExcludeCompliantResourcesUndefined: Self = StObject.set(x, "ExcludeCompliantResources", js.undefined)
    
    inline def setIncludeComplianceDetails(value: IncludeComplianceDetails): Self = StObject.set(x, "IncludeComplianceDetails", value.asInstanceOf[js.Any])
    
    inline def setIncludeComplianceDetailsUndefined: Self = StObject.set(x, "IncludeComplianceDetails", js.undefined)
    
    inline def setPaginationToken(value: PaginationToken): Self = StObject.set(x, "PaginationToken", value.asInstanceOf[js.Any])
    
    inline def setPaginationTokenUndefined: Self = StObject.set(x, "PaginationToken", js.undefined)
    
    inline def setResourceARNList(value: ResourceARNListForGet): Self = StObject.set(x, "ResourceARNList", value.asInstanceOf[js.Any])
    
    inline def setResourceARNListUndefined: Self = StObject.set(x, "ResourceARNList", js.undefined)
    
    inline def setResourceARNListVarargs(value: ResourceARN*): Self = StObject.set(x, "ResourceARNList", js.Array(value*))
    
    inline def setResourceTypeFilters(value: ResourceTypeFilterList): Self = StObject.set(x, "ResourceTypeFilters", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeFiltersUndefined: Self = StObject.set(x, "ResourceTypeFilters", js.undefined)
    
    inline def setResourceTypeFiltersVarargs(value: AmazonResourceType*): Self = StObject.set(x, "ResourceTypeFilters", js.Array(value*))
    
    inline def setResourcesPerPage(value: ResourcesPerPage): Self = StObject.set(x, "ResourcesPerPage", value.asInstanceOf[js.Any])
    
    inline def setResourcesPerPageUndefined: Self = StObject.set(x, "ResourcesPerPage", js.undefined)
    
    inline def setTagFilters(value: TagFilterList): Self = StObject.set(x, "TagFilters", value.asInstanceOf[js.Any])
    
    inline def setTagFiltersUndefined: Self = StObject.set(x, "TagFilters", js.undefined)
    
    inline def setTagFiltersVarargs(value: TagFilter*): Self = StObject.set(x, "TagFilters", js.Array(value*))
    
    inline def setTagsPerPage(value: TagsPerPage): Self = StObject.set(x, "TagsPerPage", value.asInstanceOf[js.Any])
    
    inline def setTagsPerPageUndefined: Self = StObject.set(x, "TagsPerPage", js.undefined)
  }
}
