package typings.awsSdk.codegurureviewerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListCodeReviewsRequest extends js.Object {
  
  /**
    *  The maximum number of results that are returned per call. The default is 100. 
    */
  var MaxResults: js.UndefOr[ListCodeReviewsMaxResults] = js.native
  
  /**
    *  If nextToken is returned, there are more results available. The value of nextToken is a unique pagination token for each page. Make the call again using the returned token to retrieve the next page. Keep all other arguments unchanged. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.codegurureviewerMod.NextToken] = js.native
  
  /**
    *  List of provider types for filtering that needs to be applied before displaying the result. For example, providerTypes=[GitHub] lists code reviews from GitHub. 
    */
  var ProviderTypes: js.UndefOr[typings.awsSdk.codegurureviewerMod.ProviderTypes] = js.native
  
  /**
    *  List of repository names for filtering that needs to be applied before displaying the result. 
    */
  var RepositoryNames: js.UndefOr[typings.awsSdk.codegurureviewerMod.RepositoryNames] = js.native
  
  /**
    *  List of states for filtering that needs to be applied before displaying the result. For example, states=[Pending] lists code reviews in the Pending state.  The valid code review states are:    Completed: The code review is complete.     Pending: The code review started and has not completed or failed.     Failed: The code review failed.     Deleting: The code review is being deleted.   
    */
  var States: js.UndefOr[JobStates] = js.native
  
  /**
    *  The type of code reviews to list in the response. 
    */
  var Type: typings.awsSdk.codegurureviewerMod.Type = js.native
}
object ListCodeReviewsRequest {
  
  @scala.inline
  def apply(Type: Type): ListCodeReviewsRequest = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListCodeReviewsRequest]
  }
  
  @scala.inline
  implicit class ListCodeReviewsRequestOps[Self <: ListCodeReviewsRequest] (val x: Self) extends AnyVal {
    
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
    def setType(value: Type): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResults(value: ListCodeReviewsMaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setProviderTypesVarargs(value: ProviderType*): Self = this.set("ProviderTypes", js.Array(value :_*))
    
    @scala.inline
    def setProviderTypes(value: ProviderTypes): Self = this.set("ProviderTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProviderTypes: Self = this.set("ProviderTypes", js.undefined)
    
    @scala.inline
    def setRepositoryNamesVarargs(value: Name*): Self = this.set("RepositoryNames", js.Array(value :_*))
    
    @scala.inline
    def setRepositoryNames(value: RepositoryNames): Self = this.set("RepositoryNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepositoryNames: Self = this.set("RepositoryNames", js.undefined)
    
    @scala.inline
    def setStatesVarargs(value: JobState*): Self = this.set("States", js.Array(value :_*))
    
    @scala.inline
    def setStates(value: JobStates): Self = this.set("States", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStates: Self = this.set("States", js.undefined)
  }
}
