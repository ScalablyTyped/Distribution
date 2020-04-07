package typings.awsSdkClientXrayNode.typesGetTraceSummariesOutputMod

import typings.awsSdkClientXrayNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientXrayNode.typesTraceSummaryMod.UnmarshalledTraceSummary
import typings.awsSdkTypes.responseMod.ResponseMetadata
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTraceSummariesOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>The start time of this page of results.</p>
    */
  var ApproximateTime: js.UndefOr[Date] = js.undefined
  /**
    * <p>If the requested time frame contained more than one page of results, you can use this token to retrieve the next page. The first page contains the most most recent results, closest to the end of the time frame.</p>
    */
  var NextToken: js.UndefOr[String] = js.undefined
  /**
    * <p>Trace IDs and metadata for traces that were found in the specified time frame.</p>
    */
  var TraceSummaries: js.UndefOr[js.Array[UnmarshalledTraceSummary]] = js.undefined
  /**
    * <p>The total number of traces processed, including traces that did not match the specified filter expression.</p>
    */
  var TracesProcessedCount: js.UndefOr[Double] = js.undefined
}

object GetTraceSummariesOutput {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    ApproximateTime: Date = null,
    NextToken: String = null,
    TraceSummaries: js.Array[UnmarshalledTraceSummary] = null,
    TracesProcessedCount: Int | Double = null
  ): GetTraceSummariesOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (ApproximateTime != null) __obj.updateDynamic("ApproximateTime")(ApproximateTime.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (TraceSummaries != null) __obj.updateDynamic("TraceSummaries")(TraceSummaries.asInstanceOf[js.Any])
    if (TracesProcessedCount != null) __obj.updateDynamic("TracesProcessedCount")(TracesProcessedCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTraceSummariesOutput]
  }
}

