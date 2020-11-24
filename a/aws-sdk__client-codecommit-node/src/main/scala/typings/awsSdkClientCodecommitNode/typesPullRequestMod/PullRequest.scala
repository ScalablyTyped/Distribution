package typings.awsSdkClientCodecommitNode.typesPullRequestMod

import typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.CLOSED
import typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.OPEN
import typings.awsSdkClientCodecommitNode.typesPullRequestTargetMod.PullRequestTarget
import typings.std.Date
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PullRequest extends js.Object {
  
  /**
    * <p>The Amazon Resource Name (ARN) of the user who created the pull request.</p>
    */
  var authorArn: js.UndefOr[String] = js.native
  
  /**
    * <p>A unique, client-generated idempotency token that when provided in a request, ensures the request cannot be repeated with a changed parameter. If a request is received with the same parameters and a token is included, the request will return information about the initial request that used that token.</p>
    */
  var clientRequestToken: js.UndefOr[String] = js.native
  
  /**
    * <p>The date and time the pull request was originally created, in timestamp format.</p>
    */
  var creationDate: js.UndefOr[Date | String | Double] = js.native
  
  /**
    * <p>The user-defined description of the pull request. This description can be used to clarify what should be reviewed and other details of the request.</p>
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * <p>The day and time of the last user or system activity on the pull request, in timestamp format.</p>
    */
  var lastActivityDate: js.UndefOr[Date | String | Double] = js.native
  
  /**
    * <p>The system-generated ID of the pull request. </p>
    */
  var pullRequestId: js.UndefOr[String] = js.native
  
  /**
    * <p>The status of the pull request. Pull request status can only change from <code>OPEN</code> to <code>CLOSED</code>.</p>
    */
  var pullRequestStatus: js.UndefOr[OPEN | CLOSED | String] = js.native
  
  /**
    * <p>The targets of the pull request, including the source branch and destination branch for the pull request.</p>
    */
  var pullRequestTargets: js.UndefOr[js.Array[PullRequestTarget] | Iterable[PullRequestTarget]] = js.native
  
  /**
    * <p>The user-defined title of the pull request. This title is displayed in the list of pull requests to other users of the repository.</p>
    */
  var title: js.UndefOr[String] = js.native
}
object PullRequest {
  
  @scala.inline
  def apply(): PullRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PullRequest]
  }
  
  @scala.inline
  implicit class PullRequestOps[Self <: PullRequest] (val x: Self) extends AnyVal {
    
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
    def setAuthorArn(value: String): Self = this.set("authorArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthorArn: Self = this.set("authorArn", js.undefined)
    
    @scala.inline
    def setClientRequestToken(value: String): Self = this.set("clientRequestToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientRequestToken: Self = this.set("clientRequestToken", js.undefined)
    
    @scala.inline
    def setCreationDate(value: Date | String | Double): Self = this.set("creationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationDate: Self = this.set("creationDate", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setLastActivityDate(value: Date | String | Double): Self = this.set("lastActivityDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastActivityDate: Self = this.set("lastActivityDate", js.undefined)
    
    @scala.inline
    def setPullRequestId(value: String): Self = this.set("pullRequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePullRequestId: Self = this.set("pullRequestId", js.undefined)
    
    @scala.inline
    def setPullRequestStatus(value: OPEN | CLOSED | String): Self = this.set("pullRequestStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePullRequestStatus: Self = this.set("pullRequestStatus", js.undefined)
    
    @scala.inline
    def setPullRequestTargetsVarargs(value: PullRequestTarget*): Self = this.set("pullRequestTargets", js.Array(value :_*))
    
    @scala.inline
    def setPullRequestTargets(value: js.Array[PullRequestTarget] | Iterable[PullRequestTarget]): Self = this.set("pullRequestTargets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePullRequestTargets: Self = this.set("pullRequestTargets", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
