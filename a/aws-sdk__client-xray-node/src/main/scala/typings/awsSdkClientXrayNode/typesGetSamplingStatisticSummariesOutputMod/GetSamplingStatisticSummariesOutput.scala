package typings.awsSdkClientXrayNode.typesGetSamplingStatisticSummariesOutputMod

import typings.awsSdkClientXrayNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientXrayNode.typesSamplingStatisticSummaryMod.UnmarshalledSamplingStatisticSummary
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSamplingStatisticSummariesOutput extends OutputTypesUnion {
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
    * <p>Information about the number of requests instrumented for each sampling rule.</p>
    */
  var SamplingStatisticSummaries: js.UndefOr[js.Array[UnmarshalledSamplingStatisticSummary]] = js.undefined
}

object GetSamplingStatisticSummariesOutput {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    NextToken: String = null,
    SamplingStatisticSummaries: js.Array[UnmarshalledSamplingStatisticSummary] = null
  ): GetSamplingStatisticSummariesOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (SamplingStatisticSummaries != null) __obj.updateDynamic("SamplingStatisticSummaries")(SamplingStatisticSummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSamplingStatisticSummariesOutput]
  }
}

