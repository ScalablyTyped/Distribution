package typings.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListComponentBuildVersionsResponse extends js.Object {
  
  /**
    * The list of component summaries for the specified semantic version. 
    */
  var componentSummaryList: js.UndefOr[ComponentSummaryList] = js.native
  
  /**
    * The next token used for paginated responses. When this is not empty, there are additional elements that the service has not included in this request. Use this token with the next request to retrieve additional objects. 
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
  
  /**
    * The request ID that uniquely identifies this request. 
    */
  var requestId: js.UndefOr[NonEmptyString] = js.native
}
object ListComponentBuildVersionsResponse {
  
  @scala.inline
  def apply(): ListComponentBuildVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListComponentBuildVersionsResponse]
  }
  
  @scala.inline
  implicit class ListComponentBuildVersionsResponseOps[Self <: ListComponentBuildVersionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setComponentSummaryListVarargs(value: ComponentSummary*): Self = this.set("componentSummaryList", js.Array(value :_*))
    
    @scala.inline
    def setComponentSummaryList(value: ComponentSummaryList): Self = this.set("componentSummaryList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponentSummaryList: Self = this.set("componentSummaryList", js.undefined)
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    
    @scala.inline
    def setRequestId(value: NonEmptyString): Self = this.set("requestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestId: Self = this.set("requestId", js.undefined)
  }
}
