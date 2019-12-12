package typings.atAwsDashSdkClientDashSqsDashNode

import typings.atAwsDashSdkClientDashSqsDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashSqsDashNode.typesUnderscoreChangeMessageVisibilityBatchRequestEntryMod._ChangeMessageVisibilityBatchRequestEntry
import typings.atAwsDashSdkTypes.buildAbortMod.AbortSignal
import typings.atAwsDashSdkTypes.buildHttpMod.NodeHttpOptions
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-sqs-node/types/ChangeMessageVisibilityBatchInput", JSImport.Namespace)
@js.native
object typesChangeMessageVisibilityBatchInputMod extends js.Object {
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
    var Entries: js.Array[_ChangeMessageVisibilityBatchRequestEntry] | Iterable[_ChangeMessageVisibilityBatchRequestEntry] = js.native
    /**
      * <p>The URL of the Amazon SQS queue whose messages' visibility is changed.</p> <p>Queue URLs and names are case-sensitive.</p>
      */
    var QueueUrl: String = js.native
  }
  
}

