package typings.awsSdk.resourcegroupstaggingapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetComplianceSummaryInput extends js.Object {
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
  implicit class GetComplianceSummaryInputOps[Self <: GetComplianceSummaryInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGroupByVarargs(value: GroupByAttribute*): Self = this.set("GroupBy", js.Array(value :_*))
    @scala.inline
    def setGroupBy(value: GroupBy): Self = this.set("GroupBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupBy: Self = this.set("GroupBy", js.undefined)
    @scala.inline
    def setMaxResults(value: MaxResultsGetComplianceSummary): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setPaginationToken(value: PaginationToken): Self = this.set("PaginationToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaginationToken: Self = this.set("PaginationToken", js.undefined)
    @scala.inline
    def setRegionFiltersVarargs(value: Region*): Self = this.set("RegionFilters", js.Array(value :_*))
    @scala.inline
    def setRegionFilters(value: RegionFilterList): Self = this.set("RegionFilters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegionFilters: Self = this.set("RegionFilters", js.undefined)
    @scala.inline
    def setResourceTypeFiltersVarargs(value: AmazonResourceType*): Self = this.set("ResourceTypeFilters", js.Array(value :_*))
    @scala.inline
    def setResourceTypeFilters(value: ResourceTypeFilterList): Self = this.set("ResourceTypeFilters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceTypeFilters: Self = this.set("ResourceTypeFilters", js.undefined)
    @scala.inline
    def setTagKeyFiltersVarargs(value: TagKey*): Self = this.set("TagKeyFilters", js.Array(value :_*))
    @scala.inline
    def setTagKeyFilters(value: TagKeyFilterList): Self = this.set("TagKeyFilters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTagKeyFilters: Self = this.set("TagKeyFilters", js.undefined)
    @scala.inline
    def setTargetIdFiltersVarargs(value: TargetId*): Self = this.set("TargetIdFilters", js.Array(value :_*))
    @scala.inline
    def setTargetIdFilters(value: TargetIdFilterList): Self = this.set("TargetIdFilters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetIdFilters: Self = this.set("TargetIdFilters", js.undefined)
  }
  
}

