package typings.awsSdkClientCodecommitNode.typesMergePullRequestByFastForwardInputMod

import typings.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkTypes.abortMod.AbortSignal
import typings.awsSdkTypes.httpMod.NodeHttpOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MergePullRequestByFastForwardInput extends InputTypesUnion {
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
    * <p>The system-generated ID of the pull request. To get this ID, use <a>ListPullRequests</a>.</p>
    */
  var pullRequestId: String = js.native
  /**
    * <p>The name of the repository where the pull request was created.</p>
    */
  var repositoryName: String = js.native
  /**
    * <p>The full commit ID of the original or updated commit in the pull request source branch. Pass this value if you want an exception thrown if the current commit ID of the tip of the source branch does not match this commit ID.</p>
    */
  var sourceCommitId: js.UndefOr[String] = js.native
}

object MergePullRequestByFastForwardInput {
  @scala.inline
  def apply(pullRequestId: String, repositoryName: String): MergePullRequestByFastForwardInput = {
    val __obj = js.Dynamic.literal(pullRequestId = pullRequestId.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[MergePullRequestByFastForwardInput]
  }
  @scala.inline
  implicit class MergePullRequestByFastForwardInputOps[Self <: MergePullRequestByFastForwardInput] (val x: Self) extends AnyVal {
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
    def setPullRequestId(value: String): Self = this.set("pullRequestId", value.asInstanceOf[js.Any])
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
    def setSourceCommitId(value: String): Self = this.set("sourceCommitId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceCommitId: Self = this.set("sourceCommitId", js.undefined)
  }
  
}

