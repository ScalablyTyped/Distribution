package typings.awsSdkClientSqsNode.typesChangeMessageVisibilityBatchInputMod

import typings.awsSdkClientSqsNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientSqsNode.typesChangeMessageVisibilityBatchRequestEntryMod.ChangeMessageVisibilityBatchRequestEntry
import typings.awsSdkTypes.abortMod.AbortSignal
import typings.awsSdkTypes.httpMod.NodeHttpOptions
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChangeMessageVisibilityBatchInput extends InputTypesUnion {
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
    * <p>A list of receipt handles of the messages for which the visibility timeout must be changed.</p>
    */
  var Entries: js.Array[ChangeMessageVisibilityBatchRequestEntry] | Iterable[ChangeMessageVisibilityBatchRequestEntry] = js.native
  /**
    * <p>The URL of the Amazon SQS queue whose messages' visibility is changed.</p> <p>Queue URLs and names are case-sensitive.</p>
    */
  var QueueUrl: String = js.native
}

object ChangeMessageVisibilityBatchInput {
  @scala.inline
  def apply(
    Entries: js.Array[ChangeMessageVisibilityBatchRequestEntry] | Iterable[ChangeMessageVisibilityBatchRequestEntry],
    QueueUrl: String
  ): ChangeMessageVisibilityBatchInput = {
    val __obj = js.Dynamic.literal(Entries = Entries.asInstanceOf[js.Any], QueueUrl = QueueUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeMessageVisibilityBatchInput]
  }
  @scala.inline
  implicit class ChangeMessageVisibilityBatchInputOps[Self <: ChangeMessageVisibilityBatchInput] (val x: Self) extends AnyVal {
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
    def setEntriesVarargs(value: ChangeMessageVisibilityBatchRequestEntry*): Self = this.set("Entries", js.Array(value :_*))
    @scala.inline
    def setEntries(
      value: js.Array[ChangeMessageVisibilityBatchRequestEntry] | Iterable[ChangeMessageVisibilityBatchRequestEntry]
    ): Self = this.set("Entries", value.asInstanceOf[js.Any])
    @scala.inline
    def setQueueUrl(value: String): Self = this.set("QueueUrl", value.asInstanceOf[js.Any])
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
  }
  
}

