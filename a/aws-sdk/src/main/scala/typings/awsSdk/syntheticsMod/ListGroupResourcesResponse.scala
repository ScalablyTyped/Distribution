package typings.awsSdk.syntheticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListGroupResourcesResponse extends StObject {
  
  /**
    * A token that indicates that there is more data available. You can use this token in a subsequent ListGroupResources operation to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * An array of ARNs. These ARNs are for the canaries that are associated with the group.
    */
  var Resources: js.UndefOr[StringList] = js.undefined
}
object ListGroupResourcesResponse {
  
  inline def apply(): ListGroupResourcesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListGroupResourcesResponse]
  }
  
  extension [Self <: ListGroupResourcesResponse](x: Self) {
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setResources(value: StringList): Self = StObject.set(x, "Resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesUndefined: Self = StObject.set(x, "Resources", js.undefined)
    
    inline def setResourcesVarargs(value: String*): Self = StObject.set(x, "Resources", js.Array(value*))
  }
}
