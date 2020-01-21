package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeComplianceByConfigRuleRequest extends js.Object {
  /**
    * Filters the results by compliance. The allowed values are COMPLIANT and NON_COMPLIANT.
    */
  var ComplianceTypes: js.UndefOr[typings.awsSdk.configserviceMod.ComplianceTypes] = js.native
  /**
    * Specify one or more AWS Config rule names to filter the results by rule.
    */
  var ConfigRuleNames: js.UndefOr[typings.awsSdk.configserviceMod.ConfigRuleNames] = js.native
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object DescribeComplianceByConfigRuleRequest {
  @scala.inline
  def apply(
    ComplianceTypes: ComplianceTypes = null,
    ConfigRuleNames: ConfigRuleNames = null,
    NextToken: String = null
  ): DescribeComplianceByConfigRuleRequest = {
    val __obj = js.Dynamic.literal()
    if (ComplianceTypes != null) __obj.updateDynamic("ComplianceTypes")(ComplianceTypes.asInstanceOf[js.Any])
    if (ConfigRuleNames != null) __obj.updateDynamic("ConfigRuleNames")(ConfigRuleNames.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeComplianceByConfigRuleRequest]
  }
}

