package typings.atAwsDashSdkClientDashCodecommitDashNode.typesGetCommentsForComparedCommitInputMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkTypes.buildAbortMod.AbortSignal
import typings.atAwsDashSdkTypes.buildHttpMod.NodeHttpOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetCommentsForComparedCommitInput extends InputTypesUnion {
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
    * <p>To establish the directionality of the comparison, the full commit ID of the 'after' commit.</p>
    */
  var afterCommitId: String
  /**
    * <p>To establish the directionality of the comparison, the full commit ID of the 'before' commit.</p>
    */
  var beforeCommitId: js.UndefOr[String] = js.undefined
  /**
    * <p>A non-negative integer used to limit the number of returned results. The default is 100 comments, and is configurable up to 500.</p>
    */
  var maxResults: js.UndefOr[Double] = js.undefined
  /**
    * <p>An enumeration token that when provided in a request, returns the next batch of the results. </p>
    */
  var nextToken: js.UndefOr[String] = js.undefined
  /**
    * <p>The name of the repository where you want to compare commits.</p>
    */
  var repositoryName: String
}

object GetCommentsForComparedCommitInput {
  @scala.inline
  def apply(
    afterCommitId: String,
    repositoryName: String,
    $abortSignal: AbortSignal = null,
    $httpOptions: NodeHttpOptions = null,
    $maxRetries: Int | Double = null,
    beforeCommitId: String = null,
    maxResults: Int | Double = null,
    nextToken: String = null
  ): GetCommentsForComparedCommitInput = {
    val __obj = js.Dynamic.literal(afterCommitId = afterCommitId, repositoryName = repositoryName)
    if ($abortSignal != null) __obj.updateDynamic("$abortSignal")($abortSignal)
    if ($httpOptions != null) __obj.updateDynamic("$httpOptions")($httpOptions)
    if ($maxRetries != null) __obj.updateDynamic("$maxRetries")($maxRetries.asInstanceOf[js.Any])
    if (beforeCommitId != null) __obj.updateDynamic("beforeCommitId")(beforeCommitId)
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[GetCommentsForComparedCommitInput]
  }
}

