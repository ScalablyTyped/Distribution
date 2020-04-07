package typings.awsSdkClientXrayNode.typesGetSamplingTargetsOutputMod

import typings.awsSdkClientXrayNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientXrayNode.typesSamplingTargetDocumentMod.UnmarshalledSamplingTargetDocument
import typings.awsSdkClientXrayNode.typesUnprocessedStatisticsMod.UnmarshalledUnprocessedStatistics
import typings.awsSdkTypes.responseMod.ResponseMetadata
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSamplingTargetsOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>The last time a user changed the sampling rule configuration. If the sampling rule configuration changed since the service last retrieved it, the service should call <a>GetSamplingRules</a> to get the latest version.</p>
    */
  var LastRuleModification: js.UndefOr[Date] = js.undefined
  /**
    * <p>Updated rules that the service should use to sample requests.</p>
    */
  var SamplingTargetDocuments: js.UndefOr[js.Array[UnmarshalledSamplingTargetDocument]] = js.undefined
  /**
    * <p>Information about <a>SamplingStatisticsDocument</a> that X-Ray could not process.</p>
    */
  var UnprocessedStatistics: js.UndefOr[js.Array[UnmarshalledUnprocessedStatistics]] = js.undefined
}

object GetSamplingTargetsOutput {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    LastRuleModification: Date = null,
    SamplingTargetDocuments: js.Array[UnmarshalledSamplingTargetDocument] = null,
    UnprocessedStatistics: js.Array[UnmarshalledUnprocessedStatistics] = null
  ): GetSamplingTargetsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (LastRuleModification != null) __obj.updateDynamic("LastRuleModification")(LastRuleModification.asInstanceOf[js.Any])
    if (SamplingTargetDocuments != null) __obj.updateDynamic("SamplingTargetDocuments")(SamplingTargetDocuments.asInstanceOf[js.Any])
    if (UnprocessedStatistics != null) __obj.updateDynamic("UnprocessedStatistics")(UnprocessedStatistics.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSamplingTargetsOutput]
  }
}

