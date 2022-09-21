package typings.awsSdk.iottwinmakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListScenesResponse extends StObject {
  
  /**
    * The string that specifies the next page of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * A list of objects that contain information about the scenes.
    */
  var sceneSummaries: js.UndefOr[SceneSummaries] = js.undefined
}
object ListScenesResponse {
  
  inline def apply(): ListScenesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListScenesResponse]
  }
  
  extension [Self <: ListScenesResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setSceneSummaries(value: SceneSummaries): Self = StObject.set(x, "sceneSummaries", value.asInstanceOf[js.Any])
    
    inline def setSceneSummariesUndefined: Self = StObject.set(x, "sceneSummaries", js.undefined)
    
    inline def setSceneSummariesVarargs(value: SceneSummary*): Self = StObject.set(x, "sceneSummaries", js.Array(value*))
  }
}
