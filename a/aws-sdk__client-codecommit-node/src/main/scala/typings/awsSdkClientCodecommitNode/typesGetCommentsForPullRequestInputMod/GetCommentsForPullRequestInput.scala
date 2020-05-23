package typings.awsSdkClientCodecommitNode.typesGetCommentsForPullRequestInputMod

import typings.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkTypes.abortMod.AbortSignal
import typings.awsSdkTypes.httpMod.NodeHttpOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetCommentsForPullRequestInput extends InputTypesUnion {
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
    * <p>The full commit ID of the commit in the source branch that was the tip of the branch at the time the comment was made.</p>
    */
  var afterCommitId: js.UndefOr[String] = js.undefined
  /**
    * <p>The full commit ID of the commit in the destination branch that was the tip of the branch at the time the pull request was created.</p>
    */
  var beforeCommitId: js.UndefOr[String] = js.undefined
  /**
    * <p>A non-negative integer used to limit the number of returned results. The default is 100 comments. You can return up to 500 comments with a single request.</p>
    */
  var maxResults: js.UndefOr[Double] = js.undefined
  /**
    * <p>An enumeration token that when provided in a request, returns the next batch of the results.</p>
    */
  var nextToken: js.UndefOr[String] = js.undefined
  /**
    * <p>The system-generated ID of the pull request. To get this ID, use <a>ListPullRequests</a>.</p>
    */
  var pullRequestId: String
  /**
    * <p>The name of the repository that contains the pull request.</p>
    */
  var repositoryName: js.UndefOr[String] = js.undefined
}

object GetCommentsForPullRequestInput {
  @scala.inline
  def apply(
    pullRequestId: String,
    $abortSignal: AbortSignal = null,
    $httpOptions: NodeHttpOptions = null,
    $maxRetries: js.UndefOr[Double] = js.undefined,
    afterCommitId: String = null,
    beforeCommitId: String = null,
    maxResults: js.UndefOr[Double] = js.undefined,
    nextToken: String = null,
    repositoryName: String = null
  ): GetCommentsForPullRequestInput = {
    val __obj = js.Dynamic.literal(pullRequestId = pullRequestId.asInstanceOf[js.Any])
    if ($abortSignal != null) __obj.updateDynamic("$abortSignal")($abortSignal.asInstanceOf[js.Any])
    if ($httpOptions != null) __obj.updateDynamic("$httpOptions")($httpOptions.asInstanceOf[js.Any])
    if (!js.isUndefined($maxRetries)) __obj.updateDynamic("$maxRetries")($maxRetries.get.asInstanceOf[js.Any])
    if (afterCommitId != null) __obj.updateDynamic("afterCommitId")(afterCommitId.asInstanceOf[js.Any])
    if (beforeCommitId != null) __obj.updateDynamic("beforeCommitId")(beforeCommitId.asInstanceOf[js.Any])
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults.get.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (repositoryName != null) __obj.updateDynamic("repositoryName")(repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCommentsForPullRequestInput]
  }
}

