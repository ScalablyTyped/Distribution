package typings.awsSdk.m2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListEngineVersionsRequest extends StObject {
  
  /**
    * The type of target platform.
    */
  var engineType: js.UndefOr[EngineType] = js.undefined
  
  /**
    * The maximum number of objects to return.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * A pagination token returned from a previous call to this operation. This specifies the next item to return. To return to the beginning of the list, exclude this parameter.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListEngineVersionsRequest {
  
  inline def apply(): ListEngineVersionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEngineVersionsRequest]
  }
  
  extension [Self <: ListEngineVersionsRequest](x: Self) {
    
    inline def setEngineType(value: EngineType): Self = StObject.set(x, "engineType", value.asInstanceOf[js.Any])
    
    inline def setEngineTypeUndefined: Self = StObject.set(x, "engineType", js.undefined)
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
