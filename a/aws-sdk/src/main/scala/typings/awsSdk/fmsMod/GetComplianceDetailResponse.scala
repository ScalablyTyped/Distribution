package typings.awsSdk.fmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetComplianceDetailResponse extends StObject {
  
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
  implicit class GetComplianceDetailResponseMutableBuilder[Self <: GetComplianceDetailResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPolicyComplianceDetail(value: PolicyComplianceDetail): Self = StObject.set(x, "PolicyComplianceDetail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyComplianceDetailUndefined: Self = StObject.set(x, "PolicyComplianceDetail", js.undefined)
  }
}
