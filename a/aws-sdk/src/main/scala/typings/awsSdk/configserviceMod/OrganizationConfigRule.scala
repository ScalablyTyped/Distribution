package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrganizationConfigRule extends js.Object {
  /**
    * A comma-separated list of accounts excluded from organization config rule.
    */
  var ExcludedAccounts: js.UndefOr[typings.awsSdk.configserviceMod.ExcludedAccounts] = js.native
  /**
    * The timestamp of the last update.
    */
  var LastUpdateTime: js.UndefOr[Date] = js.native
  /**
    * Amazon Resource Name (ARN) of organization config rule.
    */
  var OrganizationConfigRuleArn: StringWithCharLimit256 = js.native
  /**
    * The name that you assign to organization config rule.
    */
  var OrganizationConfigRuleName: typings.awsSdk.configserviceMod.OrganizationConfigRuleName = js.native
  /**
    * An OrganizationCustomRuleMetadata object.
    */
  var OrganizationCustomRuleMetadata: js.UndefOr[typings.awsSdk.configserviceMod.OrganizationCustomRuleMetadata] = js.native
  /**
    * An OrganizationManagedRuleMetadata object.
    */
  var OrganizationManagedRuleMetadata: js.UndefOr[typings.awsSdk.configserviceMod.OrganizationManagedRuleMetadata] = js.native
}

object OrganizationConfigRule {
  @scala.inline
  def apply(
    OrganizationConfigRuleArn: StringWithCharLimit256,
    OrganizationConfigRuleName: OrganizationConfigRuleName
  ): OrganizationConfigRule = {
    val __obj = js.Dynamic.literal(OrganizationConfigRuleArn = OrganizationConfigRuleArn.asInstanceOf[js.Any], OrganizationConfigRuleName = OrganizationConfigRuleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrganizationConfigRule]
  }
  @scala.inline
  implicit class OrganizationConfigRuleOps[Self <: OrganizationConfigRule] (val x: Self) extends AnyVal {
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
    def setOrganizationConfigRuleArn(value: StringWithCharLimit256): Self = this.set("OrganizationConfigRuleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrganizationConfigRuleName(value: OrganizationConfigRuleName): Self = this.set("OrganizationConfigRuleName", value.asInstanceOf[js.Any])
    @scala.inline
    def setExcludedAccountsVarargs(value: AccountId*): Self = this.set("ExcludedAccounts", js.Array(value :_*))
    @scala.inline
    def setExcludedAccounts(value: ExcludedAccounts): Self = this.set("ExcludedAccounts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExcludedAccounts: Self = this.set("ExcludedAccounts", js.undefined)
    @scala.inline
    def setLastUpdateTime(value: Date): Self = this.set("LastUpdateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastUpdateTime: Self = this.set("LastUpdateTime", js.undefined)
    @scala.inline
    def setOrganizationCustomRuleMetadata(value: OrganizationCustomRuleMetadata): Self = this.set("OrganizationCustomRuleMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrganizationCustomRuleMetadata: Self = this.set("OrganizationCustomRuleMetadata", js.undefined)
    @scala.inline
    def setOrganizationManagedRuleMetadata(value: OrganizationManagedRuleMetadata): Self = this.set("OrganizationManagedRuleMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrganizationManagedRuleMetadata: Self = this.set("OrganizationManagedRuleMetadata", js.undefined)
  }
  
}

