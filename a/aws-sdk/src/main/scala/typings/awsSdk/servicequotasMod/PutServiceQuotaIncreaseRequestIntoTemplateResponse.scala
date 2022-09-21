package typings.awsSdk.servicequotasMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutServiceQuotaIncreaseRequestIntoTemplateResponse extends StObject {
  
  /**
    * Information about the quota increase request.
    */
  var ServiceQuotaIncreaseRequestInTemplate: js.UndefOr[typings.awsSdk.servicequotasMod.ServiceQuotaIncreaseRequestInTemplate] = js.undefined
}
object PutServiceQuotaIncreaseRequestIntoTemplateResponse {
  
  inline def apply(): PutServiceQuotaIncreaseRequestIntoTemplateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutServiceQuotaIncreaseRequestIntoTemplateResponse]
  }
  
  extension [Self <: PutServiceQuotaIncreaseRequestIntoTemplateResponse](x: Self) {
    
    inline def setServiceQuotaIncreaseRequestInTemplate(value: ServiceQuotaIncreaseRequestInTemplate): Self = StObject.set(x, "ServiceQuotaIncreaseRequestInTemplate", value.asInstanceOf[js.Any])
    
    inline def setServiceQuotaIncreaseRequestInTemplateUndefined: Self = StObject.set(x, "ServiceQuotaIncreaseRequestInTemplate", js.undefined)
  }
}
