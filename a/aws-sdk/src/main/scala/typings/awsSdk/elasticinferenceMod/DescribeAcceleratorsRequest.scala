package typings.awsSdk.elasticinferenceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeAcceleratorsRequest extends StObject {
  
  /**
    *  The IDs of the accelerators to describe. 
    */
  var acceleratorIds: js.UndefOr[AcceleratorIdList] = js.native
  
  /**
    *  One or more filters. Filter names and values are case-sensitive. Valid filter names are: accelerator-types: can provide a list of accelerator type names to filter for. instance-id: can provide a list of EC2 instance ids to filter for. 
    */
  var filters: js.UndefOr[FilterList] = js.native
  
  /**
    *  The total number of items to return in the command's output. If the total number of items available is more than the value specified, a NextToken is provided in the command's output. To resume pagination, provide the NextToken value in the starting-token argument of a subsequent command. Do not use the NextToken response element directly outside of the AWS CLI. 
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  
  /**
    *  A token to specify where to start paginating. This is the NextToken from a previously truncated response. 
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}
object DescribeAcceleratorsRequest {
  
  @scala.inline
  def apply(): DescribeAcceleratorsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAcceleratorsRequest]
  }
  
  @scala.inline
  implicit class DescribeAcceleratorsRequestMutableBuilder[Self <: DescribeAcceleratorsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcceleratorIds(value: AcceleratorIdList): Self = StObject.set(x, "acceleratorIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceleratorIdsUndefined: Self = StObject.set(x, "acceleratorIds", js.undefined)
    
    @scala.inline
    def setAcceleratorIdsVarargs(value: AcceleratorId*): Self = StObject.set(x, "acceleratorIds", js.Array(value :_*))
    
    @scala.inline
    def setFilters(value: FilterList): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "filters", js.Array(value :_*))
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
