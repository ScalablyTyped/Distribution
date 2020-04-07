package typings.awsSdkClientXrayNode.typesGetSamplingRulesOutputMod

import typings.awsSdkClientXrayNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientXrayNode.typesSamplingRuleRecordMod.UnmarshalledSamplingRuleRecord
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSamplingRulesOutput extends OutputTypesUnion {
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
    * <p>Rule definitions and metadata.</p>
    */
  var SamplingRuleRecords: js.UndefOr[js.Array[UnmarshalledSamplingRuleRecord]] = js.undefined
}

object GetSamplingRulesOutput {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    NextToken: String = null,
    SamplingRuleRecords: js.Array[UnmarshalledSamplingRuleRecord] = null
  ): GetSamplingRulesOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (SamplingRuleRecords != null) __obj.updateDynamic("SamplingRuleRecords")(SamplingRuleRecords.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSamplingRulesOutput]
  }
}

