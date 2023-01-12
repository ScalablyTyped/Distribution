package typings.awsSdk.clientsSyntheticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListGroupsResponse extends StObject {
  
  /**
    * An array of structures that each contain information about one group.
    */
  var Groups: js.UndefOr[GroupSummaryList] = js.undefined
  
  /**
    * A token that indicates that there is more data available. You can use this token in a subsequent ListGroups operation to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
}
object ListGroupsResponse {
  
  inline def apply(): ListGroupsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListGroupsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListGroupsResponse] (val x: Self) extends AnyVal {
    
    inline def setGroups(value: GroupSummaryList): Self = StObject.set(x, "Groups", value.asInstanceOf[js.Any])
    
    inline def setGroupsUndefined: Self = StObject.set(x, "Groups", js.undefined)
    
    inline def setGroupsVarargs(value: GroupSummary*): Self = StObject.set(x, "Groups", js.Array(value*))
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
