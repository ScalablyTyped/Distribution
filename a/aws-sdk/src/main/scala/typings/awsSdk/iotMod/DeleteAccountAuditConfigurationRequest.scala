package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteAccountAuditConfigurationRequest extends js.Object {
  
  /**
    * If true, all scheduled audits are deleted.
    */
  var deleteScheduledAudits: js.UndefOr[DeleteScheduledAudits] = js.native
}
object DeleteAccountAuditConfigurationRequest {
  
  @scala.inline
  def apply(): DeleteAccountAuditConfigurationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteAccountAuditConfigurationRequest]
  }
  
  @scala.inline
  implicit class DeleteAccountAuditConfigurationRequestOps[Self <: DeleteAccountAuditConfigurationRequest] (val x: Self) extends AnyVal {
    
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
    def setDeleteScheduledAudits(value: DeleteScheduledAudits): Self = this.set("deleteScheduledAudits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleteScheduledAudits: Self = this.set("deleteScheduledAudits", js.undefined)
  }
}
