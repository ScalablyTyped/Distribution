package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PatchRule extends js.Object {
  /**
    * The number of days after the release date of each patch matched by the rule that the patch is marked as approved in the patch baseline. For example, a value of 7 means that patches are approved seven days after they are released. 
    */
  var ApproveAfterDays: typings.awsSdk.ssmMod.ApproveAfterDays = js.native
  /**
    * A compliance severity level for all approved patches in a patch baseline. Valid compliance severity levels include the following: Unspecified, Critical, High, Medium, Low, and Informational.
    */
  var ComplianceLevel: js.UndefOr[PatchComplianceLevel] = js.native
  /**
    * For instances identified by the approval rule filters, enables a patch baseline to apply non-security updates available in the specified repository. The default value is 'false'. Applies to Linux instances only.
    */
  var EnableNonSecurity: js.UndefOr[Boolean] = js.native
  /**
    * The patch filter group that defines the criteria for the rule.
    */
  var PatchFilterGroup: typings.awsSdk.ssmMod.PatchFilterGroup = js.native
}

object PatchRule {
  @scala.inline
  def apply(
    ApproveAfterDays: ApproveAfterDays,
    PatchFilterGroup: PatchFilterGroup,
    ComplianceLevel: PatchComplianceLevel = null,
    EnableNonSecurity: js.UndefOr[scala.Boolean] = js.undefined
  ): PatchRule = {
    val __obj = js.Dynamic.literal(ApproveAfterDays = ApproveAfterDays.asInstanceOf[js.Any], PatchFilterGroup = PatchFilterGroup.asInstanceOf[js.Any])
    if (ComplianceLevel != null) __obj.updateDynamic("ComplianceLevel")(ComplianceLevel.asInstanceOf[js.Any])
    if (!js.isUndefined(EnableNonSecurity)) __obj.updateDynamic("EnableNonSecurity")(EnableNonSecurity.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatchRule]
  }
}

