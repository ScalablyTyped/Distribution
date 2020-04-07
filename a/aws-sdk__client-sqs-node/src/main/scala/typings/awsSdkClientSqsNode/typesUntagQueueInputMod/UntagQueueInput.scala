package typings.awsSdkClientSqsNode.typesUntagQueueInputMod

import typings.awsSdkClientSqsNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkTypes.abortMod.AbortSignal
import typings.awsSdkTypes.httpMod.NodeHttpOptions
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UntagQueueInput extends InputTypesUnion {
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
    * <p>The URL of the queue.</p>
    */
  var QueueUrl: String
  /**
    * <p>The list of tags to be removed from the specified queue.</p>
    */
  var TagKeys: js.Array[String] | Iterable[String]
}

object UntagQueueInput {
  @scala.inline
  def apply(
    QueueUrl: String,
    TagKeys: js.Array[String] | Iterable[String],
    $abortSignal: AbortSignal = null,
    $httpOptions: NodeHttpOptions = null,
    $maxRetries: Int | Double = null
  ): UntagQueueInput = {
    val __obj = js.Dynamic.literal(QueueUrl = QueueUrl.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
    if ($abortSignal != null) __obj.updateDynamic("$abortSignal")($abortSignal.asInstanceOf[js.Any])
    if ($httpOptions != null) __obj.updateDynamic("$httpOptions")($httpOptions.asInstanceOf[js.Any])
    if ($maxRetries != null) __obj.updateDynamic("$maxRetries")($maxRetries.asInstanceOf[js.Any])
    __obj.asInstanceOf[UntagQueueInput]
  }
}

