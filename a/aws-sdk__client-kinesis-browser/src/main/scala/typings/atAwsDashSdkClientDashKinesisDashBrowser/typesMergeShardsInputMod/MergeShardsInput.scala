package typings.atAwsDashSdkClientDashKinesisDashBrowser.typesMergeShardsInputMod

import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkTypes.buildAbortMod.AbortSignal
import typings.atAwsDashSdkTypes.buildHttpMod.BrowserHttpOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MergeShardsInput extends InputTypesUnion {
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
  var $httpOptions: js.UndefOr[BrowserHttpOptions] = js.undefined
  /**
    * The maximum number of times this operation should be retried. If set, this value will override the `maxRetries` configuration set on the client for this command.
    */
  @JSName("$maxRetries")
  var $maxRetries: js.UndefOr[Double] = js.undefined
  /**
    * <p>The shard ID of the adjacent shard for the merge.</p>
    */
  var AdjacentShardToMerge: String
  /**
    * <p>The shard ID of the shard to combine with the adjacent shard for the merge.</p>
    */
  var ShardToMerge: String
  /**
    * <p>The name of the stream for the merge.</p>
    */
  var StreamName: String
}

object MergeShardsInput {
  @scala.inline
  def apply(
    AdjacentShardToMerge: String,
    ShardToMerge: String,
    StreamName: String,
    $abortSignal: AbortSignal = null,
    $httpOptions: BrowserHttpOptions = null,
    $maxRetries: Int | Double = null
  ): MergeShardsInput = {
    val __obj = js.Dynamic.literal(AdjacentShardToMerge = AdjacentShardToMerge, ShardToMerge = ShardToMerge, StreamName = StreamName)
    if ($abortSignal != null) __obj.updateDynamic("$abortSignal")($abortSignal)
    if ($httpOptions != null) __obj.updateDynamic("$httpOptions")($httpOptions)
    if ($maxRetries != null) __obj.updateDynamic("$maxRetries")($maxRetries.asInstanceOf[js.Any])
    __obj.asInstanceOf[MergeShardsInput]
  }
}

