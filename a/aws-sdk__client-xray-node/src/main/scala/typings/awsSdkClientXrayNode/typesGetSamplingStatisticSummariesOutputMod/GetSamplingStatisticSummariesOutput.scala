package typings.awsSdkClientXrayNode.typesGetSamplingStatisticSummariesOutputMod

import typings.awsSdkClientXrayNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientXrayNode.typesSamplingStatisticSummaryMod.UnmarshalledSamplingStatisticSummary
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSamplingStatisticSummariesOutput extends OutputTypesUnion {
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
    * <p>Information about the number of requests instrumented for each sampling rule.</p>
    */
  var SamplingStatisticSummaries: js.UndefOr[js.Array[UnmarshalledSamplingStatisticSummary]] = js.native
}

object GetSamplingStatisticSummariesOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): GetSamplingStatisticSummariesOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSamplingStatisticSummariesOutput]
  }
  @scala.inline
  implicit class GetSamplingStatisticSummariesOutputOps[Self <: GetSamplingStatisticSummariesOutput] (val x: Self) extends AnyVal {
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
    def setSamplingStatisticSummariesVarargs(value: UnmarshalledSamplingStatisticSummary*): Self = this.set("SamplingStatisticSummaries", js.Array(value :_*))
    @scala.inline
    def setSamplingStatisticSummaries(value: js.Array[UnmarshalledSamplingStatisticSummary]): Self = this.set("SamplingStatisticSummaries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSamplingStatisticSummaries: Self = this.set("SamplingStatisticSummaries", js.undefined)
  }
  
}

