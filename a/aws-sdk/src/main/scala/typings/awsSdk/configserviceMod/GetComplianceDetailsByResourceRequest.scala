package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetComplianceDetailsByResourceRequest extends StObject {
  
  /**
    * Filters the results by compliance. The allowed values are COMPLIANT, NON_COMPLIANT, and NOT_APPLICABLE.
    */
  var ComplianceTypes: js.UndefOr[typings.awsSdk.configserviceMod.ComplianceTypes] = js.undefined
  
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the AWS resource for which you want compliance information.
    */
  var ResourceId: BaseResourceId
  
  /**
    * The type of the AWS resource for which you want compliance information.
    */
  var ResourceType: StringWithCharLimit256
}
object GetComplianceDetailsByResourceRequest {
  
  @scala.inline
  def apply(ResourceId: BaseResourceId, ResourceType: StringWithCharLimit256): GetComplianceDetailsByResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId.asInstanceOf[js.Any], ResourceType = ResourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetComplianceDetailsByResourceRequest]
  }
  
  @scala.inline
  implicit class GetComplianceDetailsByResourceRequestMutableBuilder[Self <: GetComplianceDetailsByResourceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplianceTypes(value: ComplianceTypes): Self = StObject.set(x, "ComplianceTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComplianceTypesUndefined: Self = StObject.set(x, "ComplianceTypes", js.undefined)
    
    @scala.inline
    def setComplianceTypesVarargs(value: ComplianceType*): Self = StObject.set(x, "ComplianceTypes", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setResourceId(value: BaseResourceId): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceType(value: StringWithCharLimit256): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
  }
}
