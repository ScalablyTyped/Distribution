package typings.atAwsDashSdkClientDashSqsDashNode.typesChangeMessageVisibilityBatchOutputMod

import typings.atAwsDashSdkClientDashSqsDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashSqsDashNode.typesUnderscoreBatchResultErrorEntryMod._UnmarshalledBatchResultErrorEntry
import typings.atAwsDashSdkClientDashSqsDashNode.typesUnderscoreChangeMessageVisibilityBatchResultEntryMod._UnmarshalledChangeMessageVisibilityBatchResultEntry
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
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
  var Failed: js.Array[_UnmarshalledBatchResultErrorEntry]
  /**
    * <p>A list of <code> <a>ChangeMessageVisibilityBatchResultEntry</a> </code> items.</p>
    */
  var Successful: js.Array[_UnmarshalledChangeMessageVisibilityBatchResultEntry]
}

object ChangeMessageVisibilityBatchOutput {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    Failed: js.Array[_UnmarshalledBatchResultErrorEntry],
    Successful: js.Array[_UnmarshalledChangeMessageVisibilityBatchResultEntry]
  ): ChangeMessageVisibilityBatchOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata, Failed = Failed, Successful = Successful)
  
    __obj.asInstanceOf[ChangeMessageVisibilityBatchOutput]
  }
}

