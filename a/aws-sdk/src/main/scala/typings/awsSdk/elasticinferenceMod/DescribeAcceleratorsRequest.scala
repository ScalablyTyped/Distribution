package typings.awsSdk.elasticinferenceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeAcceleratorsRequest extends js.Object {
  
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
  implicit class DescribeAcceleratorsRequestOps[Self <: DescribeAcceleratorsRequest] (val x: Self) extends AnyVal {
    
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
    def setAcceleratorIdsVarargs(value: AcceleratorId*): Self = this.set("acceleratorIds", js.Array(value :_*))
    
    @scala.inline
    def setAcceleratorIds(value: AcceleratorIdList): Self = this.set("acceleratorIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAcceleratorIds: Self = this.set("acceleratorIds", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: Filter*): Self = this.set("filters", js.Array(value :_*))
    
    @scala.inline
    def setFilters(value: FilterList): Self = this.set("filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
}
