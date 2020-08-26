package typings.awsSdkClientCodecommitNode.typesListPullRequestsInputMod

import typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.CLOSED
import typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.OPEN
import typings.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkTypes.abortMod.AbortSignal
import typings.awsSdkTypes.httpMod.NodeHttpOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPullRequestsInput extends InputTypesUnion {
  /**
    * An object that may be queried to determine if the underlying operation has been aborted.
    *
    * @see https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal
    */
  @JSName("$abortSignal")
  var $abortSignal: js.UndefOr[AbortSignal] = js.native
  /**
    * Per-request HTTP configuration options. If set, any options specified will override the corresponding HTTP option set on the client for this command.
    */
  @JSName("$httpOptions")
  var $httpOptions: js.UndefOr[NodeHttpOptions] = js.native
  /**
    * The maximum number of times this operation should be retried. If set, this value will override the `maxRetries` configuration set on the client for this command.
    */
  @JSName("$maxRetries")
  var $maxRetries: js.UndefOr[Double] = js.native
  /**
    * <p>Optional. The Amazon Resource Name (ARN) of the user who created the pull request. If used, this filters the results to pull requests created by that user.</p>
    */
  var authorArn: js.UndefOr[String] = js.native
  /**
    * <p>A non-negative integer used to limit the number of returned results.</p>
    */
  var maxResults: js.UndefOr[Double] = js.native
  /**
    * <p>An enumeration token that when provided in a request, returns the next batch of the results.</p>
    */
  var nextToken: js.UndefOr[String] = js.native
  /**
    * <p>Optional. The status of the pull request. If used, this refines the results to the pull requests that match the specified status.</p>
    */
  var pullRequestStatus: js.UndefOr[OPEN | CLOSED | String] = js.native
  /**
    * <p>The name of the repository for which you want to list pull requests.</p>
    */
  var repositoryName: String = js.native
}

object ListPullRequestsInput {
  @scala.inline
  def apply(repositoryName: String): ListPullRequestsInput = {
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
    def setRepositoryName(value: String): Self = this.set("repositoryName", value.asInstanceOf[js.Any])
    @scala.inline
    def set$abortSignal(value: AbortSignal): Self = this.set("$abortSignal", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$abortSignal: Self = this.set("$abortSignal", js.undefined)
    @scala.inline
    def set$httpOptions(value: NodeHttpOptions): Self = this.set("$httpOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$httpOptions: Self = this.set("$httpOptions", js.undefined)
    @scala.inline
    def set$maxRetries(value: Double): Self = this.set("$maxRetries", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$maxRetries: Self = this.set("$maxRetries", js.undefined)
    @scala.inline
    def setAuthorArn(value: String): Self = this.set("authorArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthorArn: Self = this.set("authorArn", js.undefined)
    @scala.inline
    def setMaxResults(value: Double): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    @scala.inline
    def setNextToken(value: String): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    @scala.inline
    def setPullRequestStatus(value: OPEN | CLOSED | String): Self = this.set("pullRequestStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePullRequestStatus: Self = this.set("pullRequestStatus", js.undefined)
  }
  
}

