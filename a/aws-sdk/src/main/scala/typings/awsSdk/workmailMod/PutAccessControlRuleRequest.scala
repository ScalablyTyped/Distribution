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
    OrganizationId: OrganizationId,
    Actions: ActionsList = null,
    IpRanges: IpRangeList = null,
    NotActions: ActionsList = null,
    NotIpRanges: IpRangeList = null,
    NotUserIds: UserIdList = null,
    UserIds: UserIdList = null
  ): PutAccessControlRuleRequest = {
    val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], Effect = Effect.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], OrganizationId = OrganizationId.asInstanceOf[js.Any])
    if (Actions != null) __obj.updateDynamic("Actions")(Actions.asInstanceOf[js.Any])
    if (IpRanges != null) __obj.updateDynamic("IpRanges")(IpRanges.asInstanceOf[js.Any])
    if (NotActions != null) __obj.updateDynamic("NotActions")(NotActions.asInstanceOf[js.Any])
    if (NotIpRanges != null) __obj.updateDynamic("NotIpRanges")(NotIpRanges.asInstanceOf[js.Any])
    if (NotUserIds != null) __obj.updateDynamic("NotUserIds")(NotUserIds.asInstanceOf[js.Any])
    if (UserIds != null) __obj.updateDynamic("UserIds")(UserIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutAccessControlRuleRequest]
  }
}

