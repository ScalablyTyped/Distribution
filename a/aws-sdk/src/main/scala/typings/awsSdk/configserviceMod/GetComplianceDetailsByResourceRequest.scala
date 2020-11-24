package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetComplianceDetailsByResourceRequest extends js.Object {
  
  /**
    * Filters the results by compliance. The allowed values are COMPLIANT, NON_COMPLIANT, and NOT_APPLICABLE.
    */
  var ComplianceTypes: js.UndefOr[typings.awsSdk.configserviceMod.ComplianceTypes] = js.native
  
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * The ID of the AWS resource for which you want compliance information.
    */
  var ResourceId: BaseResourceId = js.native
  
  /**
    * The type of the AWS resource for which you want compliance information.
    */
  var ResourceType: StringWithCharLimit256 = js.native
}
object GetComplianceDetailsByResourceRequest {
  
  @scala.inline
  def apply(ResourceId: BaseResourceId, ResourceType: StringWithCharLimit256): GetComplianceDetailsByResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId.asInstanceOf[js.Any], ResourceType = ResourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetComplianceDetailsByResourceRequest]
  }
  
  @scala.inline
  implicit class GetComplianceDetailsByResourceRequestOps[Self <: GetComplianceDetailsByResourceRequest] (val x: Self) extends AnyVal {
    
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
    def setResourceId(value: BaseResourceId): Self = this.set("ResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceType(value: StringWithCharLimit256): Self = this.set("ResourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComplianceTypesVarargs(value: ComplianceType*): Self = this.set("ComplianceTypes", js.Array(value :_*))
    
    @scala.inline
    def setComplianceTypes(value: ComplianceTypes): Self = this.set("ComplianceTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComplianceTypes: Self = this.set("ComplianceTypes", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
