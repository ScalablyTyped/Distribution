package typings.awsSdk.m2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListEngineVersionsResponse extends StObject {
  
  /**
    * Returns the engine versions.
    */
  var engineVersions: EngineVersionsSummaryList
  
  /**
    * If there are more items to return, this contains a token that is passed to a subsequent call to this operation to retrieve the next set of items.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListEngineVersionsResponse {
  
  inline def apply(engineVersions: EngineVersionsSummaryList): ListEngineVersionsResponse = {
    val __obj = js.Dynamic.literal(engineVersions = engineVersions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListEngineVersionsResponse]
  }
  
  extension [Self <: ListEngineVersionsResponse](x: Self) {
    
    inline def setEngineVersions(value: EngineVersionsSummaryList): Self = StObject.set(x, "engineVersions", value.asInstanceOf[js.Any])
    
    inline def setEngineVersionsVarargs(value: EngineVersionsSummary*): Self = StObject.set(x, "engineVersions", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
