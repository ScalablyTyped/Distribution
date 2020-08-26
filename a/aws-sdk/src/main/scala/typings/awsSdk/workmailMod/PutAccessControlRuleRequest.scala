package typings.awsSdk.workmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutAccessControlRuleRequest extends js.Object {
  /**
    * Access protocol actions to include in the rule. Valid values include ActiveSync, AutoDiscover, EWS, IMAP, SMTP, WindowsOutlook, and WebMail.
    */
  var Actions: js.UndefOr[ActionsList] = js.native
  /**
    * The rule description.
    */
  var Description: AccessControlRuleDescription = js.native
  /**
    * The rule effect.
    */
  var Effect: AccessControlRuleEffect = js.native
  /**
    * IPv4 CIDR ranges to include in the rule.
    */
  var IpRanges: js.UndefOr[IpRangeList] = js.native
  /**
    * The rule name.
    */
  var Name: AccessControlRuleName = js.native
  /**
    * Access protocol actions to exclude from the rule. Valid values include ActiveSync, AutoDiscover, EWS, IMAP, SMTP, WindowsOutlook, and WebMail.
    */
  var NotActions: js.UndefOr[ActionsList] = js.native
  /**
    * IPv4 CIDR ranges to exclude from the rule.
    */
  var NotIpRanges: js.UndefOr[IpRangeList] = js.native
  /**
    * User IDs to exclude from the rule.
    */
  var NotUserIds: js.UndefOr[UserIdList] = js.native
  /**
    * The identifier of the organization.
    */
  var OrganizationId: typings.awsSdk.workmailMod.OrganizationId = js.native
  /**
    * User IDs to include in the rule.
    */
  var UserIds: js.UndefOr[UserIdList] = js.native
}

object PutAccessControlRuleRequest {
  @scala.inline
  def apply(
    Description: AccessControlRuleDescription,
    Effect: AccessControlRuleEffect,
    Name: AccessControlRuleName,
    OrganizationId: OrganizationId
  ): PutAccessControlRuleRequest = {
    val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], Effect = Effect.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], OrganizationId = OrganizationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutAccessControlRuleRequest]
  }
  @scala.inline
  implicit class PutAccessControlRuleRequestOps[Self <: PutAccessControlRuleRequest] (val x: Self) extends AnyVal {
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
    def setDescription(value: AccessControlRuleDescription): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def setEffect(value: AccessControlRuleEffect): Self = this.set("Effect", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: AccessControlRuleName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrganizationId(value: OrganizationId): Self = this.set("OrganizationId", value.asInstanceOf[js.Any])
    @scala.inline
    def setActionsVarargs(value: AccessControlRuleAction*): Self = this.set("Actions", js.Array(value :_*))
    @scala.inline
    def setActions(value: ActionsList): Self = this.set("Actions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActions: Self = this.set("Actions", js.undefined)
    @scala.inline
    def setIpRangesVarargs(value: IpRange*): Self = this.set("IpRanges", js.Array(value :_*))
    @scala.inline
    def setIpRanges(value: IpRangeList): Self = this.set("IpRanges", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIpRanges: Self = this.set("IpRanges", js.undefined)
    @scala.inline
    def setNotActionsVarargs(value: AccessControlRuleAction*): Self = this.set("NotActions", js.Array(value :_*))
    @scala.inline
    def setNotActions(value: ActionsList): Self = this.set("NotActions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotActions: Self = this.set("NotActions", js.undefined)
    @scala.inline
    def setNotIpRangesVarargs(value: IpRange*): Self = this.set("NotIpRanges", js.Array(value :_*))
    @scala.inline
    def setNotIpRanges(value: IpRangeList): Self = this.set("NotIpRanges", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotIpRanges: Self = this.set("NotIpRanges", js.undefined)
    @scala.inline
    def setNotUserIdsVarargs(value: WorkMailIdentifier*): Self = this.set("NotUserIds", js.Array(value :_*))
    @scala.inline
    def setNotUserIds(value: UserIdList): Self = this.set("NotUserIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotUserIds: Self = this.set("NotUserIds", js.undefined)
    @scala.inline
    def setUserIdsVarargs(value: WorkMailIdentifier*): Self = this.set("UserIds", js.Array(value :_*))
    @scala.inline
    def setUserIds(value: UserIdList): Self = this.set("UserIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserIds: Self = this.set("UserIds", js.undefined)
  }
  
}

