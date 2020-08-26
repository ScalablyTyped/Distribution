package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateWorkforceRequest extends js.Object {
  /**
    * Use this parameter to update your OIDC Identity Provider (IdP) configuration for a workforce made using your own IdP.
    */
  var OidcConfig: js.UndefOr[typings.awsSdk.sagemakerMod.OidcConfig] = js.native
  /**
    * A list of one to ten worker IP address ranges (CIDRs) that can be used to access tasks assigned to this workforce. Maximum: Ten CIDR values
    */
  var SourceIpConfig: js.UndefOr[typings.awsSdk.sagemakerMod.SourceIpConfig] = js.native
  /**
    * The name of the private workforce whose access you want to restrict. WorkforceName is automatically set to default when a workforce is created and cannot be modified. 
    */
  var WorkforceName: typings.awsSdk.sagemakerMod.WorkforceName = js.native
}

object UpdateWorkforceRequest {
  @scala.inline
  def apply(WorkforceName: WorkforceName): UpdateWorkforceRequest = {
    val __obj = js.Dynamic.literal(WorkforceName = WorkforceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateWorkforceRequest]
  }
  @scala.inline
  implicit class UpdateWorkforceRequestOps[Self <: UpdateWorkforceRequest] (val x: Self) extends AnyVal {
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
    def setWorkforceName(value: WorkforceName): Self = this.set("WorkforceName", value.asInstanceOf[js.Any])
    @scala.inline
    def setOidcConfig(value: OidcConfig): Self = this.set("OidcConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOidcConfig: Self = this.set("OidcConfig", js.undefined)
    @scala.inline
    def setSourceIpConfig(value: SourceIpConfig): Self = this.set("SourceIpConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceIpConfig: Self = this.set("SourceIpConfig", js.undefined)
  }
  
}

