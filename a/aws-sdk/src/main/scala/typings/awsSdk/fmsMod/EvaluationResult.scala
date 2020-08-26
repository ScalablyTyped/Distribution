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
  def apply(): EvaluationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EvaluationResult]
  }
  @scala.inline
  implicit class EvaluationResultOps[Self <: EvaluationResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setComplianceStatus(value: PolicyComplianceStatusType): Self = this.set("ComplianceStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComplianceStatus: Self = this.set("ComplianceStatus", js.undefined)
    @scala.inline
    def setEvaluationLimitExceeded(value: Boolean): Self = this.set("EvaluationLimitExceeded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvaluationLimitExceeded: Self = this.set("EvaluationLimitExceeded", js.undefined)
    @scala.inline
    def setViolatorCount(value: ResourceCount): Self = this.set("ViolatorCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViolatorCount: Self = this.set("ViolatorCount", js.undefined)
  }
  
}

