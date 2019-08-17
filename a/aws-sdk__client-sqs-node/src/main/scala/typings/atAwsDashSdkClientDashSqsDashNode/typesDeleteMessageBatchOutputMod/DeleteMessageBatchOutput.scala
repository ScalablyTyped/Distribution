package typings.atAwsDashSdkClientDashSqsDashNode.typesDeleteMessageBatchOutputMod

import typings.atAwsDashSdkClientDashSqsDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashSqsDashNode.typesUnderscoreBatchResultErrorEntryMod._UnmarshalledBatchResultErrorEntry
import typings.atAwsDashSdkClientDashSqsDashNode.typesUnderscoreDeleteMessageBatchResultEntryMod._UnmarshalledDeleteMessageBatchResultEntry
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteMessageBatchOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>A list of <code> <a>BatchResultErrorEntry</a> </code> items.</p>
    */
  var Failed: js.Array[_UnmarshalledBatchResultErrorEntry]
  /**
    * <p>A list of <code> <a>DeleteMessageBatchResultEntry</a> </code> items.</p>
    */
  var Successful: js.Array[_UnmarshalledDeleteMessageBatchResultEntry]
}

object DeleteMessageBatchOutput {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    Failed: js.Array[_UnmarshalledBatchResultErrorEntry],
    Successful: js.Array[_UnmarshalledDeleteMessageBatchResultEntry]
  ): DeleteMessageBatchOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata, Failed = Failed, Successful = Successful)
  
    __obj.asInstanceOf[DeleteMessageBatchOutput]
  }
}

