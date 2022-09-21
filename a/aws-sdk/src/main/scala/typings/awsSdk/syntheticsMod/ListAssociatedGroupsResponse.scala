package typings.awsSdk.syntheticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAssociatedGroupsResponse extends StObject {
  
  /**
    * An array of structures that contain information about the groups that this canary is associated with.
    */
  var Groups: js.UndefOr[GroupSummaryList] = js.undefined
  
  /**
    * A token that indicates that there is more data available. You can use this token in a subsequent ListAssociatedGroups operation to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListAssociatedGroupsResponse {
  
  inline def apply(): ListAssociatedGroupsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAssociatedGroupsResponse]
  }
  
  extension [Self <: ListAssociatedGroupsResponse](x: Self) {
    
    inline def setGroups(value: GroupSummaryList): Self = StObject.set(x, "Groups", value.asInstanceOf[js.Any])
    
    inline def setGroupsUndefined: Self = StObject.set(x, "Groups", js.undefined)
    
    inline def setGroupsVarargs(value: GroupSummary*): Self = StObject.set(x, "Groups", js.Array(value*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
