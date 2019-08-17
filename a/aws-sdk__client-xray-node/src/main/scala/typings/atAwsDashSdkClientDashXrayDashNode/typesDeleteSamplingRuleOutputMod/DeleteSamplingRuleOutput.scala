package typings.atAwsDashSdkClientDashXrayDashNode.typesDeleteSamplingRuleOutputMod

import typings.atAwsDashSdkClientDashXrayDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashXrayDashNode.typesUnderscoreSamplingRuleRecordMod._UnmarshalledSamplingRuleRecord
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteSamplingRuleOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>The deleted rule definition and metadata.</p>
    */
  var SamplingRuleRecord: js.UndefOr[_UnmarshalledSamplingRuleRecord] = js.undefined
}

object DeleteSamplingRuleOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, SamplingRuleRecord: _UnmarshalledSamplingRuleRecord = null): DeleteSamplingRuleOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata)
    if (SamplingRuleRecord != null) __obj.updateDynamic("SamplingRuleRecord")(SamplingRuleRecord)
    __obj.asInstanceOf[DeleteSamplingRuleOutput]
  }
}

