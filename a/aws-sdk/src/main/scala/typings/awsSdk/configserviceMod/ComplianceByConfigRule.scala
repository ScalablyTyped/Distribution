package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComplianceByConfigRule extends js.Object {
  /**
    * Indicates whether the AWS Config rule is compliant.
    */
  var Compliance: js.UndefOr[typings.awsSdk.configserviceMod.Compliance] = js.native
  /**
    * The name of the AWS Config rule.
    */
  var ConfigRuleName: js.UndefOr[StringWithCharLimit64] = js.native
}

object ComplianceByConfigRule {
  @scala.inline
  def apply(Compliance: Compliance = null, ConfigRuleName: StringWithCharLimit64 = null): ComplianceByConfigRule = {
    val __obj = js.Dynamic.literal()
    if (Compliance != null) __obj.updateDynamic("Compliance")(Compliance.asInstanceOf[js.Any])
    if (ConfigRuleName != null) __obj.updateDynamic("ConfigRuleName")(ConfigRuleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComplianceByConfigRule]
  }
}

