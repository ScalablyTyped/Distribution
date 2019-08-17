package typings.atAwsDashSdkClientDashCodecommitDashNode.typesPostCommentForPullRequestInputMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashCodecommitDashNode.typesUnderscoreLocationMod._Location
import typings.atAwsDashSdkTypes.buildAbortMod.AbortSignal
import typings.atAwsDashSdkTypes.buildHttpMod.NodeHttpOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostCommentForPullRequestInput extends InputTypesUnion {
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
    * <p>The full commit ID of the commit in the source branch that is the current tip of the branch for the pull request when you post the comment.</p>
    */
  var afterCommitId: String
  /**
    * <p>The full commit ID of the commit in the destination branch that was the tip of the branch at the time the pull request was created.</p>
    */
  var beforeCommitId: String
  /**
    * <p>A unique, client-generated idempotency token that when provided in a request, ensures the request cannot be repeated with a changed parameter. If a request is received with the same parameters and a token is included, the request will return information about the initial request that used that token.</p>
    */
  var clientRequestToken: js.UndefOr[String] = js.undefined
  /**
    * <p>The content of your comment on the change.</p>
    */
  var content: String
  /**
    * <p>The location of the change where you want to post your comment. If no location is provided, the comment will be posted as a general comment on the pull request difference between the before commit ID and the after commit ID.</p>
    */
  var location: js.UndefOr[_Location] = js.undefined
  /**
    * <p>The system-generated ID of the pull request. To get this ID, use <a>ListPullRequests</a>.</p>
    */
  var pullRequestId: String
  /**
    * <p>The name of the repository where you want to post a comment on a pull request.</p>
    */
  var repositoryName: String
}

object PostCommentForPullRequestInput {
  @scala.inline
  def apply(
    afterCommitId: String,
    beforeCommitId: String,
    content: String,
    pullRequestId: String,
    repositoryName: String,
    $abortSignal: AbortSignal = null,
    $httpOptions: NodeHttpOptions = null,
    $maxRetries: Int | Double = null,
    clientRequestToken: String = null,
    location: _Location = null
  ): PostCommentForPullRequestInput = {
    val __obj = js.Dynamic.literal(afterCommitId = afterCommitId, beforeCommitId = beforeCommitId, content = content, pullRequestId = pullRequestId, repositoryName = repositoryName)
    if ($abortSignal != null) __obj.updateDynamic("$abortSignal")($abortSignal)
    if ($httpOptions != null) __obj.updateDynamic("$httpOptions")($httpOptions)
    if ($maxRetries != null) __obj.updateDynamic("$maxRetries")($maxRetries.asInstanceOf[js.Any])
    if (clientRequestToken != null) __obj.updateDynamic("clientRequestToken")(clientRequestToken)
    if (location != null) __obj.updateDynamic("location")(location)
    __obj.asInstanceOf[PostCommentForPullRequestInput]
  }
}

