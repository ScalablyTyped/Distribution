package typings.awsSdk.fmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EvaluationResult extends js.Object {
  /**
    * Describes an AWS account's compliance with the AWS Firewall Manager policy.
    */
  var ComplianceStatus: js.UndefOr[PolicyComplianceStatusType] = js.native
  /**
    * Indicates that over 100 resources are noncompliant with the AWS Firewall Manager policy.
    */
  var EvaluationLimitExceeded: js.UndefOr[Boolean] = js.native
  /**
    * The number of resources that are noncompliant with the specified policy. For AWS WAF and Shield Advanced policies, a resource is considered noncompliant if it is not associated with the policy. For security group policies, a resource is considered noncompliant if it doesn't comply with the rules of the policy and remediation is disabled or not possible.
    */
  var ViolatorCount: js.UndefOr[ResourceCount] = js.native
}

object EvaluationResult {
  @scala.inline
  def apply(
    ComplianceStatus: PolicyComplianceStatusType = null,
    EvaluationLimitExceeded: js.UndefOr[Boolean] = js.undefined,
    ViolatorCount: js.UndefOr[ResourceCount] = js.undefined
  ): EvaluationResult = {
    val __obj = js.Dynamic.literal()
    if (ComplianceStatus != null) __obj.updateDynamic("ComplianceStatus")(ComplianceStatus.asInstanceOf[js.Any])
    if (!js.isUndefined(EvaluationLimitExceeded)) __obj.updateDynamic("EvaluationLimitExceeded")(EvaluationLimitExceeded.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ViolatorCount)) __obj.updateDynamic("ViolatorCount")(ViolatorCount.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[EvaluationResult]
  }
}

