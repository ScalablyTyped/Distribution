package typings.atAwsDashSdkClientDashSqsDashNode.typesSendMessageBatchOutputMod

import typings.atAwsDashSdkClientDashSqsDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashSqsDashNode.typesUnderscoreBatchResultErrorEntryMod._UnmarshalledBatchResultErrorEntry
import typings.atAwsDashSdkClientDashSqsDashNode.typesUnderscoreSendMessageBatchResultEntryMod._UnmarshalledSendMessageBatchResultEntry
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendMessageBatchOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>A list of <code> <a>BatchResultErrorEntry</a> </code> items with error details about each message that can't be enqueued.</p>
    */
  var Failed: js.Array[_UnmarshalledBatchResultErrorEntry]
  /**
    * <p>A list of <code> <a>SendMessageBatchResultEntry</a> </code> items.</p>
    */
  var Successful: js.Array[_UnmarshalledSendMessageBatchResultEntry]
}

object SendMessageBatchOutput {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    Failed: js.Array[_UnmarshalledBatchResultErrorEntry],
    Successful: js.Array[_UnmarshalledSendMessageBatchResultEntry]
  ): SendMessageBatchOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata, Failed = Failed, Successful = Successful)
  
    __obj.asInstanceOf[SendMessageBatchOutput]
  }
}

