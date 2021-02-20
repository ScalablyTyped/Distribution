package typings.awsSdk.servicequotasMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutServiceQuotaIncreaseRequestIntoTemplateResponse extends StObject {
  
  /**
    * A structure that contains information about one service quota increase request.
    */
  var ServiceQuotaIncreaseRequestInTemplate: js.UndefOr[typings.awsSdk.servicequotasMod.ServiceQuotaIncreaseRequestInTemplate] = js.native
}
object PutServiceQuotaIncreaseRequestIntoTemplateResponse {
  
  @scala.inline
  def apply(): PutServiceQuotaIncreaseRequestIntoTemplateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutServiceQuotaIncreaseRequestIntoTemplateResponse]
  }
  
  @scala.inline
  implicit class PutServiceQuotaIncreaseRequestIntoTemplateResponseMutableBuilder[Self <: PutServiceQuotaIncreaseRequestIntoTemplateResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setServiceQuotaIncreaseRequestInTemplate(value: ServiceQuotaIncreaseRequestInTemplate): Self = StObject.set(x, "ServiceQuotaIncreaseRequestInTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceQuotaIncreaseRequestInTemplateUndefined: Self = StObject.set(x, "ServiceQuotaIncreaseRequestInTemplate", js.undefined)
  }
}
