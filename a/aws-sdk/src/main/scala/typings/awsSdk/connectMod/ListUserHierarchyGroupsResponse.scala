package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListUserHierarchyGroupsResponse extends StObject {
  
  /**
    * If there are additional results, this is the token for the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.connectMod.NextToken] = js.undefined
  
  /**
    * Information about the hierarchy groups.
    */
  var UserHierarchyGroupSummaryList: js.UndefOr[HierarchyGroupSummaryList] = js.undefined
}
object ListUserHierarchyGroupsResponse {
  
  inline def apply(): ListUserHierarchyGroupsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListUserHierarchyGroupsResponse]
  }
  
  extension [Self <: ListUserHierarchyGroupsResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setUserHierarchyGroupSummaryList(value: HierarchyGroupSummaryList): Self = StObject.set(x, "UserHierarchyGroupSummaryList", value.asInstanceOf[js.Any])
    
    inline def setUserHierarchyGroupSummaryListUndefined: Self = StObject.set(x, "UserHierarchyGroupSummaryList", js.undefined)
    
    inline def setUserHierarchyGroupSummaryListVarargs(value: HierarchyGroupSummary*): Self = StObject.set(x, "UserHierarchyGroupSummaryList", js.Array(value*))
  }
}
