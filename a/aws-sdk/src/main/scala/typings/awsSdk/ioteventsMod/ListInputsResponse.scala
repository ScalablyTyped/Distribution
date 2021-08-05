package typings.awsSdk.ioteventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListInputsResponse extends StObject {
  
  /**
    * Summary information about the inputs.
    */
  var inputSummaries: js.UndefOr[InputSummaries] = js.undefined
  
  /**
    * A token to retrieve the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListInputsResponse {
  
  inline def apply(): ListInputsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListInputsResponse]
  }
  
  extension [Self <: ListInputsResponse](x: Self) {
    
    inline def setInputSummaries(value: InputSummaries): Self = StObject.set(x, "inputSummaries", value.asInstanceOf[js.Any])
    
    inline def setInputSummariesUndefined: Self = StObject.set(x, "inputSummaries", js.undefined)
    
    inline def setInputSummariesVarargs(value: InputSummary*): Self = StObject.set(x, "inputSummaries", js.Array(value :_*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
