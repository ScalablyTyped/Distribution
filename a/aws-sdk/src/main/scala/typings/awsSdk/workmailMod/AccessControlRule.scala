package typings.awsSdk.workmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccessControlRule extends js.Object {
  /**
    * Access protocol actions to include in the rule. Valid values include ActiveSync, AutoDiscover, EWS, IMAP, SMTP, WindowsOutlook, and WebMail.
    */
  var Actions: js.UndefOr[ActionsList] = js.native
  /**
    * The date that the rule was created.
    */
  var DateCreated: js.UndefOr[Timestamp] = js.native
  /**
    * The date that the rule was modified.
    */
  var DateModified: js.UndefOr[Timestamp] = js.native
  /**
    * The rule description.
    */
  var Description: js.UndefOr[AccessControlRuleDescription] = js.native
  /**
    * The rule effect.
    */
  var Effect: js.UndefOr[AccessControlRuleEffect] = js.native
  /**
    * IPv4 CIDR ranges to include in the rule.
    */
  var IpRanges: js.UndefOr[IpRangeList] = js.native
  /**
    * The rule name.
    */
  var Name: js.UndefOr[AccessControlRuleName] = js.native
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
    * User IDs to include in the rule.
    */
  var UserIds: js.UndefOr[UserIdList] = js.native
}

object AccessControlRule {
  @scala.inline
  def apply(
    Actions: ActionsList = null,
    DateCreated: Timestamp = null,
    DateModified: Timestamp = null,
    Description: AccessControlRuleDescription = null,
    Effect: AccessControlRuleEffect = null,
    IpRanges: IpRangeList = null,
    Name: AccessControlRuleName = null,
    NotActions: ActionsList = null,
    NotIpRanges: IpRangeList = null,
    NotUserIds: UserIdList = null,
    UserIds: UserIdList = null
  ): AccessControlRule = {
    val __obj = js.Dynamic.literal()
    if (Actions != null) __obj.updateDynamic("Actions")(Actions.asInstanceOf[js.Any])
    if (DateCreated != null) __obj.updateDynamic("DateCreated")(DateCreated.asInstanceOf[js.Any])
    if (DateModified != null) __obj.updateDynamic("DateModified")(DateModified.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (Effect != null) __obj.updateDynamic("Effect")(Effect.asInstanceOf[js.Any])
    if (IpRanges != null) __obj.updateDynamic("IpRanges")(IpRanges.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (NotActions != null) __obj.updateDynamic("NotActions")(NotActions.asInstanceOf[js.Any])
    if (NotIpRanges != null) __obj.updateDynamic("NotIpRanges")(NotIpRanges.asInstanceOf[js.Any])
    if (NotUserIds != null) __obj.updateDynamic("NotUserIds")(NotUserIds.asInstanceOf[js.Any])
    if (UserIds != null) __obj.updateDynamic("UserIds")(UserIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessControlRule]
  }
}

