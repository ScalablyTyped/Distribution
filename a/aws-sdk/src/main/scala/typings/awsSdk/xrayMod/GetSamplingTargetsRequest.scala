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
}

