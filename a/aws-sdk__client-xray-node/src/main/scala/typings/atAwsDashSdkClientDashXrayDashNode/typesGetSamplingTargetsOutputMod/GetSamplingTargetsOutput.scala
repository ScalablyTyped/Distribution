package typings.atAwsDashSdkClientDashXrayDashNode.typesGetSamplingTargetsOutputMod

import typings.atAwsDashSdkClientDashXrayDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashXrayDashNode.typesUnderscoreSamplingTargetDocumentMod._UnmarshalledSamplingTargetDocument
import typings.atAwsDashSdkClientDashXrayDashNode.typesUnderscoreUnprocessedStatisticsMod._UnmarshalledUnprocessedStatistics
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
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
  var SamplingTargetDocuments: js.UndefOr[js.Array[_UnmarshalledSamplingTargetDocument]] = js.undefined
  /**
    * <p>Information about <a>SamplingStatisticsDocument</a> that X-Ray could not process.</p>
    */
  var UnprocessedStatistics: js.UndefOr[js.Array[_UnmarshalledUnprocessedStatistics]] = js.undefined
}

object GetSamplingTargetsOutput {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    LastRuleModification: Date = null,
    SamplingTargetDocuments: js.Array[_UnmarshalledSamplingTargetDocument] = null,
    UnprocessedStatistics: js.Array[_UnmarshalledUnprocessedStatistics] = null
  ): GetSamplingTargetsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata)
    if (LastRuleModification != null) __obj.updateDynamic("LastRuleModification")(LastRuleModification)
    if (SamplingTargetDocuments != null) __obj.updateDynamic("SamplingTargetDocuments")(SamplingTargetDocuments)
    if (UnprocessedStatistics != null) __obj.updateDynamic("UnprocessedStatistics")(UnprocessedStatistics)
    __obj.asInstanceOf[GetSamplingTargetsOutput]
  }
}

