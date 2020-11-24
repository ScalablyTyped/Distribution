package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeRegionsRequest extends js.Object {
  
  /**
    * Indicates whether to display all Regions, including Regions that are disabled for your account.
    */
  var AllRegions: js.UndefOr[Boolean] = js.native
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * The filters.    endpoint - The endpoint of the Region (for example, ec2.us-east-1.amazonaws.com).    opt-in-status - The opt-in status of the Region (opt-in-not-required | opted-in | not-opted-in).    region-name - The name of the Region (for example, us-east-1).  
    */
  var Filters: js.UndefOr[FilterList] = js.native
  
  /**
    * The names of the Regions. You can specify any Regions, whether they are enabled and disabled for your account.
    */
  var RegionNames: js.UndefOr[RegionNameStringList] = js.native
}
object DescribeRegionsRequest {
  
  @scala.inline
  def apply(): DescribeRegionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeRegionsRequest]
  }
  
  @scala.inline
  implicit class DescribeRegionsRequestOps[Self <: DescribeRegionsRequest] (val x: Self) extends AnyVal {
    
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
    def setAllRegions(value: Boolean): Self = this.set("AllRegions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllRegions: Self = this.set("AllRegions", js.undefined)
    
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
    def setRegionNamesVarargs(value: String*): Self = this.set("RegionNames", js.Array(value :_*))
    
    @scala.inline
    def setRegionNames(value: RegionNameStringList): Self = this.set("RegionNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegionNames: Self = this.set("RegionNames", js.undefined)
  }
}
