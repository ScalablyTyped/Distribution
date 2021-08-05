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
  
  inline def apply(): GetGroupsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetGroupsResult]
  }
  
  extension [Self <: GetGroupsResult](x: Self) {
    
    inline def setGroups(value: GroupSummaryList): Self = StObject.set(x, "Groups", value.asInstanceOf[js.Any])
    
    inline def setGroupsUndefined: Self = StObject.set(x, "Groups", js.undefined)
    
    inline def setGroupsVarargs(value: GroupSummary*): Self = StObject.set(x, "Groups", js.Array(value :_*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
