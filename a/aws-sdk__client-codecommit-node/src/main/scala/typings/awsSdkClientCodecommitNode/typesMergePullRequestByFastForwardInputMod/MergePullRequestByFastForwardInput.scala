package typings.awsSdkClientCodecommitNode.typesMergePullRequestByFastForwardInputMod

import typings.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkTypes.abortMod.AbortSignal
import typings.awsSdkTypes.httpMod.NodeHttpOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MergePullRequestByFastForwardInput extends InputTypesUnion {
  /**
    * An object that may be queried to determine if the underlying operation has been aborted.
    *
    * @see https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal
    */
  @JSName("$abortSignal")
  var $abortSignal: js.UndefOr[AbortSignal] = js.undefined
  /**
    * Per-request HTTP configuration options. If set, any options specified will override the corresponding HTTP option set on the client for this command.
    */
  @JSName("$httpOptions")
  var $httpOptions: js.UndefOr[NodeHttpOptions] = js.undefined
  /**
    * The maximum number of times this operation should be retried. If set, this value will override the `maxRetries` configuration set on the client for this command.
    */
  @JSName("$maxRetries")
  var $maxRetries: js.UndefOr[Double] = js.undefined
  /**
    * <p>The system-generated ID of the pull request. To get this ID, use <a>ListPullRequests</a>.</p>
    */
  var pullRequestId: String
  /**
    * <p>The name of the repository where the pull request was created.</p>
    */
  var repositoryName: String
  /**
    * <p>The full commit ID of the original or updated commit in the pull request source branch. Pass this value if you want an exception thrown if the current commit ID of the tip of the source branch does not match this commit ID.</p>
    */
  var sourceCommitId: js.UndefOr[String] = js.undefined
}

object MergePullRequestByFastForwardInput {
  @scala.inline
  def apply(
    pullRequestId: String,
    repositoryName: String,
    $abortSignal: AbortSignal = null,
    $httpOptions: NodeHttpOptions = null,
    $maxRetries: Int | Double = null,
    sourceCommitId: String = null
  ): MergePullRequestByFastForwardInput = {
    val __obj = js.Dynamic.literal(pullRequestId = pullRequestId.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
    if ($abortSignal != null) __obj.updateDynamic("$abortSignal")($abortSignal.asInstanceOf[js.Any])
    if ($httpOptions != null) __obj.updateDynamic("$httpOptions")($httpOptions.asInstanceOf[js.Any])
    if ($maxRetries != null) __obj.updateDynamic("$maxRetries")($maxRetries.asInstanceOf[js.Any])
    if (sourceCommitId != null) __obj.updateDynamic("sourceCommitId")(sourceCommitId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MergePullRequestByFastForwardInput]
  }
}

