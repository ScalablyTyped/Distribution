package typings.awsSdk.servicequotasMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetServiceQuotaIncreaseRequestFromTemplateResponse extends StObject {
  
  /**
    * This object contains the details about the quota increase request.
    */
  var ServiceQuotaIncreaseRequestInTemplate: js.UndefOr[typings.awsSdk.servicequotasMod.ServiceQuotaIncreaseRequestInTemplate] = js.native
}
object GetServiceQuotaIncreaseRequestFromTemplateResponse {
  
  @scala.inline
  def apply(): GetServiceQuotaIncreaseRequestFromTemplateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetServiceQuotaIncreaseRequestFromTemplateResponse]
  }
  
  @scala.inline
  implicit class GetServiceQuotaIncreaseRequestFromTemplateResponseMutableBuilder[Self <: GetServiceQuotaIncreaseRequestFromTemplateResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setServiceQuotaIncreaseRequestInTemplate(value: ServiceQuotaIncreaseRequestInTemplate): Self = StObject.set(x, "ServiceQuotaIncreaseRequestInTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceQuotaIncreaseRequestInTemplateUndefined: Self = StObject.set(x, "ServiceQuotaIncreaseRequestInTemplate", js.undefined)
  }
}
