package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListHumanTaskUisResponse extends js.Object {
  
  /**
    * An array of objects describing the human task user interfaces.
    */
  var HumanTaskUiSummaries: typings.awsSdk.sagemakerMod.HumanTaskUiSummaries = js.native
  
  /**
    * A token to resume pagination.
    */
  var NextToken: js.UndefOr[typings.awsSdk.sagemakerMod.NextToken] = js.native
}
object ListHumanTaskUisResponse {
  
  @scala.inline
  def apply(HumanTaskUiSummaries: HumanTaskUiSummaries): ListHumanTaskUisResponse = {
    val __obj = js.Dynamic.literal(HumanTaskUiSummaries = HumanTaskUiSummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListHumanTaskUisResponse]
  }
  
  @scala.inline
  implicit class ListHumanTaskUisResponseOps[Self <: ListHumanTaskUisResponse] (val x: Self) extends AnyVal {
    
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
    def setHumanTaskUiSummariesVarargs(value: HumanTaskUiSummary*): Self = this.set("HumanTaskUiSummaries", js.Array(value :_*))
    
    @scala.inline
    def setHumanTaskUiSummaries(value: HumanTaskUiSummaries): Self = this.set("HumanTaskUiSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
