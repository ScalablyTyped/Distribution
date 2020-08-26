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
  def apply(): AccessControlRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessControlRule]
  }
  @scala.inline
  implicit class AccessControlRuleOps[Self <: AccessControlRule] (val x: Self) extends AnyVal {
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
    def setActionsVarargs(value: AccessControlRuleAction*): Self = this.set("Actions", js.Array(value :_*))
    @scala.inline
    def setActions(value: ActionsList): Self = this.set("Actions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActions: Self = this.set("Actions", js.undefined)
    @scala.inline
    def setDateCreated(value: Timestamp): Self = this.set("DateCreated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDateCreated: Self = this.set("DateCreated", js.undefined)
    @scala.inline
    def setDateModified(value: Timestamp): Self = this.set("DateModified", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDateModified: Self = this.set("DateModified", js.undefined)
    @scala.inline
    def setDescription(value: AccessControlRuleDescription): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setEffect(value: AccessControlRuleEffect): Self = this.set("Effect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEffect: Self = this.set("Effect", js.undefined)
    @scala.inline
    def setIpRangesVarargs(value: IpRange*): Self = this.set("IpRanges", js.Array(value :_*))
    @scala.inline
    def setIpRanges(value: IpRangeList): Self = this.set("IpRanges", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIpRanges: Self = this.set("IpRanges", js.undefined)
    @scala.inline
    def setName(value: AccessControlRuleName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
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

