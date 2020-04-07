package typings.awsSdkClientKinesisBrowser.typesCreateStreamInputMod

import typings.awsSdkClientKinesisBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkTypes.abortMod.AbortSignal
import typings.awsSdkTypes.httpMod.BrowserHttpOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateStreamInput extends InputTypesUnion {
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
    * <p>The number of shards that the stream will use. The throughput of the stream is a function of the number of shards; more shards are required for greater provisioned throughput.</p> <p>DefaultShardLimit;</p>
    */
  var ShardCount: Double
  /**
    * <p>A name to identify the stream. The stream name is scoped to the AWS account used by the application that creates the stream. It is also scoped by AWS Region. That is, two streams in two different AWS accounts can have the same name. Two streams in the same AWS account but in two different Regions can also have the same name.</p>
    */
  var StreamName: String
}

object CreateStreamInput {
  @scala.inline
  def apply(
    ShardCount: Double,
    StreamName: String,
    $abortSignal: AbortSignal = null,
    $httpOptions: BrowserHttpOptions = null,
    $maxRetries: Int | Double = null
  ): CreateStreamInput = {
    val __obj = js.Dynamic.literal(ShardCount = ShardCount.asInstanceOf[js.Any], StreamName = StreamName.asInstanceOf[js.Any])
    if ($abortSignal != null) __obj.updateDynamic("$abortSignal")($abortSignal.asInstanceOf[js.Any])
    if ($httpOptions != null) __obj.updateDynamic("$httpOptions")($httpOptions.asInstanceOf[js.Any])
    if ($maxRetries != null) __obj.updateDynamic("$maxRetries")($maxRetries.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateStreamInput]
  }
}

