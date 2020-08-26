package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AggregateComplianceByConfigRule extends js.Object {
  /**
    * The 12-digit account ID of the source account.
    */
  var AccountId: js.UndefOr[typings.awsSdk.configserviceMod.AccountId] = js.native
  /**
    * The source region from where the data is aggregated.
    */
  var AwsRegion: js.UndefOr[typings.awsSdk.configserviceMod.AwsRegion] = js.native
  /**
    * Indicates whether an AWS resource or AWS Config rule is compliant and provides the number of contributors that affect the compliance.
    */
  var Compliance: js.UndefOr[typings.awsSdk.configserviceMod.Compliance] = js.native
  /**
    * The name of the AWS Config rule.
    */
  var ConfigRuleName: js.UndefOr[typings.awsSdk.configserviceMod.ConfigRuleName] = js.native
}

object AggregateComplianceByConfigRule {
  @scala.inline
  def apply(): AggregateComplianceByConfigRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregateComplianceByConfigRule]
  }
  @scala.inline
  implicit class AggregateComplianceByConfigRuleOps[Self <: AggregateComplianceByConfigRule] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setCompliance(value: Compliance): Self = this.set("Compliance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompliance: Self = this.set("Compliance", js.undefined)
    @scala.inline
    def setConfigRuleName(value: ConfigRuleName): Self = this.set("ConfigRuleName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfigRuleName: Self = this.set("ConfigRuleName", js.undefined)
  }
  
}

