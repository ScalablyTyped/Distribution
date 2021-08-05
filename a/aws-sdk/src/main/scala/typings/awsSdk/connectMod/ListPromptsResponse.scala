package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPromptsResponse extends StObject {
  
  /**
    * If there are additional results, this is the token for the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.connectMod.NextToken] = js.undefined
  
  /**
    * Information about the prompts.
    */
  var PromptSummaryList: js.UndefOr[typings.awsSdk.connectMod.PromptSummaryList] = js.undefined
}
object ListPromptsResponse {
  
  inline def apply(): ListPromptsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPromptsResponse]
  }
  
  extension [Self <: ListPromptsResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setPromptSummaryList(value: PromptSummaryList): Self = StObject.set(x, "PromptSummaryList", value.asInstanceOf[js.Any])
    
    inline def setPromptSummaryListUndefined: Self = StObject.set(x, "PromptSummaryList", js.undefined)
    
    inline def setPromptSummaryListVarargs(value: PromptSummary*): Self = StObject.set(x, "PromptSummaryList", js.Array(value :_*))
  }
}
