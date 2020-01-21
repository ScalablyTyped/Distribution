package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConformancePackComplianceFilters extends js.Object {
  /**
    * Filters the results by compliance. The allowed values are COMPLIANT and NON_COMPLIANT.
    */
  var ComplianceType: js.UndefOr[ConformancePackComplianceType] = js.native
  /**
    * Filters the results by AWS Config rule names.
    */
  var ConfigRuleNames: js.UndefOr[ConformancePackConfigRuleNames] = js.native
}

object ConformancePackComplianceFilters {
  @scala.inline
  def apply(
    ComplianceType: ConformancePackComplianceType = null,
    ConfigRuleNames: ConformancePackConfigRuleNames = null
  ): ConformancePackComplianceFilters = {
    val __obj = js.Dynamic.literal()
    if (ComplianceType != null) __obj.updateDynamic("ComplianceType")(ComplianceType.asInstanceOf[js.Any])
    if (ConfigRuleNames != null) __obj.updateDynamic("ConfigRuleNames")(ConfigRuleNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConformancePackComplianceFilters]
  }
}

