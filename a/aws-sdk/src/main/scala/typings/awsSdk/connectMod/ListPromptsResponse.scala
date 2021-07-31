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
  
  @scala.inline
  def apply(): ListPromptsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPromptsResponse]
  }
  
  @scala.inline
  implicit class ListPromptsResponseMutableBuilder[Self <: ListPromptsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setPromptSummaryList(value: PromptSummaryList): Self = StObject.set(x, "PromptSummaryList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPromptSummaryListUndefined: Self = StObject.set(x, "PromptSummaryList", js.undefined)
    
    @scala.inline
    def setPromptSummaryListVarargs(value: PromptSummary*): Self = StObject.set(x, "PromptSummaryList", js.Array(value :_*))
  }
}
