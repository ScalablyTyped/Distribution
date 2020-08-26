package typings.awsSdkClientXrayNode.typesUpdateSamplingRuleOutputMod

import typings.awsSdkClientXrayNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientXrayNode.typesSamplingRuleRecordMod.UnmarshalledSamplingRuleRecord
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateSamplingRuleOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  /**
    * <p>The updated rule definition and metadata.</p>
    */
  var SamplingRuleRecord: js.UndefOr[UnmarshalledSamplingRuleRecord] = js.native
}

object UpdateSamplingRuleOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): UpdateSamplingRuleOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSamplingRuleOutput]
  }
  @scala.inline
  implicit class UpdateSamplingRuleOutputOps[Self <: UpdateSamplingRuleOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set$metadata(value: ResponseMetadata): Self = this.set("$metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setSamplingRuleRecord(value: UnmarshalledSamplingRuleRecord): Self = this.set("SamplingRuleRecord", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSamplingRuleRecord: Self = this.set("SamplingRuleRecord", js.undefined)
  }
  
}

