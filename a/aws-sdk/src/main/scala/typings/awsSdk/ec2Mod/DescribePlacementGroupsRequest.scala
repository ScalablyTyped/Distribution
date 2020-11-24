package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribePlacementGroupsRequest extends js.Object {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * The filters.    group-name - The name of the placement group.    state - The state of the placement group (pending | available | deleting | deleted).    strategy - The strategy of the placement group (cluster | spread | partition).    tag:&lt;key&gt; - The key/value combination of a tag assigned to the resource. Use the tag key in the filter name and the tag value as the filter value. For example, to find all resources that have a tag with the key Owner and the value TeamA, specify tag:Owner for the filter name and TeamA for the filter value.    tag-key - The key of a tag assigned to the resource. Use this filter to find all resources that have a tag with a specific key, regardless of the tag value.  
    */
  var Filters: js.UndefOr[FilterList] = js.native
  
  /**
    * The IDs of the placement groups.
    */
  var GroupIds: js.UndefOr[PlacementGroupIdStringList] = js.native
  
  /**
    * The names of the placement groups. Default: Describes all your placement groups, or only those otherwise specified.
    */
  var GroupNames: js.UndefOr[PlacementGroupStringList] = js.native
}
object DescribePlacementGroupsRequest {
  
  @scala.inline
  def apply(): DescribePlacementGroupsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribePlacementGroupsRequest]
  }
  
  @scala.inline
  implicit class DescribePlacementGroupsRequestOps[Self <: DescribePlacementGroupsRequest] (val x: Self) extends AnyVal {
    
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
    def setGroupIdsVarargs(value: PlacementGroupId*): Self = this.set("GroupIds", js.Array(value :_*))
    
    @scala.inline
    def setGroupIds(value: PlacementGroupIdStringList): Self = this.set("GroupIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupIds: Self = this.set("GroupIds", js.undefined)
    
    @scala.inline
    def setGroupNamesVarargs(value: PlacementGroupName*): Self = this.set("GroupNames", js.Array(value :_*))
    
    @scala.inline
    def setGroupNames(value: PlacementGroupStringList): Self = this.set("GroupNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupNames: Self = this.set("GroupNames", js.undefined)
  }
}
