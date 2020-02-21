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
}

