package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAggregateComplianceDetailsByConfigRuleRequest extends js.Object {
  /**
    * The 12-digit account ID of the source account.
    */
  var AccountId: typings.awsSdk.configserviceMod.AccountId = js.native
  /**
    * The source region from where the data is aggregated.
    */
  var AwsRegion: typings.awsSdk.configserviceMod.AwsRegion = js.native
  /**
    * The resource compliance status.  For the GetAggregateComplianceDetailsByConfigRuleRequest data type, AWS Config supports only the COMPLIANT and NON_COMPLIANT. AWS Config does not support the NOT_APPLICABLE and INSUFFICIENT_DATA values. 
    */
  var ComplianceType: js.UndefOr[typings.awsSdk.configserviceMod.ComplianceType] = js.native
  /**
    * The name of the AWS Config rule for which you want compliance information.
    */
  var ConfigRuleName: typings.awsSdk.configserviceMod.ConfigRuleName = js.native
  /**
    * The name of the configuration aggregator.
    */
  var ConfigurationAggregatorName: typings.awsSdk.configserviceMod.ConfigurationAggregatorName = js.native
  /**
    * The maximum number of evaluation results returned on each page. The default is 50. You cannot specify a number greater than 100. If you specify 0, AWS Config uses the default.
    */
  var Limit: js.UndefOr[typings.awsSdk.configserviceMod.Limit] = js.native
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[typings.awsSdk.configserviceMod.NextToken] = js.native
}

object GetAggregateComplianceDetailsByConfigRuleRequest {
  @scala.inline
  def apply(
    AccountId: AccountId,
    AwsRegion: AwsRegion,
    ConfigRuleName: ConfigRuleName,
    ConfigurationAggregatorName: ConfigurationAggregatorName
  ): GetAggregateComplianceDetailsByConfigRuleRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], AwsRegion = AwsRegion.asInstanceOf[js.Any], ConfigRuleName = ConfigRuleName.asInstanceOf[js.Any], ConfigurationAggregatorName = ConfigurationAggregatorName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAggregateComplianceDetailsByConfigRuleRequest]
  }
  @scala.inline
  implicit class GetAggregateComplianceDetailsByConfigRuleRequestOps[Self <: GetAggregateComplianceDetailsByConfigRuleRequest] (val x: Self) extends AnyVal {
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
    def setAwsRegion(value: AwsRegion): Self = this.set("AwsRegion", value.asInstanceOf[js.Any])
    @scala.inline
    def setConfigRuleName(value: ConfigRuleName): Self = this.set("ConfigRuleName", value.asInstanceOf[js.Any])
    @scala.inline
    def setConfigurationAggregatorName(value: ConfigurationAggregatorName): Self = this.set("ConfigurationAggregatorName", value.asInstanceOf[js.Any])
    @scala.inline
    def setComplianceType(value: ComplianceType): Self = this.set("ComplianceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComplianceType: Self = this.set("ComplianceType", js.undefined)
    @scala.inline
    def setLimit(value: Limit): Self = this.set("Limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit: Self = this.set("Limit", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

