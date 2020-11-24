package typings.awsSdk.fmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetComplianceDetailResponse extends js.Object {
  
  /**
    * Information about the resources and the policy that you specified in the GetComplianceDetail request.
    */
  var PolicyComplianceDetail: js.UndefOr[typings.awsSdk.fmsMod.PolicyComplianceDetail] = js.native
}
object GetComplianceDetailResponse {
  
  @scala.inline
  def apply(): GetComplianceDetailResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetComplianceDetailResponse]
  }
  
  @scala.inline
  implicit class GetComplianceDetailResponseOps[Self <: GetComplianceDetailResponse] (val x: Self) extends AnyVal {
    
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
    def setPolicyComplianceDetail(value: PolicyComplianceDetail): Self = this.set("PolicyComplianceDetail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicyComplianceDetail: Self = this.set("PolicyComplianceDetail", js.undefined)
  }
}
