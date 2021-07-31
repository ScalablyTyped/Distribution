package typings.awsSdk.xrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetGroupsResult extends StObject {
  
  /**
    * The collection of all active groups.
    */
  var Groups: js.UndefOr[GroupSummaryList] = js.undefined
  
  /**
    * Pagination token.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object GetGroupsResult {
  
  @scala.inline
  def apply(): GetGroupsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetGroupsResult]
  }
  
  @scala.inline
  implicit class GetGroupsResultMutableBuilder[Self <: GetGroupsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroups(value: GroupSummaryList): Self = StObject.set(x, "Groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupsUndefined: Self = StObject.set(x, "Groups", js.undefined)
    
    @scala.inline
    def setGroupsVarargs(value: GroupSummary*): Self = StObject.set(x, "Groups", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
