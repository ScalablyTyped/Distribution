package typings.awsSdkClientXrayNode.typesCreateSamplingRuleOutputMod

import typings.awsSdkClientXrayNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientXrayNode.typesSamplingRuleRecordMod.UnmarshalledSamplingRuleRecord
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateSamplingRuleOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>The saved rule definition and metadata.</p>
    */
  var SamplingRuleRecord: js.UndefOr[UnmarshalledSamplingRuleRecord] = js.undefined
}

object CreateSamplingRuleOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, SamplingRuleRecord: UnmarshalledSamplingRuleRecord = null): CreateSamplingRuleOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (SamplingRuleRecord != null) __obj.updateDynamic("SamplingRuleRecord")(SamplingRuleRecord.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSamplingRuleOutput]
  }
}

