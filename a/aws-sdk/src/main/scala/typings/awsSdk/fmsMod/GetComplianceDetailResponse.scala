package typings.awsSdk.fmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetComplianceDetailResponse extends js.Object {
  /**
    * Information about the resources and the policy that you specified in the GetComplianceDetail request.
    */
  var PolicyComplianceDetail: js.UndefOr[typings.awsSdk.fmsMod.PolicyComplianceDetail] = js.native
}

object GetComplianceDetailResponse {
  @scala.inline
  def apply(PolicyComplianceDetail: PolicyComplianceDetail = null): GetComplianceDetailResponse = {
    val __obj = js.Dynamic.literal()
    if (PolicyComplianceDetail != null) __obj.updateDynamic("PolicyComplianceDetail")(PolicyComplianceDetail.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetComplianceDetailResponse]
  }
}

