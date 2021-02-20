package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListUserHierarchyGroupsResponse extends StObject {
  
  /**
    * If there are additional results, this is the token for the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.connectMod.NextToken] = js.native
  
  /**
    * Information about the hierarchy groups.
    */
  var UserHierarchyGroupSummaryList: js.UndefOr[HierarchyGroupSummaryList] = js.native
}
object ListUserHierarchyGroupsResponse {
  
  @scala.inline
  def apply(): ListUserHierarchyGroupsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListUserHierarchyGroupsResponse]
  }
  
  @scala.inline
  implicit class ListUserHierarchyGroupsResponseMutableBuilder[Self <: ListUserHierarchyGroupsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setUserHierarchyGroupSummaryList(value: HierarchyGroupSummaryList): Self = StObject.set(x, "UserHierarchyGroupSummaryList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserHierarchyGroupSummaryListUndefined: Self = StObject.set(x, "UserHierarchyGroupSummaryList", js.undefined)
    
    @scala.inline
    def setUserHierarchyGroupSummaryListVarargs(value: HierarchyGroupSummary*): Self = StObject.set(x, "UserHierarchyGroupSummaryList", js.Array(value :_*))
  }
}
