package typings.atAwsDashSdkClientDashXrayDashNode.typesGetSamplingStatisticSummariesOutputMod

import typings.atAwsDashSdkClientDashXrayDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashXrayDashNode.typesUnderscoreSamplingStatisticSummaryMod._UnmarshalledSamplingStatisticSummary
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
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
  var SamplingStatisticSummaries: js.UndefOr[js.Array[_UnmarshalledSamplingStatisticSummary]] = js.undefined
}

object GetSamplingStatisticSummariesOutput {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    NextToken: String = null,
    SamplingStatisticSummaries: js.Array[_UnmarshalledSamplingStatisticSummary] = null
  ): GetSamplingStatisticSummariesOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (SamplingStatisticSummaries != null) __obj.updateDynamic("SamplingStatisticSummaries")(SamplingStatisticSummaries)
    __obj.asInstanceOf[GetSamplingStatisticSummariesOutput]
  }
}

