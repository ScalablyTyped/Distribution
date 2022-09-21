package typings.awsSdk.lakeformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListResourcesRequest extends StObject {
  
  /**
    * Any applicable row-level and/or column-level filtering conditions for the resources.
    */
  var FilterConditionList: js.UndefOr[typings.awsSdk.lakeformationMod.FilterConditionList] = js.undefined
  
  /**
    * The maximum number of resource results.
    */
  var MaxResults: js.UndefOr[PageSize] = js.undefined
  
  /**
    * A continuation token, if this is not the first call to retrieve these resources.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
}
object ListResourcesRequest {
  
  inline def apply(): ListResourcesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListResourcesRequest]
  }
  
  extension [Self <: ListResourcesRequest](x: Self) {
    
    inline def setFilterConditionList(value: FilterConditionList): Self = StObject.set(x, "FilterConditionList", value.asInstanceOf[js.Any])
    
    inline def setFilterConditionListUndefined: Self = StObject.set(x, "FilterConditionList", js.undefined)
    
    inline def setFilterConditionListVarargs(value: FilterCondition*): Self = StObject.set(x, "FilterConditionList", js.Array(value*))
    
    inline def setMaxResults(value: PageSize): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
