package typings.atAwsDashSdkClientDashCodecommitDashNode.typesGetDifferencesInputMod

import typings.atAwsDashSdkClientDashCodecommitDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkTypes.buildAbortMod.AbortSignal
import typings.atAwsDashSdkTypes.buildHttpMod.NodeHttpOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDifferencesInput extends InputTypesUnion {
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
    * <p>A non-negative integer used to limit the number of returned results.</p>
    */
  var MaxResults: js.UndefOr[Double] = js.undefined
  /**
    * <p>An enumeration token that when provided in a request, returns the next batch of the results.</p>
    */
  var NextToken: js.UndefOr[String] = js.undefined
  /**
    * <p>The branch, tag, HEAD, or other fully qualified reference used to identify a commit.</p>
    */
  var afterCommitSpecifier: String
  /**
    * <p>The file path in which to check differences. Limits the results to this path. Can also be used to specify the changed name of a directory or folder, if it has changed. If not specified, differences will be shown for all paths.</p>
    */
  var afterPath: js.UndefOr[String] = js.undefined
  /**
    * <p>The branch, tag, HEAD, or other fully qualified reference used to identify a commit. For example, the full commit ID. Optional. If not specified, all changes prior to the <code>afterCommitSpecifier</code> value will be shown. If you do not use <code>beforeCommitSpecifier</code> in your request, consider limiting the results with <code>maxResults</code>.</p>
    */
  var beforeCommitSpecifier: js.UndefOr[String] = js.undefined
  /**
    * <p>The file path in which to check for differences. Limits the results to this path. Can also be used to specify the previous name of a directory or folder. If <code>beforePath</code> and <code>afterPath</code> are not specified, differences will be shown for all paths.</p>
    */
  var beforePath: js.UndefOr[String] = js.undefined
  /**
    * <p>The name of the repository where you want to get differences.</p>
    */
  var repositoryName: String
}

object GetDifferencesInput {
  @scala.inline
  def apply(
    afterCommitSpecifier: String,
    repositoryName: String,
    $abortSignal: AbortSignal = null,
    $httpOptions: NodeHttpOptions = null,
    $maxRetries: Int | Double = null,
    MaxResults: Int | Double = null,
    NextToken: String = null,
    afterPath: String = null,
    beforeCommitSpecifier: String = null,
    beforePath: String = null
  ): GetDifferencesInput = {
    val __obj = js.Dynamic.literal(afterCommitSpecifier = afterCommitSpecifier, repositoryName = repositoryName)
    if ($abortSignal != null) __obj.updateDynamic("$abortSignal")($abortSignal)
    if ($httpOptions != null) __obj.updateDynamic("$httpOptions")($httpOptions)
    if ($maxRetries != null) __obj.updateDynamic("$maxRetries")($maxRetries.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (afterPath != null) __obj.updateDynamic("afterPath")(afterPath)
    if (beforeCommitSpecifier != null) __obj.updateDynamic("beforeCommitSpecifier")(beforeCommitSpecifier)
    if (beforePath != null) __obj.updateDynamic("beforePath")(beforePath)
    __obj.asInstanceOf[GetDifferencesInput]
  }
}

