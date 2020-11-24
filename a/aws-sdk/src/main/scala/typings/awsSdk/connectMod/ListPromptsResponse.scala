package typings.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListPromptsResponse extends js.Object {
  
  /**
    * If there are additional results, this is the token for the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.connectMod.NextToken] = js.native
  
  /**
    * Information about the prompts.
    */
  var PromptSummaryList: js.UndefOr[typings.awsSdk.connectMod.PromptSummaryList] = js.native
}
object ListPromptsResponse {
  
  @scala.inline
  def apply(): ListPromptsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPromptsResponse]
  }
  
  @scala.inline
  implicit class ListPromptsResponseOps[Self <: ListPromptsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setPromptSummaryListVarargs(value: PromptSummary*): Self = this.set("PromptSummaryList", js.Array(value :_*))
    
    @scala.inline
    def setPromptSummaryList(value: PromptSummaryList): Self = this.set("PromptSummaryList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePromptSummaryList: Self = this.set("PromptSummaryList", js.undefined)
  }
}
