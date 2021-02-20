package typings.awsSdk.servicequotasMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetAssociationForServiceQuotaTemplateResponse extends StObject {
  
  /**
    * Specifies whether the template is ASSOCIATED or DISASSOCIATED. If the template is ASSOCIATED, then it requests service quota increases for all new accounts created in your organization. 
    */
  var ServiceQuotaTemplateAssociationStatus: js.UndefOr[typings.awsSdk.servicequotasMod.ServiceQuotaTemplateAssociationStatus] = js.native
}
object GetAssociationForServiceQuotaTemplateResponse {
  
  @scala.inline
  def apply(): GetAssociationForServiceQuotaTemplateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAssociationForServiceQuotaTemplateResponse]
  }
  
  @scala.inline
  implicit class GetAssociationForServiceQuotaTemplateResponseMutableBuilder[Self <: GetAssociationForServiceQuotaTemplateResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setServiceQuotaTemplateAssociationStatus(value: ServiceQuotaTemplateAssociationStatus): Self = StObject.set(x, "ServiceQuotaTemplateAssociationStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceQuotaTemplateAssociationStatusUndefined: Self = StObject.set(x, "ServiceQuotaTemplateAssociationStatus", js.undefined)
  }
}
