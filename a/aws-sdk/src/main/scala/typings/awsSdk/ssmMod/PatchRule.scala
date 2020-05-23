package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PatchRule extends js.Object {
  /**
    * The number of days after the release date of each patch matched by the rule that the patch is marked as approved in the patch baseline. For example, a value of 7 means that patches are approved seven days after they are released. Not supported on Ubuntu Server.
    */
  var ApproveAfterDays: js.UndefOr[typings.awsSdk.ssmMod.ApproveAfterDays] = js.native
  /**
    * The cutoff date for auto approval of released patches. Any patches released on or before this date are installed automatically. Not supported on Ubuntu Server. Enter dates in the format YYYY-MM-DD. For example, 2020-12-31.
    */
  var ApproveUntilDate: js.UndefOr[PatchStringDateTime] = js.native
  /**
    * A compliance severity level for all approved patches in a patch baseline.
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
    PatchFilterGroup: PatchFilterGroup,
    ApproveAfterDays: js.UndefOr[ApproveAfterDays] = js.undefined,
    ApproveUntilDate: PatchStringDateTime = null,
    ComplianceLevel: PatchComplianceLevel = null,
    EnableNonSecurity: js.UndefOr[Boolean] = js.undefined
  ): PatchRule = {
    val __obj = js.Dynamic.literal(PatchFilterGroup = PatchFilterGroup.asInstanceOf[js.Any])
    if (!js.isUndefined(ApproveAfterDays)) __obj.updateDynamic("ApproveAfterDays")(ApproveAfterDays.get.asInstanceOf[js.Any])
    if (ApproveUntilDate != null) __obj.updateDynamic("ApproveUntilDate")(ApproveUntilDate.asInstanceOf[js.Any])
    if (ComplianceLevel != null) __obj.updateDynamic("ComplianceLevel")(ComplianceLevel.asInstanceOf[js.Any])
    if (!js.isUndefined(EnableNonSecurity)) __obj.updateDynamic("EnableNonSecurity")(EnableNonSecurity.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatchRule]
  }
}

