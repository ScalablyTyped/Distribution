package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeRegionsRequest extends StObject {
  
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
  implicit class DescribeRegionsRequestMutableBuilder[Self <: DescribeRegionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllRegions(value: Boolean): Self = StObject.set(x, "AllRegions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllRegionsUndefined: Self = StObject.set(x, "AllRegions", js.undefined)
    
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
    def setRegionNames(value: RegionNameStringList): Self = StObject.set(x, "RegionNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionNamesUndefined: Self = StObject.set(x, "RegionNames", js.undefined)
    
    @scala.inline
    def setRegionNamesVarargs(value: String*): Self = StObject.set(x, "RegionNames", js.Array(value :_*))
  }
}
