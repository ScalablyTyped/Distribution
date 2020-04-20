package typings.awsSdkClientSqsNode.typesChangeMessageVisibilityBatchOutputMod

import typings.awsSdkClientSqsNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientSqsNode.typesBatchResultErrorEntryMod.UnmarshalledBatchResultErrorEntry
import typings.awsSdkClientSqsNode.typesChangeMessageVisibilityBatchResultEntryMod.UnmarshalledChangeMessageVisibilityBatchResultEntry
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangeMessageVisibilityBatchOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>A list of <code> <a>BatchResultErrorEntry</a> </code> items.</p>
    */
  var Failed: js.Array[UnmarshalledBatchResultErrorEntry]
  /**
    * <p>A list of <code> <a>ChangeMessageVisibilityBatchResultEntry</a> </code> items.</p>
    */
  var Successful: js.Array[UnmarshalledChangeMessageVisibilityBatchResultEntry]
}

object ChangeMessageVisibilityBatchOutput {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    Failed: js.Array[UnmarshalledBatchResultErrorEntry],
    Successful: js.Array[UnmarshalledChangeMessageVisibilityBatchResultEntry]
  ): ChangeMessageVisibilityBatchOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], Failed = Failed.asInstanceOf[js.Any], Successful = Successful.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeMessageVisibilityBatchOutput]
  }
}

