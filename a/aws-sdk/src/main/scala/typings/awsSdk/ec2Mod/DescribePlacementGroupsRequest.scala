package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribePlacementGroupsRequest extends StObject {
  
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
  implicit class DescribePlacementGroupsRequestMutableBuilder[Self <: DescribePlacementGroupsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setFilters(value: FilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "Filters", js.Array(value :_*))
    
    @scala.inline
    def setGroupIds(value: PlacementGroupIdStringList): Self = StObject.set(x, "GroupIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupIdsUndefined: Self = StObject.set(x, "GroupIds", js.undefined)
    
    @scala.inline
    def setGroupIdsVarargs(value: PlacementGroupId*): Self = StObject.set(x, "GroupIds", js.Array(value :_*))
    
    @scala.inline
    def setGroupNames(value: PlacementGroupStringList): Self = StObject.set(x, "GroupNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupNamesUndefined: Self = StObject.set(x, "GroupNames", js.undefined)
    
    @scala.inline
    def setGroupNamesVarargs(value: PlacementGroupName*): Self = StObject.set(x, "GroupNames", js.Array(value :_*))
  }
}
