package typings.atAwsDashSdkClientDashXrayDashNode.typesBatchGetTracesOutputMod

import typings.atAwsDashSdkClientDashXrayDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashXrayDashNode.typesUnderscoreTraceMod._UnmarshalledTrace
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchGetTracesOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>Pagination token. Not used.</p>
    */
  var NextToken: js.UndefOr[String] = js.undefined
  /**
    * <p>Full traces for the specified requests.</p>
    */
  var Traces: js.UndefOr[js.Array[_UnmarshalledTrace]] = js.undefined
  /**
    * <p>Trace IDs of requests that haven't been processed.</p>
    */
  var UnprocessedTraceIds: js.UndefOr[js.Array[String]] = js.undefined
}

object BatchGetTracesOutput {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    NextToken: String = null,
    Traces: js.Array[_UnmarshalledTrace] = null,
    UnprocessedTraceIds: js.Array[String] = null
  ): BatchGetTracesOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (Traces != null) __obj.updateDynamic("Traces")(Traces)
    if (UnprocessedTraceIds != null) __obj.updateDynamic("UnprocessedTraceIds")(UnprocessedTraceIds)
    __obj.asInstanceOf[BatchGetTracesOutput]
  }
}

