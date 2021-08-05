package typings.awsSdk.workspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeIpGroupsRequest extends StObject {
  
  /**
    * The identifiers of one or more IP access control groups.
    */
  var GroupIds: js.UndefOr[IpGroupIdList] = js.undefined
  
  /**
    * The maximum number of items to return.
    */
  var MaxResults: js.UndefOr[Limit] = js.undefined
  
  /**
    * If you received a NextToken from a previous call that was paginated, provide this token to receive the next set of results.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
}
object DescribeIpGroupsRequest {
  
  inline def apply(): DescribeIpGroupsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeIpGroupsRequest]
  }
  
  extension [Self <: DescribeIpGroupsRequest](x: Self) {
    
    inline def setGroupIds(value: IpGroupIdList): Self = StObject.set(x, "GroupIds", value.asInstanceOf[js.Any])
    
    inline def setGroupIdsUndefined: Self = StObject.set(x, "GroupIds", js.undefined)
    
    inline def setGroupIdsVarargs(value: IpGroupId*): Self = StObject.set(x, "GroupIds", js.Array(value :_*))
    
    inline def setMaxResults(value: Limit): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
