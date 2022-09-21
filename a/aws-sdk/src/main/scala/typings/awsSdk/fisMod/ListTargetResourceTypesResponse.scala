package typings.awsSdk.fisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTargetResourceTypesResponse extends StObject {
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * The target resource types.
    */
  var targetResourceTypes: js.UndefOr[TargetResourceTypeSummaryList] = js.undefined
}
object ListTargetResourceTypesResponse {
  
  inline def apply(): ListTargetResourceTypesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTargetResourceTypesResponse]
  }
  
  extension [Self <: ListTargetResourceTypesResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setTargetResourceTypes(value: TargetResourceTypeSummaryList): Self = StObject.set(x, "targetResourceTypes", value.asInstanceOf[js.Any])
    
    inline def setTargetResourceTypesUndefined: Self = StObject.set(x, "targetResourceTypes", js.undefined)
    
    inline def setTargetResourceTypesVarargs(value: TargetResourceTypeSummary*): Self = StObject.set(x, "targetResourceTypes", js.Array(value*))
  }
}
