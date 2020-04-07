package typings.awsSdkClientSqsNode.typesSendMessageBatchOutputMod

import typings.awsSdkClientSqsNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientSqsNode.typesBatchResultErrorEntryMod.UnmarshalledBatchResultErrorEntry
import typings.awsSdkClientSqsNode.typesSendMessageBatchResultEntryMod.UnmarshalledSendMessageBatchResultEntry
import typings.awsSdkTypes.responseMod.ResponseMetadata
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
  var Failed: js.Array[UnmarshalledBatchResultErrorEntry]
  /**
    * <p>A list of <code> <a>SendMessageBatchResultEntry</a> </code> items.</p>
    */
  var Successful: js.Array[UnmarshalledSendMessageBatchResultEntry]
}

object SendMessageBatchOutput {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    Failed: js.Array[UnmarshalledBatchResultErrorEntry],
    Successful: js.Array[UnmarshalledSendMessageBatchResultEntry]
  ): SendMessageBatchOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], Failed = Failed.asInstanceOf[js.Any], Successful = Successful.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SendMessageBatchOutput]
  }
}

