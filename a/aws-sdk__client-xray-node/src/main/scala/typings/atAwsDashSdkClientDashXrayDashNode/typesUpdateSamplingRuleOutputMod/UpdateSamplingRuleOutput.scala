package typings.atAwsDashSdkClientDashXrayDashNode.typesUpdateSamplingRuleOutputMod

import typings.atAwsDashSdkClientDashXrayDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashXrayDashNode.typesUnderscoreSamplingRuleRecordMod._UnmarshalledSamplingRuleRecord
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateSamplingRuleOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>The updated rule definition and metadata.</p>
    */
  var SamplingRuleRecord: js.UndefOr[_UnmarshalledSamplingRuleRecord] = js.undefined
}

object UpdateSamplingRuleOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, SamplingRuleRecord: _UnmarshalledSamplingRuleRecord = null): UpdateSamplingRuleOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (SamplingRuleRecord != null) __obj.updateDynamic("SamplingRuleRecord")(SamplingRuleRecord.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSamplingRuleOutput]
  }
}

