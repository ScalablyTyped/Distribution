package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListPullRequestsInput extends js.Object {
  
  /**
    * Optional. The Amazon Resource Name (ARN) of the user who created the pull request. If used, this filters the results to pull requests created by that user.
    */
  var authorArn: js.UndefOr[Arn] = js.native
  
  /**
    * A non-zero, non-negative integer used to limit the number of returned results.
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  
  /**
    * An enumeration token that, when provided in a request, returns the next batch of the results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  
  /**
    * Optional. The status of the pull request. If used, this refines the results to the pull requests that match the specified status.
    */
  var pullRequestStatus: js.UndefOr[PullRequestStatusEnum] = js.native
  
  /**
    * The name of the repository for which you want to list pull requests.
    */
  var repositoryName: RepositoryName = js.native
}
object ListPullRequestsInput {
  
  @scala.inline
  def apply(repositoryName: RepositoryName): ListPullRequestsInput = {
    val __obj = js.Dynamic.literal(repositoryName = repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPullRequestsInput]
  }
  
  @scala.inline
  implicit class ListPullRequestsInputOps[Self <: ListPullRequestsInput] (val x: Self) extends AnyVal {
    
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
    def setRepositoryName(value: RepositoryName): Self = this.set("repositoryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorArn(value: Arn): Self = this.set("authorArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthorArn: Self = this.set("authorArn", js.undefined)
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    
    @scala.inline
    def setPullRequestStatus(value: PullRequestStatusEnum): Self = this.set("pullRequestStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePullRequestStatus: Self = this.set("pullRequestStatus", js.undefined)
  }
}
