package typings.awsSdkClientXrayNode.typesGetSamplingTargetsOutputMod

import typings.awsSdkClientXrayNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientXrayNode.typesSamplingTargetDocumentMod.UnmarshalledSamplingTargetDocument
import typings.awsSdkClientXrayNode.typesUnprocessedStatisticsMod.UnmarshalledUnprocessedStatistics
import typings.awsSdkTypes.responseMod.ResponseMetadata
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSamplingTargetsOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  /**
    * <p>The last time a user changed the sampling rule configuration. If the sampling rule configuration changed since the service last retrieved it, the service should call <a>GetSamplingRules</a> to get the latest version.</p>
    */
  var LastRuleModification: js.UndefOr[Date] = js.native
  /**
    * <p>Updated rules that the service should use to sample requests.</p>
    */
  var SamplingTargetDocuments: js.UndefOr[js.Array[UnmarshalledSamplingTargetDocument]] = js.native
  /**
    * <p>Information about <a>SamplingStatisticsDocument</a> that X-Ray could not process.</p>
    */
  var UnprocessedStatistics: js.UndefOr[js.Array[UnmarshalledUnprocessedStatistics]] = js.native
}

object GetSamplingTargetsOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): GetSamplingTargetsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSamplingTargetsOutput]
  }
  @scala.inline
  implicit class GetSamplingTargetsOutputOps[Self <: GetSamplingTargetsOutput] (val x: Self) extends AnyVal {
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
    def setLastRuleModification(value: Date): Self = this.set("LastRuleModification", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastRuleModification: Self = this.set("LastRuleModification", js.undefined)
    @scala.inline
    def setSamplingTargetDocumentsVarargs(value: UnmarshalledSamplingTargetDocument*): Self = this.set("SamplingTargetDocuments", js.Array(value :_*))
    @scala.inline
    def setSamplingTargetDocuments(value: js.Array[UnmarshalledSamplingTargetDocument]): Self = this.set("SamplingTargetDocuments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSamplingTargetDocuments: Self = this.set("SamplingTargetDocuments", js.undefined)
    @scala.inline
    def setUnprocessedStatisticsVarargs(value: UnmarshalledUnprocessedStatistics*): Self = this.set("UnprocessedStatistics", js.Array(value :_*))
    @scala.inline
    def setUnprocessedStatistics(value: js.Array[UnmarshalledUnprocessedStatistics]): Self = this.set("UnprocessedStatistics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnprocessedStatistics: Self = this.set("UnprocessedStatistics", js.undefined)
  }
  
}

