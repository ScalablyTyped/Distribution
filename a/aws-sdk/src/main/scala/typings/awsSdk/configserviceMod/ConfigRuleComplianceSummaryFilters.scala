package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigRuleComplianceSummaryFilters extends js.Object {
  /**
    * The 12-digit account ID of the source account.
    */
  var AccountId: js.UndefOr[typings.awsSdk.configserviceMod.AccountId] = js.native
  /**
    * The source region where the data is aggregated.
    */
  var AwsRegion: js.UndefOr[typings.awsSdk.configserviceMod.AwsRegion] = js.native
}

object ConfigRuleComplianceSummaryFilters {
  @scala.inline
  def apply(): ConfigRuleComplianceSummaryFilters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigRuleComplianceSummaryFilters]
  }
  @scala.inline
  implicit class ConfigRuleComplianceSummaryFiltersOps[Self <: ConfigRuleComplianceSummaryFilters] (val x: Self) extends AnyVal {
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
    def setAccountId(value: AccountId): Self = this.set("AccountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountId: Self = this.set("AccountId", js.undefined)
    @scala.inline
    def setAwsRegion(value: AwsRegion): Self = this.set("AwsRegion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAwsRegion: Self = this.set("AwsRegion", js.undefined)
  }
  
}

