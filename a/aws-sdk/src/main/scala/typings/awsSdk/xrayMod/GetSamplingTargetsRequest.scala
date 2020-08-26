package typings.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSamplingTargetsRequest extends js.Object {
  /**
    * Information about rules that the service is using to sample requests.
    */
  var SamplingStatisticsDocuments: SamplingStatisticsDocumentList = js.native
}

object GetSamplingTargetsRequest {
  @scala.inline
  def apply(SamplingStatisticsDocuments: SamplingStatisticsDocumentList): GetSamplingTargetsRequest = {
    val __obj = js.Dynamic.literal(SamplingStatisticsDocuments = SamplingStatisticsDocuments.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSamplingTargetsRequest]
  }
  @scala.inline
  implicit class GetSamplingTargetsRequestOps[Self <: GetSamplingTargetsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSamplingStatisticsDocumentsVarargs(value: SamplingStatisticsDocument*): Self = this.set("SamplingStatisticsDocuments", js.Array(value :_*))
    @scala.inline
    def setSamplingStatisticsDocuments(value: SamplingStatisticsDocumentList): Self = this.set("SamplingStatisticsDocuments", value.asInstanceOf[js.Any])
  }
  
}

