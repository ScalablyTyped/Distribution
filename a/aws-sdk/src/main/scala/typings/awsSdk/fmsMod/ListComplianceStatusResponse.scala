package typings.awsSdk.fmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListComplianceStatusResponse extends js.Object {
  /**
    * If you have more PolicyComplianceStatus objects than the number that you specified for MaxResults in the request, the response includes a NextToken value. To list more PolicyComplianceStatus objects, submit another ListComplianceStatus request, and specify the NextToken value from the response in the NextToken value in the next request.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * An array of PolicyComplianceStatus objects.
    */
  var PolicyComplianceStatusList: js.UndefOr[typings.awsSdk.fmsMod.PolicyComplianceStatusList] = js.native
}

object ListComplianceStatusResponse {
  @scala.inline
  def apply(): ListComplianceStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListComplianceStatusResponse]
  }
  @scala.inline
  implicit class ListComplianceStatusResponseOps[Self <: ListComplianceStatusResponse] (val x: Self) extends AnyVal {
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
    def setNextToken(value: PaginationToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setPolicyComplianceStatusListVarargs(value: PolicyComplianceStatus*): Self = this.set("PolicyComplianceStatusList", js.Array(value :_*))
    @scala.inline
    def setPolicyComplianceStatusList(value: PolicyComplianceStatusList): Self = this.set("PolicyComplianceStatusList", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolicyComplianceStatusList: Self = this.set("PolicyComplianceStatusList", js.undefined)
  }
  
}

