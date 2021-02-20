package typings.awsSdk.workspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeIpGroupsRequest extends StObject {
  
  /**
    * The identifiers of one or more IP access control groups.
    */
  var GroupIds: js.UndefOr[IpGroupIdList] = js.native
  
  /**
    * The maximum number of items to return.
    */
  var MaxResults: js.UndefOr[Limit] = js.native
  
  /**
    * If you received a NextToken from a previous call that was paginated, provide this token to receive the next set of results.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
}
object DescribeIpGroupsRequest {
  
  @scala.inline
  def apply(): DescribeIpGroupsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeIpGroupsRequest]
  }
  
  @scala.inline
  implicit class DescribeIpGroupsRequestMutableBuilder[Self <: DescribeIpGroupsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroupIds(value: IpGroupIdList): Self = StObject.set(x, "GroupIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupIdsUndefined: Self = StObject.set(x, "GroupIds", js.undefined)
    
    @scala.inline
    def setGroupIdsVarargs(value: IpGroupId*): Self = StObject.set(x, "GroupIds", js.Array(value :_*))
    
    @scala.inline
    def setMaxResults(value: Limit): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
