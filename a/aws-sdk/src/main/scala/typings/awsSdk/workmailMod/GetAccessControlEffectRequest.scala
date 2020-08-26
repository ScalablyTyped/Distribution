package typings.awsSdk.workmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAccessControlEffectRequest extends js.Object {
  /**
    * The access protocol action. Valid values include ActiveSync, AutoDiscover, EWS, IMAP, SMTP, WindowsOutlook, and WebMail.
    */
  var Action: AccessControlRuleAction = js.native
  /**
    * The IPv4 address.
    */
  var IpAddress: typings.awsSdk.workmailMod.IpAddress = js.native
  /**
    * The identifier for the organization.
    */
  var OrganizationId: typings.awsSdk.workmailMod.OrganizationId = js.native
  /**
    * The user ID.
    */
  var UserId: WorkMailIdentifier = js.native
}

object GetAccessControlEffectRequest {
  @scala.inline
  def apply(
    Action: AccessControlRuleAction,
    IpAddress: IpAddress,
    OrganizationId: OrganizationId,
    UserId: WorkMailIdentifier
  ): GetAccessControlEffectRequest = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], IpAddress = IpAddress.asInstanceOf[js.Any], OrganizationId = OrganizationId.asInstanceOf[js.Any], UserId = UserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAccessControlEffectRequest]
  }
  @scala.inline
  implicit class GetAccessControlEffectRequestOps[Self <: GetAccessControlEffectRequest] (val x: Self) extends AnyVal {
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
    def setAction(value: AccessControlRuleAction): Self = this.set("Action", value.asInstanceOf[js.Any])
    @scala.inline
    def setIpAddress(value: IpAddress): Self = this.set("IpAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrganizationId(value: OrganizationId): Self = this.set("OrganizationId", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserId(value: WorkMailIdentifier): Self = this.set("UserId", value.asInstanceOf[js.Any])
  }
  
}

