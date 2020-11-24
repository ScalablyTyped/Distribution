package typings.awsSdk.servicequotasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutServiceQuotaIncreaseRequestIntoTemplateResponse extends js.Object {
  
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
  implicit class PutServiceQuotaIncreaseRequestIntoTemplateResponseOps[Self <: PutServiceQuotaIncreaseRequestIntoTemplateResponse] (val x: Self) extends AnyVal {
    
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
    def setServiceQuotaIncreaseRequestInTemplate(value: ServiceQuotaIncreaseRequestInTemplate): Self = this.set("ServiceQuotaIncreaseRequestInTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceQuotaIncreaseRequestInTemplate: Self = this.set("ServiceQuotaIncreaseRequestInTemplate", js.undefined)
  }
}
