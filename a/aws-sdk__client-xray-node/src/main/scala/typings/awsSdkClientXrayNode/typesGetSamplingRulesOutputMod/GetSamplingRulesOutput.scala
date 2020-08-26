package typings.awsSdkClientXrayNode.typesGetSamplingRulesOutputMod

import typings.awsSdkClientXrayNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientXrayNode.typesSamplingRuleRecordMod.UnmarshalledSamplingRuleRecord
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSamplingRulesOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  /**
    * <p>Pagination token. Not used.</p>
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * <p>Rule definitions and metadata.</p>
    */
  var SamplingRuleRecords: js.UndefOr[js.Array[UnmarshalledSamplingRuleRecord]] = js.native
}

object GetSamplingRulesOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): GetSamplingRulesOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSamplingRulesOutput]
  }
  @scala.inline
  implicit class GetSamplingRulesOutputOps[Self <: GetSamplingRulesOutput] (val x: Self) extends AnyVal {
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
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setSamplingRuleRecordsVarargs(value: UnmarshalledSamplingRuleRecord*): Self = this.set("SamplingRuleRecords", js.Array(value :_*))
    @scala.inline
    def setSamplingRuleRecords(value: js.Array[UnmarshalledSamplingRuleRecord]): Self = this.set("SamplingRuleRecords", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSamplingRuleRecords: Self = this.set("SamplingRuleRecords", js.undefined)
  }
  
}

