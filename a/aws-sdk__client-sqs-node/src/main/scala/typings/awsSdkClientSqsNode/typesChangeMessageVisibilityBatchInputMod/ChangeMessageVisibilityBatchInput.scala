package typings.awsSdkClientSqsNode.typesChangeMessageVisibilityBatchInputMod

import typings.awsSdkClientSqsNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientSqsNode.typesChangeMessageVisibilityBatchRequestEntryMod.ChangeMessageVisibilityBatchRequestEntry
import typings.awsSdkTypes.abortMod.AbortSignal
import typings.awsSdkTypes.httpMod.NodeHttpOptions
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangeMessageVisibilityBatchInput extends InputTypesUnion {
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
    * <p>A list of receipt handles of the messages for which the visibility timeout must be changed.</p>
    */
  var Entries: js.Array[ChangeMessageVisibilityBatchRequestEntry] | Iterable[ChangeMessageVisibilityBatchRequestEntry]
  /**
    * <p>The URL of the Amazon SQS queue whose messages' visibility is changed.</p> <p>Queue URLs and names are case-sensitive.</p>
    */
  var QueueUrl: String
}

object ChangeMessageVisibilityBatchInput {
  @scala.inline
  def apply(
    Entries: js.Array[ChangeMessageVisibilityBatchRequestEntry] | Iterable[ChangeMessageVisibilityBatchRequestEntry],
    QueueUrl: String,
    $abortSignal: AbortSignal = null,
    $httpOptions: NodeHttpOptions = null,
    $maxRetries: Int | Double = null
  ): ChangeMessageVisibilityBatchInput = {
    val __obj = js.Dynamic.literal(Entries = Entries.asInstanceOf[js.Any], QueueUrl = QueueUrl.asInstanceOf[js.Any])
    if ($abortSignal != null) __obj.updateDynamic("$abortSignal")($abortSignal.asInstanceOf[js.Any])
    if ($httpOptions != null) __obj.updateDynamic("$httpOptions")($httpOptions.asInstanceOf[js.Any])
    if ($maxRetries != null) __obj.updateDynamic("$maxRetries")($maxRetries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeMessageVisibilityBatchInput]
  }
}

