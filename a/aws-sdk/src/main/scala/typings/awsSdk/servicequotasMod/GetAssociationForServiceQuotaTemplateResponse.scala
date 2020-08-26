package typings.awsSdk.servicequotasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAssociationForServiceQuotaTemplateResponse extends js.Object {
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
  implicit class GetAssociationForServiceQuotaTemplateResponseOps[Self <: GetAssociationForServiceQuotaTemplateResponse] (val x: Self) extends AnyVal {
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
    def setServiceQuotaTemplateAssociationStatus(value: ServiceQuotaTemplateAssociationStatus): Self = this.set("ServiceQuotaTemplateAssociationStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceQuotaTemplateAssociationStatus: Self = this.set("ServiceQuotaTemplateAssociationStatus", js.undefined)
  }
  
}

