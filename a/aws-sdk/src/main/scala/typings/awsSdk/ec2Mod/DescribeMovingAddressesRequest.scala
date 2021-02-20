package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeMovingAddressesRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * One or more filters.    moving-status - The status of the Elastic IP address (MovingToVpc | RestoringToClassic).  
    */
  var Filters: js.UndefOr[FilterList] = js.native
  
  /**
    * The maximum number of results to return for the request in a single page. The remaining results of the initial request can be seen by sending another request with the returned NextToken value. This value can be between 5 and 1000; if MaxResults is given a value outside of this range, an error is returned. Default: If no value is provided, the default is 1000.
    */
  var MaxResults: js.UndefOr[DescribeMovingAddressesMaxResults] = js.native
  
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * One or more Elastic IP addresses.
    */
  var PublicIps: js.UndefOr[ValueStringList] = js.native
}
object DescribeMovingAddressesRequest {
  
  @scala.inline
  def apply(): DescribeMovingAddressesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeMovingAddressesRequest]
  }
  
  @scala.inline
  implicit class DescribeMovingAddressesRequestMutableBuilder[Self <: DescribeMovingAddressesRequest] (val x: Self) extends AnyVal {
    
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
    def setMaxResults(value: DescribeMovingAddressesMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setPublicIps(value: ValueStringList): Self = StObject.set(x, "PublicIps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicIpsUndefined: Self = StObject.set(x, "PublicIps", js.undefined)
    
    @scala.inline
    def setPublicIpsVarargs(value: String*): Self = StObject.set(x, "PublicIps", js.Array(value :_*))
  }
}
