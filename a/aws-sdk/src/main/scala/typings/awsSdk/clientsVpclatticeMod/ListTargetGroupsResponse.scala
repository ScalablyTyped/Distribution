package typings.awsSdk.clientsVpclatticeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTargetGroupsResponse extends StObject {
  
  /**
    * Information about the target groups.
    */
  var items: js.UndefOr[TargetGroupList] = js.undefined
  
  /**
    * If there are additional results, a pagination token for the next page of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListTargetGroupsResponse {
  
  inline def apply(): ListTargetGroupsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTargetGroupsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListTargetGroupsResponse] (val x: Self) extends AnyVal {
    
    inline def setItems(value: TargetGroupList): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: TargetGroupSummary*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
