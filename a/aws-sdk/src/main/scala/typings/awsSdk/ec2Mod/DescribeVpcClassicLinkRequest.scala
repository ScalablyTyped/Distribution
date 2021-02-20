package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeVpcClassicLinkRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * One or more filters.    is-classic-link-enabled - Whether the VPC is enabled for ClassicLink (true | false).    tag:&lt;key&gt; - The key/value combination of a tag assigned to the resource. Use the tag key in the filter name and the tag value as the filter value. For example, to find all resources that have a tag with the key Owner and the value TeamA, specify tag:Owner for the filter name and TeamA for the filter value.    tag-key - The key of a tag assigned to the resource. Use this filter to find all resources assigned a tag with a specific key, regardless of the tag value.  
    */
  var Filters: js.UndefOr[FilterList] = js.native
  
  /**
    * One or more VPCs for which you want to describe the ClassicLink status.
    */
  var VpcIds: js.UndefOr[VpcClassicLinkIdList] = js.native
}
object DescribeVpcClassicLinkRequest {
  
  @scala.inline
  def apply(): DescribeVpcClassicLinkRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeVpcClassicLinkRequest]
  }
  
  @scala.inline
  implicit class DescribeVpcClassicLinkRequestMutableBuilder[Self <: DescribeVpcClassicLinkRequest] (val x: Self) extends AnyVal {
    
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
    def setVpcIds(value: VpcClassicLinkIdList): Self = StObject.set(x, "VpcIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcIdsUndefined: Self = StObject.set(x, "VpcIds", js.undefined)
    
    @scala.inline
    def setVpcIdsVarargs(value: VpcId*): Self = StObject.set(x, "VpcIds", js.Array(value :_*))
  }
}
